package com.Task.models;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="profiles")
public class User {

    @Id
    @SequenceGenerator(name="profilesIdSeq", sequenceName = "profiles_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profilesIdSeq")
    private Long id;

    @Size(min = 2, max = 50)
    private String name;
    @Size(min = 2, max = 50)
    private String secondName;
    @Size(min = 2, max = 50)
    private String email;
    @Size(min = 2, max = 50)
    private String role;
    @Size(min = 13, max = 13)
    private String mobile;

    public User(String name, String second_name, String email, String role, String mobile) {
        this.name = name;
        this.secondName = second_name;
        this.email = email;
        this.role = role;
        this.mobile = mobile;
    }
}
