package com.codigo.mspachauririvera.infraestructure.repository;

import com.codigo.mspachauririvera.infraestructure.entity.TipoDocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Long> {
    TipoDocumentoEntity findByCodTipo(@Param("codTipo") String codTipo);
}
