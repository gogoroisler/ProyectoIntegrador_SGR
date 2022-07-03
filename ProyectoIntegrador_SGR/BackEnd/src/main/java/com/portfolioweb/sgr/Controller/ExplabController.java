package com.portfolioweb.sgr.Controller;

import com.portfolioweb.sgr.Entity.Explab;
import com.portfolioweb.sgr.Interface.IExplabService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// anotacion controlador
@RestController 
// llamado de front a base
@CrossOrigin(origins = "https://localhost:4200")

public class ExplabController {
    // autowired controlador llama al servicio
    @Autowired IExplabService iexplabService;
    
    // getmapping trae de la base al front con url
    // URL:PUERTO/personas/traer/(persona)/
    @GetMapping("/personas/traer")
    public List<Explab> getExplab(){
        return iexplabService.getExplab();
    }
    
    // postmapping trae de la base al front con url
    // URL:PUERTO/personas/crear/(persona)/
    @PostMapping("/personas/crear")
    public String createExplab(@RequestBody Explab explab){
        iexplabService.saveExplab(explab);
        return "La experiencia laboral fue creada correctamente";
    }
    
    // deletemapping trae de la base al front con url
    // URL:PUERTO/personas/borrar/(id)/
    @DeleteMapping("personas/borrar/{id}")
    public String deteleExplab(@PathVariable Long id){
        iexplabService.deleteExplab(id);
        return "La experiencia laboral fue eliminada correctamente";
    }
    
    // putmapping trae de la base al front con url
    // URL:PUERTO/personas/editar/(id)/(nombre)&(apellido)&(img)
    @PutMapping("/personas/editar/{id}")
    public Explab editExplab(@PathVariable Long id,
                                      @RequestParam("nombre") String nuevoNombre,
                                      @RequestParam("año de inicio") String nuevoAñoInicio,
                                      @RequestParam("año de cierre") String nuevoAñoCierre,
                                      @RequestParam("descripcion") String nuevoDescripcion){
        Explab explab = iexplabService.findExplab(id);
        
        explab.setNombre(nuevoNombre);
        explab.setAñoInicio(nuevoAñoInicio);
        explab.setAñoCierre(nuevoAñoCierre);
        explab.setDescripcion(nuevoDescripcion);
        iexplabService.saveExplab(explab);
        return explab;
    }
    @GetMapping("/explab/traer/perfil")
    public Explab findExplab(){
        return iexplabService.findExplab((long) 1);
    }
}
