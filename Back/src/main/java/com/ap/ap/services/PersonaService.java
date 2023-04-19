package com.ap.ap.services;

import com.ap.ap.exception.PersonaNotFoundException;
import com.ap.ap.models.Persona;
import com.ap.ap.repository.PersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {
    
    private final PersonaRepo personaRepo;
    
    @Autowired
    public PersonaService(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }
    
     public List<Persona> buscarPersona(){
        return personaRepo.findAll();
    }
    
    public Persona editarPersona(Persona persona){
        return personaRepo.save(persona);
    }
    
    public Persona buscarPersonaPorId(Long id){
        return personaRepo.findById(id).orElseThrow(() ->new PersonaNotFoundException("persona no encontrada"));
    }
        
}
