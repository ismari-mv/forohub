package com.alura.forohub.perfil;

import com.alura.forohub.usuario.Usuario;
import jakarta.persistence.*;

@Entity
@Table (name = "perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}

