package com.example.demo_lko.config.security;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthData {

    private String email;
    private String password;
    private String passwordConfirm;
}
