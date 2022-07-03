package com.portfolioweb.sgr.Service;

import com.portfolioweb.sgr.Entity.Skills;
import com.portfolioweb.sgr.Interface.ISkillsService;
import com.portfolioweb.sgr.Repository.ISkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// etiqueta declara servicio
@Service

public class ImpSkillsService implements ISkillsService{
    // autowired servicio llama al repositorio
    @Autowired ISkillsRepository iskillsRepository;

    // override trae los metodos de la clase
    // listar personas
    @Override
    public List<Skills> getSkills() {
        List<Skills> skills = iskillsRepository.findAll();
        return skills;
    }

    // guardar persona
    @Override
    public void saveSkills(Skills skills) {
        iskillsRepository.save(skills);
    }

    //borrar persona
    @Override
    public void deleteSkills(Long id) {
        iskillsRepository.deleteById(id);
    }
    
    // buscar persona
    @Override
    public Skills findSkills(Long id) {
        Skills skills = iskillsRepository.findById(id).orElse(null);
        return skills;
    }
   }
