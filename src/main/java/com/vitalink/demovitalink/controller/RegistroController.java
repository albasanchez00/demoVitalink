package com.vitalink.demovitalink.controller;

import com.vitalink.demovitalink.dto.RegistroCompleto;
import com.vitalink.demovitalink.model.Clientes;
import com.vitalink.demovitalink.model.Usuarios;
import com.vitalink.demovitalink.repository.ClientesRepository;
import com.vitalink.demovitalink.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class RegistroController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ClientesRepository clientesRepository;

    @Autowired
    private PasswordEncoder encoder;

    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("registroDTO", new RegistroCompleto());
        return "registro";
    }

    @PostMapping("/registroCompleto")
    public String registrarUsuario(@ModelAttribute("registroDTO") RegistroCompleto datos, Model model) {

        System.out.println(">>> Recibiendo registro para: " + datos.getUsername());

        Optional<Clientes> clienteExistente = clientesRepository.findByNumeroIdentificacion(datos.getNumeroIdentificacion());
        if (clienteExistente.isPresent() && clienteExistente.get().getUsuario() != null) {
            model.addAttribute("error", "Este cliente ya tiene una cuenta asociada.");
            return "registro";
        }

        // Crear usuario
        Usuarios usuario = new Usuarios();
        usuario.setUsername(datos.getUsername());
        usuario.setPassword(encoder.encode(datos.getPassword()));
        usuario.setRol(datos.getRol());
        usuarioRepository.save(usuario);

        // Asociar cliente
        Clientes cliente = clienteExistente.orElse(new Clientes());
        cliente.setNombre(datos.getNombre());
        cliente.setApellidos(datos.getApellidos());
        cliente.setNacimiento(datos.getNacimiento());
        cliente.setTipoDocumento(datos.getTipoDocumento());
        cliente.setNumeroIdentificacion(datos.getNumeroIdentificacion());
        cliente.setTelefono(datos.getTelefono());
        cliente.setNumeroTarjetaSanitaria(datos.getNumeroTarjetaSanitaria());
        cliente.setGenero(datos.getGenero());
        cliente.setCorreoElectronico(datos.getCorreoElectronico());
        cliente.setDireccion(datos.getDireccion());
        cliente.setCiudadId(datos.getCiudadId());
        cliente.setCpId(datos.getCpId());
        cliente.setUsuario(usuario);

        clientesRepository.save(cliente);

        System.out.println(">>> Usuario y cliente registrados correctamente.");

        return "redirect:/registroExitoso"; // o cambia por "/listaClientes"
    }
    @GetMapping("/registroExitoso")
    public String mostrarRegistroExitoso(Model model) {
        model.addAttribute("registroExitoso", true);
        return "registroExitoso";
    }

}

