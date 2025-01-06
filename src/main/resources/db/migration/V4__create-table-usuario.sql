CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,      -- Llave primaria
    nombre VARCHAR(255) NOT NULL,              -- Nombre del usuario
    email VARCHAR(255) UNIQUE NOT NULL,        -- Correo único y obligatorio
    contrasena VARCHAR(255) NOT NULL           -- Contraseña del usuario
);


