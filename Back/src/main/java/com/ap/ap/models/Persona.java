package com.ap.ap.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String foto;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillList;
    
    
}
