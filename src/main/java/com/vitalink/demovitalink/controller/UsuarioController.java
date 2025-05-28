package com.vitalink.demovitalink.controller;

import com.vitalink.demovitalink.modell.Usuario;
import com.vitalink.demovitalink.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/registro")
    public String registroUsuario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "formulario"; //Envía al formulario
    }
    //Agregabamos una coleccion para ir guardando los usuarios dados de alta.
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute Usuario usuario, Model model){
        //Asegurarse que la fecha está correctamente configurada
        usuario.asignarIdUsuario();
        //Agregar el usuario a la lista
        listaUsuarios.add(usuario);

        //Mostrar por consola para depurar
        System.out.println(usuario);

        return "redirect:/crud";
    }
}
