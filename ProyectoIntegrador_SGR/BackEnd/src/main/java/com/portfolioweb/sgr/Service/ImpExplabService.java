package com.portfolioweb.sgr.Service;

import com.portfolioweb.sgr.Entity.Explab;
import com.portfolioweb.sgr.Interface.IExplabService;
import com.portfolioweb.sgr.Repository.IExplabRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// etiqueta declara servicio
@Service

public class ImpExplabService implements IExplabService{
    // autowired servicio llama al repositorio
    @Autowired IExplabRepository iexplabRepository;

    // override trae los metodos de la clase
    // listar personas
    @Override
    public List<Explab> getExplab() {
        List<Explab> explab = iexplabRepository.findAll();
        return explab;
    }

    // guardar persona
    @Override
    public void saveExplab(Explab explab) {
        iexplabRepository.save(explab);
    }

    //borrar persona
    @Override
    public void deleteExplab(Long id) {
        iexplabRepository.deleteById(id);
    }
    
    // buscar persona
    @Override
    public Explab findExplab(Long id) {
        Explab explab = iexplabRepository.findById(id).orElse(null);
        return explab;
    }
   }

