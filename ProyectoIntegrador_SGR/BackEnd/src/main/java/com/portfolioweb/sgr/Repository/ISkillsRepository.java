package com.portfolioweb.sgr.Repository;

import com.portfolioweb.sgr.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// anotacion declara repositorio interface
@Repository

// repositorio extiende de interface
public interface ISkillsRepository extends JpaRepository<Skills,Long> {
    
}