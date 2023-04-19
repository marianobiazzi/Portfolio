package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Educacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private String descripcionEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, String descripcionEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.descripcionEdu = descripcionEdu;
    }
    
        
}
