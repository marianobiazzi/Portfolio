package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Skill {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private int porcentajeSkill;

    public Skill() {
    }

    public Skill(String nombreSkill, int porcentajeSkill) {
        this.nombreSkill = nombreSkill;
        this.porcentajeSkill = porcentajeSkill;
    }
    
        
}
