package com.alura.forohub.usuario;

public record DatosUsuario(
        Long id,
        String nombre,
        String email,
        String contrasena,
        String perfil
)
{
}
