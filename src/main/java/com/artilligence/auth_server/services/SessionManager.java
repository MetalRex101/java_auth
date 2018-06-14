package com.artilligence.auth_server.services;

import com.artilligence.auth_server.domains.OauthClient;
import com.artilligence.auth_server.domains.OauthSession;
import com.artilligence.auth_server.domains.User;
import com.artilligence.auth_server.exceptions.UnauthorizedException;
import com.artilligence.auth_server.repositories.OauthSessionRepository;
import com.artilligence.auth_server.tables.OauthSessions;
import com.artilligence.auth_server.tables.records.OauthSessionsRecord;
import org.joda.time.DateTime;
import org.jooq.DSLContext;
import org.jooq.types.UInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class SessionManager {
    @Autowired
    private CodeGenerator codeGenerator;

    @Autowired
    private OauthSessionRepository repository;

    @Autowired
    private DSLContext dsl;

    public OauthSession startSession(OauthClient client, User user) {
        if (user == null) {
            throw new UnauthorizedException("Cannot start session for anonymous user");
        }

        try {
            OauthSession session = repository.findSessionByClientIDAndUserID(client.getPojo().getId(), user.getPojo().getId());

            dsl.newRecord(OauthSessions.OAUTH_SESSIONS, session.getPojo())
                    .setAccessExpiresAt(new Timestamp(new DateTime().plusMinutes(1).getMillis()))
                    .setCode(codeGenerator.getRandomCode())
                    .setAccessToken(null)
                    .update();

            return session;
        } catch (NullPointerException e) {
            OauthSessionsRecord record = dsl.newRecord(OauthSessions.OAUTH_SESSIONS, new OauthSessionsRecord()
                    .setClientId(client.getPojo().getId())
                    .setUserId(user.getPojo().getId()))
                    .setAccessExpiresAt(new Timestamp(new DateTime().plusMinutes(1).getMillis()))
                    .setCode(codeGenerator.getRandomCode())
                    .setAccessToken(null);
            record.store();

            com.artilligence.auth_server.tables.pojos.OauthSessions pojo = record.into(com.artilligence.auth_server.tables.pojos.OauthSessions.class);

            return new OauthSession(pojo);
        }
    }
}
