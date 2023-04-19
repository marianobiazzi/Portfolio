package com.ap.ap.services;

import com.ap.ap.models.Skill;
import com.ap.ap.repository.SkillRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillService {
    
    private final SkillRepo skillRepo;
    
    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }
    
    public Skill addSkill(Skill skill){
        return skillRepo.save(skill);
    }
    
    public List<Skill> buscarSkill(){
        return skillRepo.findAll();
    }
    
    public Skill editarSkill(Skill skill){
        return skillRepo.save(skill);
    }
    
    public void borrarSkill(Long idSkill){
        skillRepo.deleteById(idSkill);
    }
    
}
