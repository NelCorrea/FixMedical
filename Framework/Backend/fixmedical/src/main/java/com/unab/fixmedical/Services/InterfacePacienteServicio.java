package com.unab.fixmedical.Services;

import java.util.List;

import com.unab.fixmedical.Models.PacienteDto;

public interface InterfacePacienteServicio {
    List<PacienteDto> obtenerPaciente();

    PacienteDto crearPacienteDto(PacienteDto pacienteDto);
}
