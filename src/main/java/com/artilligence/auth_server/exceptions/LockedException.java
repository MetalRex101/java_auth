package com.artilligence.auth_server.exceptions;

public class LockedException extends RuntimeException {
    public LockedException(String message) {
        super(message);
    }
}
