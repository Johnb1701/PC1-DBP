package com.example.pc1dbp.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserResponeDTO {

    @NotBlank
    private  Long id;

    @NotBlank
    private String username;

    @Email
    @NotBlank
    private String email;

}
