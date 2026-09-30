package com.example.pc1dbp.User;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserResponeDTO {

    private  Long id;

    private String username;

    @Email
    private String email;
    
}
