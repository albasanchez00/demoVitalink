package com.vitalink.demovitalink.controller;

import com.vitalink.demovitalink.model.Clientes;
import com.vitalink.demovitalink.model.Usuarios;
import com.vitalink.demovitalink.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientesController {
    @Autowired
    ClientesRepository clientesRepository;
    @GetMapping("/registro")
    public String altaUsuario(Model model){
        model.addAttribute("cliente", new Clientes());
        return "registro";  // Cambiado de "panelUsuario" a "registro"
    }

    @PostMapping("/guardarDatosUsuario")
    public String guardarUsuario(@ModelAttribute Clientes cliente, Model model) {
        if (clientesRepository.findAllById_cliente(cliente.getIdCliente()).isEmpty()) {
            Clientes client = new Clientes();
            client.setNombre(cliente.getNombre());
            client.setApellidos(cliente.getNombre());
            client.setNacimiento(cliente.getNacimiento());
            client.setTipoDocumento(cliente.getTipoDocumento());
            client.setNumeroIdentificacion(cliente.getNumeroIdentificacion());
            client.setTelefono(cliente.getTelefono());
            client.setNumeroTarjetaSanitaria(cliente.getNumeroTarjetaSanitaria());
            client.setGenero(cliente.getGenero());
            client.setCorreoElectronico(cliente.getCorreoElectronico());
            client.setDireccion(cliente.getDireccion());
            client.setCiudadId(cliente.getCiudadId());
            client.setCpId(cliente.getCpId());
            clientesRepository.save(client);
            return "redirect:registroDB";
        }else{
            model.addAttribute("error", "El usuario ya existe, indique uno nuevo");
            return "registro";
        }
    }

    @GetMapping("/listaUsuarios")
    public String mostrarUsuarios(Model model){
        model.addAttribute("usuariosCrud", clientesRepository.findAll());
        return "listaUsuarios";
    }

    @GetMapping("/editarCliente")
    public String editarCliente(int id){
        return "listaUsuarios";
    }
    @GetMapping("/borrarCliente")
    public String borrarCliente(int id){
        return "listaUsuarios";
    }

}
