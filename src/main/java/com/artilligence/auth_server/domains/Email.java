package com.artilligence.auth_server.domains;

import com.artilligence.auth_server.tables.pojos.Emails;

public class Email extends Domain {
    public Email(Emails pojo) {
        super(pojo);
    }

    @Override
    public Emails getPojo() {
        return (Emails) pojo;
    }

    public Boolean isDefault() {
        return this.getPojo().getIsDefault().intValue() == 1;
    }

    public Boolean confirmed() {
        return this.getPojo().getConfirmDate() != null;
    }

    public Boolean blocked() {
        return this.getPojo().getStatus().intValue() == 0;
    }
}
