package com.codigo.mspachauririvera.domain.ports.out;

import com.codigo.mspachauririvera.domain.aggregates.dto.PersonaDTO;
import com.codigo.mspachauririvera.domain.aggregates.request.RequestPersona;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceOut {
    PersonaDTO crearPersonaOut(RequestPersona requestPersona);
    Optional<PersonaDTO> obtenerPersonaOut(Long id);
    List<PersonaDTO> obtenerTodosOut();
    PersonaDTO actualizarOut(Long id, RequestPersona requestPersona);
    PersonaDTO deleteOut(Long id);
    List<PersonaDTO> buscarPersonaPorEstadoOut (Integer estado);
}
