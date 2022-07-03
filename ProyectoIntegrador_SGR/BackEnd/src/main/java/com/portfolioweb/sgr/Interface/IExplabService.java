package com.portfolioweb.sgr.Interface;

import com.portfolioweb.sgr.Entity.Explab;
import java.util.List;

// interface extiende de entidad declara interfaces
public interface IExplabService {
    // Traer lista de Persona
    public List<Explab> getExplab();
    
    // Guardar objeto Persona
    public void saveExplab(Explab explab);
    
    // Eliminar objeto por ID
    public void deleteExplab(Long id);
    
    // Buscar objeto por ID
    public Explab findExplab(Long id);
}
