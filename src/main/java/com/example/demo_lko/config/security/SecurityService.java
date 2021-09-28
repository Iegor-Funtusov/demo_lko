package com.example.demo_lko.config.security;

public interface SecurityService {

    boolean isAuthenticated();
    void autoLogin(String username, String password);
}
