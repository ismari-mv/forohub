package com.alura.forohub.topico;

import com.alura.forohub.curso.Curso;
import com.alura.forohub.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosObtenerTopicoId(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion, Usuario autor, Curso curso) {

    public DatosObtenerTopicoId(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getAutor(),
                topico.getCurso());
    }
}
