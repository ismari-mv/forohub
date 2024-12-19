package com.alura.forohub.topico;

import java.time.LocalDateTime;

public record DatosActualizarTopico(
        String titulo,

        String mensaje,

        LocalDateTime fechaCreacion
) {

    public DatosActualizarTopico (Topico topico){
        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion());
    }
}
