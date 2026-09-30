package com.example.pc1dbp.User;


import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private  Long id;

    private String username;

    @Email
    private String email;

    private String password;

    private String role;

}
