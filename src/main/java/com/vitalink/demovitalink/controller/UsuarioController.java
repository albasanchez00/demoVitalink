package com.vitalink.demovitalink.controller;

import com.vitalink.demovitalink.model.Usuarios;
import com.vitalink.demovitalink.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder encoder;

    @GetMapping("/inicioSesion")
    public String inicioSesion(){
        return "inicioSesion";
    }

    @GetMapping("/registro")
    public String altaUsuario(Model model){
        model.addAttribute("usuario", new Usuarios());
        return "registro";  // Cambiado de "panelUsuario" a "registro"
    }

//    @PostMapping("/guardarUsuario")
//    public String guardarUsuario(@ModelAttribute Usuarios usuario,Model model) {
//        if (usuarioRepository.findByNumeroIdentificacion(usuario.getNumeroIdentificacion()).isEmpty()) {
//            Usuarios user = new Usuarios();
//            user.setNombre(usuario.getNombre());
//            user.setApellidos(usuario.getApellidos());
//            user.setNacimiento(usuario.getNacimiento());
//            user.setTipoDocumento(usuario.getTipoDocumento());
//            user.setNumeroIdentificacion(usuario.getNumeroIdentificacion());
//            user.setTelefono(usuario.getTelefono());
//            user.setNumeroTarjetaSanitaria(usuario.getNumeroTarjetaSanitaria());
//            user.setGenero(usuario.getGenero());
//            user.setCorreoElectronico(usuario.getCorreoElectronico());
//            user.setPassword(encoder.encode(usuario.getPassword()));
//            user.setDireccion(usuario.getDireccion());
//            user.setCiudadId(usuario.getCiudadId());
//            user.setCpId(usuario.getCpId());
//            user.setRol(usuario.getRol());
//            usuarioRepository.save(user);
//            return "redirect:/";
//        }else{
//            model.addAttribute("error", "El usuario ya existe, indique uno nuevo");
//            return "registro";
//        }
//    }

    @GetMapping("/listaUsuarios")
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
    //Logout
    @GetMapping("/logout")
    public String logout(){
        return "redirect:/inicioSesion";
    }
}