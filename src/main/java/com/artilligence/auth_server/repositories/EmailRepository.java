package com.artilligence.auth_server.repositories;

import com.artilligence.auth_server.domains.Email;
import com.artilligence.auth_server.tables.Emails;
import org.jooq.DSLContext;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailRepository {
    @Autowired
    private DSLContext dsl;

    public Email getDefaultEmailByUserId(UInteger userID) {
        com.artilligence.auth_server.tables.pojos.Emails pojo = dsl.select()
                .from(Emails.EMAILS)
                .where(Emails.EMAILS.USER_ID.equal(userID))
                .and(Emails.EMAILS.IS_DEFAULT.isTrue())
                .fetchOne().into(com.artilligence.auth_server.tables.pojos.Emails.class);

        if (pojo == null ) {
            return null;
        }

        return new Email(pojo);
    }
}
