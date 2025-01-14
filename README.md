# forohub
**ForoHub** 
es una aplicación de foro diseñada para facilitar la comunicación y discusión entre usuarios. Permite a los usuarios crear tópicos, responder a ellos y participar en discusiones de manera eficiente.

## Características

- **Registro y autenticación de usuarios**: Los usuarios pueden registrarse y autenticarse para participar en el foro.
- **Gestión de tópicos**: Creación, edición y eliminación de tópicos.
- **Respuestas**: Permite a los usuarios responder a tópicos existentes.
- **Listado de usuarios y tópicos**: Visualización de todos los usuarios y tópicos disponibles.
- **Autenticación mediante JWT**: Seguridad implementada con JSON Web Tokens.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Spring Boot 3**: Framework para la construcción de aplicaciones Java.
- **Spring Security**: Para la gestión de la seguridad y autenticación.
- **Spring Data JPA**: Para la gestión de la persistencia de datos.
- **MySQL**: Base de datos relacional utilizada.
- **Flyway**: Herramienta para la migración de bases de datos.
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.

## Instalación y Configuración

1. **Clonar el repositorio**:

   ```bash
   git clone https://github.com/ismari-mv/forohub.git

2. **Configurar la base de datos**:
   Crea una base de datos en MySQL llamada forohub
   Actualiza las credenciales en el archivo application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/forohub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

3.**Ejecutar las migraciones**
  ForoHub utiliza Flyway para gestionar las migraciones de la base de datos.     
  Asegúrate de que las migraciones se ejecuten correctamente al iniciar la aplicación

## Uso
Una vez que la aplicación esté en funcionamiento, puedes acceder a la API a través de http://localhost:8080. Asegúrate de utilizar un cliente HTTP como Postman para interactuar con los endpoints disponibles.

## Contribuciones 
Las contribuciones son bienvenidas. Si tienes alguna pregunta o sugerencia, no dudes en crear un issue o un pull request.
