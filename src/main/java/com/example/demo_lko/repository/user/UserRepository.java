package com.example.demo_lko.repository.user;

import com.example.demo_lko.entity.user.User;
import com.example.demo_lko.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Iehor Funtusov, created 29/12/2020 - 8:31 AM
 */

@Repository
public interface UserRepository<U extends User> extends AbstractRepository<U> {

    U findByEmail(String email);
    boolean existsByEmail(String email);
}
