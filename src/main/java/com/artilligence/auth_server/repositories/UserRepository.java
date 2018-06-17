package com.artilligence.auth_server.repositories;

import com.artilligence.auth_server.domains.Email;
import com.artilligence.auth_server.domains.User;
import com.artilligence.auth_server.exceptions.LockedException;
import com.artilligence.auth_server.exceptions.NotFoundException;
import com.artilligence.auth_server.exceptions.StatusFailedDependency;
import com.artilligence.auth_server.services.PasswordHasher;
import com.artilligence.auth_server.tables.Emails;
import com.artilligence.auth_server.tables.Passwords;
import com.artilligence.auth_server.tables.Users;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    @Autowired
    private DSLContext dsl;

    @Autowired
    private PasswordHasher passwordHasher;

    @Autowired
    private EmailRepository emailRepository;

    public User getByEmailAndPassword(String emailAddress, String password, Boolean hashed) {
        if (hashed) {
            password = passwordHasher.toMD5(password);
        }

        com.artilligence.auth_server.tables.pojos.Users pojo = dsl.select(Users.USERS.fields())
                .from(Users.USERS)
                .join(Emails.EMAILS)
                .on(Users.USERS.ID.equal(Emails.EMAILS.USER_ID))
                .join(Passwords.PASSWORDS)
                .on(Users.USERS.ID.equal(Passwords.PASSWORDS.ID))
                .where(Emails.EMAILS.EMAIL.equal(emailAddress))
                .and(Passwords.PASSWORDS.PASSWORD.equal(password))
                .fetchOne().into(com.artilligence.auth_server.tables.pojos.Users.class);

        if (pojo == null) {
            throw new NotFoundException("User not found");
        }

        Email email = emailRepository.getDefaultEmailByUserId(pojo.getId());

        if (!email.confirmed()) {
            throw new StatusFailedDependency("Email address not confirmed");
        }

        if (email.blocked()) {
            throw new LockedException("User is blocked. Please contact site administrator");
        }

        return new User(pojo);
    }
}
