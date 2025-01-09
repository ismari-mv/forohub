package com.alura.forohub.controller;


import com.alura.forohub.dto.GenericResponseDto;
import com.alura.forohub.usuario.DatosUsuario;
import com.alura.forohub.usuario.Usuario;
import com.alura.forohub.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<GenericResponseDto> insertUsuario (@RequestBody @Valid DatosUsuario crearUsuario,
                                                             UriComponentsBuilder uriComponentsBuilder){

        Usuario usuarioGuardado = usuarioRepository.save(new Usuario(crearUsuario));
        URI uri = uriComponentsBuilder.path("/usuario/{id}").buildAndExpand(usuarioGuardado.getId()).toUri();

        return ResponseEntity.created(uri).body(new GenericResponseDto("Operacion Exitosa", "Perfil creado exitosamente"));
    }

    @GetMapping ("/{id}")
    public ResponseEntity<DatosUsuario> retornaDatosUsuario (@PathVariable Long id){
        Usuario usuarioConsulta = usuarioRepository.getReferenceById(id);
        return ResponseEntity.ok(new DatosUsuario(usuarioConsulta.getNombre(),usuarioConsulta.getEmail(),
                usuarioConsulta.getContrasena(),usuarioConsulta.getPerfiles()));
    }

    @DeleteMapping ("/{id}")
    @Transactional
    public  ResponseEntity<GenericResponseDto> eliminarUsuario (@PathVariable  @NotNull Long id){
        usuarioRepository.deleteById(id);
        return ResponseEntity.ok().body(new GenericResponseDto("Operacion Exitosa", String.format("Usuario %s eliminado exitosamente",id)));
    }




}