package com.portfolioweb.sgr.Service;

import com.portfolioweb.sgr.Entity.Educacion;
import com.portfolioweb.sgr.Interface.IEducacionService;
import com.portfolioweb.sgr.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// etiqueta declara servicio
@Service

public class ImpEducacionService implements IEducacionService{
    // autowired servicio llama al repositorio
    @Autowired IEducacionRepository ieducacionRepository;

    // override trae los metodos de la clase
    // listar personas
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = ieducacionRepository.findAll();
        return educacion;
    }

    // guardar persona
    @Override
    public void saveEducacion(Educacion educacion) {
        ieducacionRepository.save(educacion);
    }

    //borrar persona
    @Override
    public void deleteEducacion(Long id) {
        ieducacionRepository.deleteById(id);
    }
    
    // buscar persona
    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = ieducacionRepository.findById(id).orElse(null);
        return educacion;
    }
   }
