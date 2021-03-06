package com.artilligence.auth_server.repositories;

import com.artilligence.auth_server.domains.OauthSession;
import com.artilligence.auth_server.tables.OauthSessions;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.types.UInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OauthSessionRepository {
    @Autowired
    private DSLContext dsl;

    public OauthSession findSessionByClientIDAndUserID(UInteger clientID, UInteger userID) {
         Record record =  dsl.select()
                 .from(OauthSessions.OAUTH_SESSIONS)
                 .where(OauthSessions.OAUTH_SESSIONS.CLIENT_ID.equal(clientID))
                 .and(OauthSessions.OAUTH_SESSIONS.USER_ID.equal(userID))
                 .fetchOne();

         if (record == null) {
             return new OauthSession(null);
         }

         com.artilligence.auth_server.tables.pojos.OauthSessions pojo =
                 record.into(com.artilligence.auth_server.tables.pojos.OauthSessions.class);

         return new OauthSession(pojo);
    }
}
