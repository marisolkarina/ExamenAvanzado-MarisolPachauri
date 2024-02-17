package com.codigo.mspachauririvera.infraestructure.mapper;

import com.codigo.mspachauririvera.domain.aggregates.dto.PersonaDTO;
import com.codigo.mspachauririvera.infraestructure.entity.PersonaEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PersonaMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public PersonaDTO mapToDto(PersonaEntity entity){
        return modelMapper.map(entity, PersonaDTO.class);
    }
}
