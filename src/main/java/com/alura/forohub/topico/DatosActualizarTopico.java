package com.alura.forohub.topico;

import com.alura.forohub.curso.Curso;
import com.alura.forohub.curso.DatosCurso;
import com.alura.forohub.usuario.DatosUsuario;
import com.alura.forohub.usuario.Usuario;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarTopico(
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        @NotNull Usuario autor,
        @NotNull Curso curso
        ) {
}
