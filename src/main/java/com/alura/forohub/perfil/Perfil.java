package com.alura.forohub.perfil;

import jakarta.persistence.*;

@Entity
@Table
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}

