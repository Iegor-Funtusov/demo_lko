package com.example.demo_lko.entity.user;

import com.example.demo_lko.entity.AbstractEntity;
import com.example.demo_lko.type.RoleType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Iehor Funtusov, created 29/12/2020 - 8:25 AM
 */

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_TYPE", nullable = false)
    private RoleType roleType;

    @Column(name = "ENABLED", nullable = false)
    private Boolean enabled;

    public User() {
        super();
        this.enabled = true;
    }
}
