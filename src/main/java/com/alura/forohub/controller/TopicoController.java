package com.alura.forohub.controller;


import com.alura.forohub.topico.DatosCrearTopico;
import com.alura.forohub.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping ("/crear")
    public ResponseEntity<DatosCrearTopico> crear(@RequestBody @Valid DatosCrearTopico topico) {

    }
}
