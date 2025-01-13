package com.alura.forohub.topico.validaciones;

import com.alura.forohub.topico.DatosCrearTopico;
import com.alura.forohub.topico.Topico;
import com.alura.forohub.topico.TopicoRepository;
import com.alura.forohub.usuario.ValidacionException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ValidadorConsultaExistente {
    @Autowired
    private TopicoRepository repository;

    public void validar(List<Topico> lista){
        if(lista.isEmpty()){
            throw new EntityNotFoundException();
        }
    }
}
