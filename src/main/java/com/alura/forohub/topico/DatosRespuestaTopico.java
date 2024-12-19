package com.alura.forohub.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String mensaje,
        String topico,
        LocalDateTime fechaCreacion,
        String autor,
        Boolean solucion
) {
}
