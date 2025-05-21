package com.vitalink.demovitalink.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorPrincipal {
    //Páginas Principales
    @GetMapping("/")
    public String principal() {
        return "index";
    }

    @GetMapping("/serviciosCliente")
    public String serviciosCliente() {
        return "serviciosCliente";
    }

    @GetMapping("/serviciosEmpresa")
    public String serviciosEmpresa() {
        return "serviciosEmpresa";
    }

    @GetMapping("/contacto")
    public String contactoVitalink() {
        return "contacto";
    }

    @GetMapping("/inicioSesion")
    public String inicioSesion() {
        return "inicioSesion";
    }

    @GetMapping("/registro")
    public String registroUsuario() {
        return "registro";
    }

    @GetMapping("/terminoCondiciones")
    public String terminosCondiciones() {
        return "terminoCondiciones";
    }


    //Páginas Acceso Cliente
    @GetMapping("/panelUsuario")
    public String panelUsuario() {
        return "panelUsuario";
    }

    @GetMapping("/mensajesUsuario")
    public String mensajesUsuario() {
        return "mensajesUsuario";
    }

    @GetMapping("/configUsuario")
    public String configuracionUsuario() {
        return "configUsuario";
    }

    @GetMapping("/pedirCita")
    public String pedirCita() {
        return "pedirCita";
    }

    @GetMapping("/recordatorios")
    public String recordatoriosUsuario() {
        return "recordatorios";
    }

    @GetMapping("/registroSintomas")
    public String registroSintomas() {
        return "registroSintomas";
    }

    @GetMapping("/registroTratamiento")
    public String registroTratamientos() {
        return "registroTratamiento";
    }

}
