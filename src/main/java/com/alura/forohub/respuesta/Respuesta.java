package com.alura.forohub.respuesta;

import com.alura.forohub.topico.Topico;
import com.alura.forohub.usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "respuesta")

public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensaje;

    private LocalDateTime fechaCreacion;

    private Boolean solucion;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;


    public Respuesta(Long id, String mensaje, LocalDateTime fechaCreacion, Boolean solucion, Topico topico, Usuario autor) {
        this.id = id;
        this.mensaje = mensaje;
        this.fechaCreacion = fechaCreacion;
        this.solucion = solucion;
        this.topico = topico;
        this.autor = autor;
    }

    public Respuesta (DatosRespuestaTopico datosRespuestaTopico){
        this.mensaje= datosRespuestaTopico.mensaje();
        this.fechaCreacion= datosRespuestaTopico.fechaCreacion();
        this.solucion= datosRespuestaTopico.solucion();
        this.topico= new Topico();
        this.topico.setId(datosRespuestaTopico.idTopico());
        this.autor= new Usuario();
        this.autor.setId(datosRespuestaTopico.idAutor());
    }

}
