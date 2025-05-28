package com.vitalink.demovitalink.controller;

import com.vitalink.demovitalink.modell.Usuario;
import com.vitalink.demovitalink.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/registro")
    public String registroUsuario(Model model){
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    @PostMapping("/regsitro")
    public String guardarUsuario(@ModelAttribute Usuario usuario, Model model){
        usuario.asignarIdUsuario();
        listaUsuarios.add(usuario);
        System.out.println(usuario);
        return "redirect:/inicioSesion";
    }
}
