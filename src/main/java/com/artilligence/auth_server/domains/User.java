package com.artilligence.auth_server.domains;

import com.artilligence.auth_server.tables.pojos.Users;
import com.artilligence.auth_server.tables.records.UsersRecord;
import org.jooq.impl.TableRecordImpl;

public class User extends Domain {
    public User(Users pojo) {
        super(pojo);
    }

    @Override
    public Users getPojo() {
        return (Users) pojo;
    }
}
