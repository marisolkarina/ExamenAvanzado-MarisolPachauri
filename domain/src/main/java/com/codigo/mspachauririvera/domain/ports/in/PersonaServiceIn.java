package com.codigo.mspachauririvera.domain.ports.in;

import com.codigo.mspachauririvera.domain.aggregates.dto.PersonaDTO;
import com.codigo.mspachauririvera.domain.aggregates.request.RequestPersona;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceIn {
    PersonaDTO crearPersonaIn(RequestPersona requestPersona);
    Optional<PersonaDTO> obtenerPersonaIn(Long id);
    List<PersonaDTO> obtenerTodosIn();
    PersonaDTO actualizarIn(Long id, RequestPersona requestPersona);
    PersonaDTO deleteIn(Long id);
    List<PersonaDTO> buscarPersonaPorEstadoIn (Integer estado);
}
