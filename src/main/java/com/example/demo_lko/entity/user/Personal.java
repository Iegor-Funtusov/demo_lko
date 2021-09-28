package com.example.demo_lko.entity.user;

import com.example.demo_lko.type.RoleType;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Iehor Funtusov, created 29/12/2020 - 8:27 AM
 */

@Getter
@Setter
@Entity
@DiscriminatorValue("PERSONAL")
public class Personal extends User {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "BIRTH_DAY")
    private Date birthDay;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Transient
    private String fullName;

    @Transient
    private Integer age;

    public Personal() {
        super();
        setRoleType(RoleType.ROLE_PERSONAL);
    }
}
