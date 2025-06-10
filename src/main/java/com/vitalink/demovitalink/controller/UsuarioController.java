package com.vitalink.demovitalink.controller;

import com.vitalink.demovitalink.modell.Usuarios;
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
    public String mostrarRegistro(Model model) {
        model.addAttribute("usuario", new Usuarios()); // Asegura que usuario nunca sea null
        return "registro";
    }

    ArrayList<Usuarios> listaUsuarios = new ArrayList<>();

    @PostMapping("/listaUsuarios")
    public String guardarUsuario(@ModelAttribute Usuarios usuarioForm, Model model){
        usuarioRepository.save(usuarioForm); //Lo guarda en la BBDD
        return "redirect:/listaUsuarios";
    }

    @GetMapping("/crud")
    public String mostrarUsuarios(Model model){
        model.addAttribute("usuariosCrud", usuarioRepository.findAll());
        return "listaUsuarios";
    }

    @GetMapping("/editar/{id}")
    public String actualizarCliente(@PathVariable int id, Model model){
        //Debemos enviar los datos del cliente que hemos consultado mediante el {id},
        //Hibernate lo busca y lo almacena en un objeto (Clientes).
        //Se busca en la BBDD y despues se almacenan los datos en un objeto tipo Cliente.
        Usuarios usuario = usuarioRepository.findById(id).get(); //Busca x el id invitado por la url..
        model.addAttribute("usuario", usuario);
        return "registro";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable int id, Model model){
        usuarioRepository.deleteById(id);
        return "redirect:/listaUsuarios";
    }
}