package com.alura.forohub.topico;
import com.alura.forohub.curso.Curso;
import com.alura.forohub.respuesta.Respuesta;
import com.alura.forohub.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "topicos")

public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensaje;

    private LocalDateTime fechaCreacion;

    private String status;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Respuesta> respuestas;


    public  Topico(DatosCrearTopico datosCrearTopico){
        this.titulo = datosCrearTopico.titulo();
        this.mensaje = datosCrearTopico.mensaje();
        this.fechaCreacion = LocalDateTime.now();
        this.status = EstadoTopico.NO_RESUELTO.toString();
        this.autor = datosCrearTopico.autor();
        this.curso = datosCrearTopico.curso();
    }

    public void actualizarTopico (DatosActualizarTopico datosActualizarTopico){
        if(datosActualizarTopico.titulo()!=null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.mensaje()!=null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if(datosActualizarTopico.fechaCreacion()!=null){
            this.fechaCreacion = datosActualizarTopico.fechaCreacion();
        }
    }


}


