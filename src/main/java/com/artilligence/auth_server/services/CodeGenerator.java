package com.artilligence.auth_server.services;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;
import java.util.Random;

@Component("CodeGenerator")
public class CodeGenerator {
    public String getRandomCode() {
        return RandomStringUtils.random(128, true, true);
    }
}
