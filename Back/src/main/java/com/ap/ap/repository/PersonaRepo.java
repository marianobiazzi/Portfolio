package com.ap.ap.repository;

import com.ap.ap.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<Persona,Long> {
    
}
