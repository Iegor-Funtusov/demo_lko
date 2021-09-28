package com.example.demo_lko.service;

import com.example.demo_lko.entity.user.Personal;

public interface PersonalService {

    Personal findByEmail(String email);
    void create(Personal personal);
}
