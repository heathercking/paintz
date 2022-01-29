package com.codeclan.example.paintzServer.configs.security;

public class JwtProperties {

    public static final String SECRET = "Heather123";
    public static final int EXPIRATION_TIME = 1000000; // approx 16 minutes
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";

}
