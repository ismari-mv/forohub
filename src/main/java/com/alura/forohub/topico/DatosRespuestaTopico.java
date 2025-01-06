package com.alura.forohub.topico;

import com.alura.forohub.usuario.DatosUsuario;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String mensaje,
        String topico,
        LocalDateTime fechaCreacion,
        DatosUsuario autor,
        EstadoTopico solucion
) {
}
