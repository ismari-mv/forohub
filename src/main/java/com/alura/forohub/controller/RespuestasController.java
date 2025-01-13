package com.alura.forohub.controller;


import com.alura.forohub.dto.GenericResponseDto;
import com.alura.forohub.respuesta.DatosRespuestaTopico;
import com.alura.forohub.respuesta.Respuesta;
import com.alura.forohub.respuesta.RespuestaRepository;
import com.alura.forohub.topico.TopicoRepository;
import com.alura.forohub.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/respuesta")
public class RespuestasController {

    @Autowired
    private RespuestaRepository respuestaRepository;

    @PostMapping
    public ResponseEntity<GenericResponseDto> responderTopico (@RequestBody @Valid DatosRespuestaTopico datosRespuestaTopico,
                                                               UriComponentsBuilder uriComponentsBuilder) {
        Respuesta crearRespuesta = respuestaRepository.save(new Respuesta(datosRespuestaTopico));
        URI url = uriComponentsBuilder.path("/respuesta/{id}").buildAndExpand(crearRespuesta.getId()).toUri();
        return ResponseEntity.created(url).body(new GenericResponseDto("Operacion exitosa","Repuesta creada con éxito"));
    }

    @GetMapping ("/{id}")
    public ResponseEntity<List<DatosRespuestaTopico>> retornaRespuestas (@PathVariable Long id){
        List<Respuesta> respuestas = respuestaRepository.findByIdTopico(id);
        List<DatosRespuestaTopico> response = respuestas.stream()
                .map(DatosRespuestaTopico::new).toList();
        return ResponseEntity.ok(response);
    }

}
