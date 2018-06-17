package com.artilligence.auth_server.services;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class PasswordHasher {
    public String toMD5 (String password) {
        return DigestUtils.md5Hex(password);
    }
}
