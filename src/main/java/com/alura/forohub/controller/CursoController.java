package com.alura.forohub.controller;


import com.alura.forohub.curso.CursoRepository;
import com.alura.forohub.curso.DatosCurso;
import com.alura.forohub.dto.GenericResponseDto;
import com.alura.forohub.topico.DatosCrearTopico;
import com.alura.forohub.topico.DatosRespuestaTopico;
import com.alura.forohub.topico.Topico;
import com.alura.forohub.topico.TopicoRepository;
import com.alura.forohub.usuario.DatosUsuario;
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
@RequestMapping("/cursos")


public class CursoController {


    @PostMapping
    public ResponseEntity<GenericResponseDto> postCurso(@RequestBody DatosCurso datosCurso, UriComponentsBuilder uri){
        return ResponseEntity.ok()
                .body(new GenericResponseDto("Operacion Exitosa", "Curso creado exitosamente"));
    }

}
