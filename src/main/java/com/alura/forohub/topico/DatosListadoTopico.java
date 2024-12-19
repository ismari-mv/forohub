package com.alura.forohub.topico;

import com.alura.forohub.curso.Curso;
import com.alura.forohub.usuario.Usuario;
import java.time.LocalDateTime;

public record DatosListadoTopico(
        Long id,
        String titulo,
        Curso curso,
        Usuario autor,
        LocalDateTime fechaCreacion,
        EstadoTopico status
) {

    public DatosListadoTopico (Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getCurso(),
                topico.getAutor(),
                topico.getFechaCreacion(),
                topico.getStatus());
    }
}
