package com.alura.forohub.controller;


import com.alura.forohub.perfil.DatosCrearPerfil;
import com.alura.forohub.perfil.Perfil;
import com.alura.forohub.perfil.PerfilRepository;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

//@RestController
//@RequestMapping("/perfiles")
//
//public class PerfilController {
//
//    private PerfilRepository perfilRepository;
//
//    public PerfilController(PerfilRepository perfilRepository) {
//        this.perfilRepository = perfilRepository;
//    }

//    @PostMapping
//    public ResponseEntity<DatosCrearPerfil> crearPerfil (@RequestBody @Valid DatosCrearPerfil crearPerfil,
//                                                         UriComponentsBuilder uriComponentsBuilder){
//
//        Perfil perfil = new Perfil(crearPerfil.nombre(), crearPerfil.contrasena(),crearPerfil.email());
//        Perfil perfilGuardado = perfilRepository.save(perfil);
//        URI uri = uriComponentsBuilder.path("/perfiles/{id}").buildAndExpand(perfilGuardado.getId()).toUri();
//
//        // Devolver respuesta con estado 201 (Created) y la URI del recurso creado
//        return ResponseEntity.created(uri).body(new DatosCrearPerfil(perfilGuardado.getNombre(), perfilGuardado.getId(),perfilGuardado.getUsuario(),perfilGuardado));
//    }
//    }
