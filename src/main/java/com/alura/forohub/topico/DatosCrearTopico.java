package com.alura.forohub.topico;

import com.alura.forohub.curso.Curso;
import com.alura.forohub.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public record DatosCrearTopico (
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @DateTimeFormat
        LocalDateTime fechaCreacion,
        @NotNull
        Usuario autor,
        @NotNull
        Curso curso

){
}
