package com.codigo.mspachauririvera.application.controller;

import com.codigo.mspachauririvera.domain.aggregates.dto.PersonaDTO;
import com.codigo.mspachauririvera.domain.aggregates.request.RequestPersona;
import com.codigo.mspachauririvera.domain.ports.in.PersonaServiceIn;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@OpenAPIDefinition(
        info = @Info(
                title = "API-PERSONA",
                version = "1.0",
                description = "Mantenimiento de una Persona"
        )
)
@RestController
@RequestMapping("/v2/persona")
@RequiredArgsConstructor

public class PersonaController {
    private final PersonaServiceIn personaServiceIn;

    @Operation(summary = "Crea una persona")
    @PostMapping
    public ResponseEntity<PersonaDTO> registrar(@RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.crearPersonaIn(requestPersona));
    }

    @Operation(summary = "Obtiene una persona por id")
    @GetMapping("/{id}")
    public ResponseEntity<PersonaDTO>obtenerPersona(@PathVariable Long id){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerPersonaIn(id).get());
    }

    @Operation(summary = "Obtiene todas las personas")
    @GetMapping
    public ResponseEntity<List<PersonaDTO>>obtenerTodos(){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerTodosIn());

    }

    @Operation(summary = "Actualiza una persona")
    @PutMapping("/{id}")
    public ResponseEntity<PersonaDTO>actualizar(@PathVariable Long id,@RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.actualizarIn(id,requestPersona));

    }

    @Operation(summary = "Elimina una persona")
    @DeleteMapping("/{id}")
    public ResponseEntity<PersonaDTO> eliminar(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.deleteIn(id));
    }

    @Operation(summary = "Obtiene lista de personas segun estado (Activo = 1)")
    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<PersonaDTO>> buscarPorEstado(@PathVariable Integer estado) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.buscarPersonaPorEstadoIn(estado));
    }
}
