package com.unab.fixmedical.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unab.fixmedical.Models.CreaPacienteModelo;
import com.unab.fixmedical.Models.PacienteDto;
import com.unab.fixmedical.Models.RespuestaPacienteModelo;
import com.unab.fixmedical.Services.InterfacePacienteServicio;

@RestController
@RequestMapping("/paciente")
public class PacienteControlador {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    InterfacePacienteServicio interfacePacienteServicio;

    @GetMapping
    public String verPaciente(){
        return "Get paciente";
    }

    @PostMapping
    public RespuestaPacienteModelo crearPaciente(@RequestBody CreaPacienteModelo creaPacienteModelo){
        
        PacienteDto pacienteDto = modelMapper.map(creaPacienteModelo, PacienteDto.class);
        PacienteDto pacienteDtoCreado = interfacePacienteServicio.crearPacienteDto(pacienteDto);

        RespuestaPacienteModelo respuestaPacienteModelo = modelMapper.map(pacienteDtoCreado, RespuestaPacienteModelo.class);

        return respuestaPacienteModelo;
    }
}
