package com.example.pc1dbp.User;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequestDTO {

    @NotBlank (message = "El nombre de usuario es obligatorio")
    private String username;

    @Email (message = "El formato es incorrecto")
    @NotBlank(message = "El email es obligatorio")
    private String email;


    @NotBlank(message = "La contraseña es obligatoria")
    private String password;

}
