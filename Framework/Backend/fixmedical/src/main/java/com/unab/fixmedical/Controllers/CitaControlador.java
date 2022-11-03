package com.unab.fixmedical.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cita")
public class CitaControlador {

    @GetMapping
    public String obtenerCitas(){
        return "Get citas";
    }

    @PostMapping
    public String crearCitas(){
        return "Post citas";
    }
}
