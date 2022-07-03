package com.portfolioweb.sgr.Interface;

import com.portfolioweb.sgr.Entity.Skills;
import java.util.List;

// interface extiende de entidad declara interfaces
public interface ISkillsService {
    // Traer lista de Persona
    public List<Skills> getSkills();
    
    // Guardar objeto Persona
    public void saveSkills(Skills skills);
    
    // Eliminar objeto por ID
    public void deleteSkills(Long id);
    
    // Buscar objeto por ID
    public Skills findSkills(Long id);
}
