package com.alura.forohub.controller;



import com.alura.forohub.dto.GenericResponseDto;
import com.alura.forohub.topico.*;
import com.alura.forohub.usuario.DatosUsuario;
import com.alura.forohub.usuario.UsuarioRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topicos")
@SecurityRequirement(name = "bearer-key")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;
//Crear un nuevo topico
    @PostMapping
    public ResponseEntity<GenericResponseDto> registrarTopico(@RequestBody @Valid DatosCrearTopico datosCrearTopico,
                                                              UriComponentsBuilder uriComponentsBuilder) {
        Topico crearTopico = topicoRepository.save(new Topico(datosCrearTopico));
        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(crearTopico.getId()).toUri();
        return ResponseEntity.created(url).body(new GenericResponseDto("Operación exitosa","Topico creado exitosamente"));
    }
//Mostrar topico especifico por id
    @GetMapping ("/{id}")
    public ResponseEntity<DatosObtenerTopicoId> retornaDatosTopico (@PathVariable Long id){
        Topico respuestasTopico = topicoRepository.getReferenceById(id);
        System.out.println(respuestasTopico.toString());
        DatosObtenerTopicoId response = new DatosObtenerTopicoId(respuestasTopico);
        return ResponseEntity.ok(new DatosObtenerTopicoId(respuestasTopico));
    }
//actualizar un topico
    @PutMapping  ("/{id}")
    @Transactional
    public  ResponseEntity<DatosActualizarTopico> datosTopico (@PathVariable Long id, @RequestBody @Valid DatosActualizarTopico actualizarTopico){
        Topico topico = topicoRepository.getReferenceById(id);
        topico.actualizarTopico(actualizarTopico);
        return ResponseEntity.ok(actualizarTopico);
    }
//eliminar un topico
    @DeleteMapping ("/{id}")
    @Transactional
    public ResponseEntity eliminarTopico (@PathVariable @NotNull Long id){
        Topico topico= topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
        return ResponseEntity.noContent().build();
    }
//Mostrar todos los topicos creados
    @GetMapping
    public ResponseEntity<List<DatosObtenerTopicoId>> retornaTodosLosTopicos() {
        List<Topico> topicos = topicoRepository.findAll();
        List<DatosObtenerTopicoId> response = topicos.stream()
                .map(DatosObtenerTopicoId::new)
                .toList();
        return ResponseEntity.ok(response); // Devuelve la lista como respuesta
    }

}

