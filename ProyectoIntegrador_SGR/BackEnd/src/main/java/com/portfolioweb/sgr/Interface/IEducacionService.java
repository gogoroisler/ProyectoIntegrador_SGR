package com.portfolioweb.sgr.Interface;

import com.portfolioweb.sgr.Entity.Educacion;
import java.util.List;

// interface extiende de entidad declara interfaces
public interface IEducacionService {
    // Traer lista de Persona
    public List<Educacion> getEducacion();
    
    // Guardar objeto Persona
    public void saveEducacion(Educacion educacion);
    
    // Eliminar objeto por ID
    public void deleteEducacion(Long id);
    
    // Buscar objeto por ID
    public Educacion findEducacion(Long id);
}
