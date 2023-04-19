package com.ap.ap.repository;

import com.ap.ap.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository<Skill,Long> {
    
}
