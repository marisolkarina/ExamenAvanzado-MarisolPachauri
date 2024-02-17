package com.codigo.mspachauririvera.infraestructure.repository;

import com.codigo.mspachauririvera.infraestructure.entity.TipoPersonaEntity;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPersonaRepository extends JpaRepository<TipoPersonaEntity, Long> {
    TipoPersonaEntity findByDescTipo(String descTipo);
}
