package com.alura.forohub.usuario;

import com.alura.forohub.perfil.Perfil;

import java.util.List;

public record DatosUsuario(
        Long id,
        String nombre,
        String email,
        String contrasena,
        List<Perfil> perfiles
)
{
}
