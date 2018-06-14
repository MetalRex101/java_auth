package com.artilligence.auth_server.domains;

import com.artilligence.auth_server.tables.pojos.OauthSessions;

public class OauthSession extends Domain {
    public OauthSession(OauthSessions record) {
        super(record);
    }

    @Override
    public OauthSessions getPojo() {
        return (OauthSessions) pojo;
    }
}
