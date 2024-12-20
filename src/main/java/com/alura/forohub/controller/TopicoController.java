package com.alura.forohub.controller;


import com.alura.forohub.curso.Curso;
import com.alura.forohub.curso.CursoRepository;
import com.alura.forohub.curso.DatosCurso;
import com.alura.forohub.topico.DatosCrearTopico;
import com.alura.forohub.topico.DatosRespuestaTopico;
import com.alura.forohub.topico.Topico;
import com.alura.forohub.topico.TopicoRepository;
import com.alura.forohub.usuario.DatosUsuario;
import com.alura.forohub.usuario.Usuario;
import com.alura.forohub.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topicos")


public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public ResponseEntity<DatosRespuestaTopico> registrarTopico(@RequestBody @Valid DatosCrearTopico datosCrearTopico,
                                                                UriComponentsBuilder uriComponentsBuilder) {
        Topico topico = topicoRepository.save(new Topico(datosCrearTopico));
        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getStatus(),
                new DatosUsuario(
                        topico.getAutor().getId(),
                        topico.getAutor().getNombre(),
                        topico.getAutor().getEmail()),
                new DatosCurso(
                        topico.getCurso().getId(),
                        topico.getCurso().getNombre()));
        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaTopico);
    }



}
