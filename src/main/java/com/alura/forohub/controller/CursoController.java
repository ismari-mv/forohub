package com.alura.forohub.controller;


import com.alura.forohub.curso.DatosCurso;
import com.alura.forohub.dto.GenericResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/cursos")


public class CursoController {


    @PostMapping
    public ResponseEntity<GenericResponseDto> postCurso(@RequestBody DatosCurso datosCurso, UriComponentsBuilder uri){
        return ResponseEntity.ok()
                .body(new GenericResponseDto("Operacion Exitosa", "Curso creado exitosamente"));
    }

}
