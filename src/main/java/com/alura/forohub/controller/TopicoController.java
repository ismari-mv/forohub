//package com.alura.forohub.controller;
//
//
//
//import com.alura.forohub.topico.*;
//import com.alura.forohub.usuario.DatosUsuario;
//import com.alura.forohub.usuario.UsuarioRepository;
//import io.swagger.v3.oas.annotations.security.SecurityRequirement;
//import jakarta.transaction.Transactional;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import java.net.URI;
//
//@RestController
//@RequestMapping("/topicos")
//@SecurityRequirement(name = "bearer-key")
//public class TopicoController {
//
//    @Autowired
//    private TopicoRepository topicoRepository;
//
//    @Autowired
//    private UsuarioRepository usuarioRepository;
//
//    @PostMapping
//    public ResponseEntity<DatosRespuestaTopico> registrarTopico(@RequestBody @Valid DatosCrearTopico datosCrearTopico,
//                                                                UriComponentsBuilder uriComponentsBuilder) {
//        Topico topico = topicoRepository.save(new Topico(datosCrearTopico));
//        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(
//                topico.getId(),
//                topico.getMensaje(),
//                topico.getTitulo(),
//                topico.getFechaCreacion(),
//                new DatosUsuario(
//                        topico.getAutor().getId(),
//                        topico.getAutor().getNombre(),
//                        topico.getAutor().getEmail(),
//                        topico.getAutor().getContrasena(),
//                        topico.getAutor().getPerfiles().toString()),
//                topico.getStatus());
//
//        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
//        return ResponseEntity.created(url).body(datosRespuestaTopico);
//    }
//
////    @GetMapping
////    public ResponseEntity<Page<DatosListadoTopico>> listadoTopicos(@PageableDefault(size = 2) Pageable paginacion) {
////        return ResponseEntity.ok(topicoRepository.findByStatus(paginacion).map(DatosListadoTopico::new));
////    }
//
//    @PutMapping
//    @Transactional
//    public  ResponseEntity actualizarTopico (@RequestBody @Valid DatosActualizarTopico datosActualizarTopico ){
//        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
//        topico.actualizarTopico(datosActualizarTopico);
//        return ResponseEntity.ok(new DatosRespuestaTopico(
//                topico.getId(),
//                topico.getMensaje(),
//                topico.getTitulo(),
//                topico.getFechaCreacion(),
//                new DatosUsuario(
//                        topico.getAutor().getId(),
//                        topico.getAutor().getNombre(),
//                        topico.getAutor().getEmail(),
//                        topico.getAutor().getContrasena(),
//                        topico.getAutor().getPerfiles().toString()),
//                topico.getStatus()));
//    }
//
//    @DeleteMapping ("/{id}")
//    @Transactional
//    public ResponseEntity eliminarTopico (@PathVariable Long id){
//        Topico topico = topicoRepository.getReferenceById(id);
//        topico.eliminarTopico();
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping ("/{id}")
//    public ResponseEntity<DatosRespuestaTopico> retornaDatosTopico (@PathVariable Long id){
//        Topico topico= topicoRepository.getReferenceById(id);
//        var datosTopico = new DatosRespuestaTopico(
//                topico.getId(),
//                topico.getMensaje(),
//                topico.getTitulo(),
//                topico.getFechaCreacion(),
//                new DatosUsuario(
//                        topico.getAutor().getId(),
//                        topico.getAutor().getNombre(),
//                        topico.getAutor().getEmail(),
//                        topico.getAutor().getContrasena(),
//                        topico.getAutor().getPerfiles().toString()),
//                topico.getStatus());
//        return  ResponseEntity.ok(datosTopico);
//    }
//
//
//
//
//
//}
