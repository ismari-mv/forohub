package com.alura.forohub.usuario;

import com.alura.forohub.perfil.Perfil;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record DatosUsuario(
        @NotBlank
        String nombre,
        @Email
        String email,
        @NotNull
        String contrasena,
        List<Perfil> perfiles
)
{
}
