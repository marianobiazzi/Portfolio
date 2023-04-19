package com.ap.ap.controller;

import com.ap.ap.models.Persona;
import com.ap.ap.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id") Long id){
        Persona persona=personaService.buscarPersonaPorId(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN)")
    @PutMapping("/editar")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona){
        Persona editarPersona=personaService.editarPersona(persona);
        return new ResponseEntity<>(editarPersona,HttpStatus.OK);
    }
    
    
    
}
