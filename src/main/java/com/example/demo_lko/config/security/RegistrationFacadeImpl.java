package com.example.demo_lko.config.security;

import com.example.demo_lko.entity.user.Personal;
import com.example.demo_lko.service.PersonalService;
import org.springframework.stereotype.Service;

@Service
public class RegistrationFacadeImpl implements RegistrationFacade {

    private final PersonalService personalService;

    public RegistrationFacadeImpl(PersonalService personalService) {
        this.personalService = personalService;
    }

    @Override
    public void registration(AuthData authData) {
        Personal personal = new Personal();
        personal.setEmail(authData.getEmail());
        personal.setPassword(authData.getPassword());
        personalService.create(personal);
    }
}
