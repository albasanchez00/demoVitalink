package com.vitalink.demovitalink.controller;

import com.vitalink.demovitalink.model.Clientes;
import com.vitalink.demovitalink.model.Usuarios;
import com.vitalink.demovitalink.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ClientesController {
    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping("/clientes")
    public String listarClientes(Model model) {
        model.addAttribute("clientes", clientesRepository.findAll());
        return "listaClientes";
    }

    @GetMapping("/editar/{id}")
    public String editarCliente(@PathVariable int id, Model model) {
        Clientes cliente = clientesRepository.findById(id).orElseThrow();
        model.addAttribute("cliente", cliente);
        return "listaClientes/editar";
    }

}
