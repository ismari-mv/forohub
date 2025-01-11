package com.alura.forohub.usuario;

import com.alura.forohub.perfil.Perfil;

import java.util.List;

public record DatosDetalleUsuario(
        String nombre,
        String email,
        String contrasena,
        List<Perfil> perfiles
) {
    public DatosDetalleUsuario(Usuario usuario){
        this (
                usuario.getNombre(),
                usuario.getEmail(),
                usuario.getContrasena(),
                usuario.getPerfiles()
        );
    }
}