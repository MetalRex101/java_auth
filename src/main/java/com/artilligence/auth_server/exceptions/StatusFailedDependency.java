package com.artilligence.auth_server.exceptions;

public class StatusFailedDependency extends RuntimeException {
    public StatusFailedDependency(String message) {
        super(message);
    }
}