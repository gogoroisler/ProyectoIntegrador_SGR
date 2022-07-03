package com.portfolioweb.sgr.Repository;

import com.portfolioweb.sgr.Entity.Explab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// anotacion declara repositorio interface
@Repository

// repositorio extiende de interface
public interface IExplabRepository extends JpaRepository<Explab,Long> {
    
}