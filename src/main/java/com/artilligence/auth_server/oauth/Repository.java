package com.artilligence.auth_server.oauth;

import com.artilligence.auth_server.domains.OauthClient;
import com.artilligence.auth_server.exceptions.NotFoundException;
import com.artilligence.auth_server.tables.pojos.OauthClients;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Repository {
    @Autowired
    private DSLContext dsl;

    public OauthClient getClient(String clientId) throws NotFoundException {
        com.artilligence.auth_server.tables.OauthClients client =
                com.artilligence.auth_server.tables.OauthClients.OAUTH_CLIENTS;

        OauthClients oauthClientPojo = dsl.select().
                from(client).
                where(client.CLIENT_ID.equal(clientId)).
                and(client.STATUS.isTrue()).
                fetchOne().into(OauthClients.class);

        if (oauthClientPojo == null) {
            throw new NotFoundException("Client not found");
        }

        return new OauthClient(oauthClientPojo);
    }
}
