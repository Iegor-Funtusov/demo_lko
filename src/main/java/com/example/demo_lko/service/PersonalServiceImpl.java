package com.example.demo_lko.service;

import com.example.demo_lko.entity.user.Personal;
import com.example.demo_lko.repository.user.PersonalRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonalServiceImpl implements PersonalService {

    private final PersonalRepository personalRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public PersonalServiceImpl(PersonalRepository personalRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.personalRepository = personalRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public Personal findByEmail(String email) {
        return personalRepository.findByEmail(email);
    }

    @Override
    @PreAuthorize("hasRole('ROLE_PERSONAL')")
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void create(Personal personal) {
        if (personalRepository.existsByEmail(personal.getEmail())) {
            throw new RuntimeException("user exist");
        }
        personal.setPassword(bCryptPasswordEncoder.encode(personal.getPassword()));
        personalRepository.save(personal);
    }
}
