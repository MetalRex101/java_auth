package com.artilligence.auth_server.domains;

abstract class Domain {
    protected Object pojo;

    public Domain(Object record) {
        this.pojo = record;
    }

    abstract public Object getPojo();

    public Domain setPojo(Object pojo) {
        this.pojo = pojo;
        return this;
    }
}
