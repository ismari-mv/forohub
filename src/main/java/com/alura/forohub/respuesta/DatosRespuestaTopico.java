package com.alura.forohub.respuesta;

import com.alura.forohub.topico.Topico;
import com.alura.forohub.usuario.DatosUsuario;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        String mensaje,
        Topico topico,
        LocalDateTime fechaCreacion,
        DatosUsuario autor
) {
}
