package com.vitalink.demovitalink.controller;

import com.vitalink.demovitalink.repository.TratamientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TratamientosController {
    @Autowired
    TratamientosRepository tratamientosRepository;



    @GetMapping("/editarTratamiento")
    public String editarTratamiento(int id){
        return "registroTratamiento";
    }
    @GetMapping("/borrarTratamiento")
    public String borrarTratamiento(int id){
        return "registroTratamiento";
    }
    @GetMapping("/buscarTratamiento")
    public String buscarTratamiento(String numeroTarjetaSanitaria){
        return "registroTratamiento";
    }




}
