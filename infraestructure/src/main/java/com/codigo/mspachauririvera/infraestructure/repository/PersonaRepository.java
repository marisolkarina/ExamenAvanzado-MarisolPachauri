package com.codigo.mspachauririvera.infraestructure.repository;

import com.codigo.mspachauririvera.infraestructure.entity.PersonaEntity;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
    List<PersonaEntity> findAllByEstado(@Param("estado") Integer estado);
}
