package com.artilligence.auth_server.domains;

import com.artilligence.auth_server.exceptions.ForbiddenException;
import com.artilligence.auth_server.tables.pojos.OauthClients;
import org.springframework.web.server.NotAcceptableStatusException;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OauthClient extends Domain {
    public OauthClient(OauthClients record) {
        super(record);
    }

    public OauthClients getPojo() {
        return (OauthClients) pojo;
    }

    public void hisUrl(String url) throws NotAcceptableStatusException {
        String message = "Given url doesn't belongs to client";

        try {
            Boolean equals = new URL(getPojo().getUrl()).equals(new URL(url));

            if (!equals) {
                throw new NotAcceptableStatusException(message);
            }
        } catch (MalformedURLException e) {
            throw new NotAcceptableStatusException(message);
        }
    }

    public void hasScopes(String[] scopes) {
        List<String> clientScopes = Arrays.asList(getPojo().getScope().split(","));
        Collections.sort(clientScopes);

        List<String> neededScopes = Arrays.asList(scopes);
        Collections.sort(neededScopes);

        if (Collections.indexOfSubList(clientScopes, neededScopes) == -1) {
            throw new ForbiddenException("Use of the function is forbidden");
        }
    }
}
