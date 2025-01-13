package com.alura.forohub.topico.validaciones;

import com.alura.forohub.topico.DatosCrearTopico;
import com.alura.forohub.topico.TopicoRepository;
import com.alura.forohub.usuario.ValidacionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorDuplicadoTopicos {

    @Autowired
    private TopicoRepository repository;

    public void validar(DatosCrearTopico datos){
        var topicoDuplicado = repository.existsByTituloAndMensaje(datos.titulo(), datos.mensaje());
        if(topicoDuplicado){
            throw new ValidacionException("Titulo y mensaje duplicado, ingrese otros");
        }
    }
}
