package com.alura.forohub.topico;

import com.alura.forohub.curso.Curso;
import com.alura.forohub.curso.DatosCurso;
import com.alura.forohub.usuario.DatosUsuario;
import com.alura.forohub.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosObtenerTopicoId(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion, EstadoTopico status, DatosUsuario autor, DatosCurso curso) {

    public DatosObtenerTopicoId(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getStatus(),
                new DatosUsuario(topico.getAutor()),
                new DatosCurso(topico.getCurso()));
    }
}
