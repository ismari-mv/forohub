package com.alura.forohub.topico;

import com.alura.forohub.curso.Curso;
import com.alura.forohub.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosCrearTopico (
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Usuario autor,
        Curso curso

){
}
