//package com.alura.forohub.topico;
//
//import com.alura.forohub.curso.Curso;
//import com.alura.forohub.curso.DatosCurso;
//import com.alura.forohub.usuario.DatosUsuario;
//import com.alura.forohub.usuario.Usuario;
//import jakarta.validation.constraints.NotBlank;
//
//import java.time.LocalDateTime;
//
//public record DatosListadoTopico(
//        @NotBlank
//        String titulo,
//        @NotBlank
//        DatosCurso curso,
//        @NotBlank
//        @NotBlank
//        DatosUsuario autor,
//        @NotBlank
//        LocalDateTime fechaCreacion,
//        @NotBlank
//        EstadoTopico status
//) {
//
//    public DatosListadoTopico (Topico topico){
//        this(
//                topico.getTitulo(),
//                new DatosCurso(
//                        topico.getCurso().getId(),
//                        topico.getCurso().getNombre(),
//                        topico.getCurso().getCategoria()),
//                new DatosUsuario(
//                        topico.getAutor()));
//    }
//}
