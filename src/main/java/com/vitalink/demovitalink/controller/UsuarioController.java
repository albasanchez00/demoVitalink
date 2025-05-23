package com.vitalink.demovitalink.controller;

import com.vitalink.demovitalink.model.Usuario;
import com.vitalink.demovitalink.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/registro")
    public ResponseEntity<String> registrarUsuario(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario); // <-- Esta línea es crítica
        return ResponseEntity.ok("Usuario registrado correctamente.");
    }
}
