package com.portfolioweb.sgr.Controller;

import com.portfolioweb.sgr.Entity.Educacion;
import com.portfolioweb.sgr.Interface.IEducacionService;
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

public class EducacionController {
    // autowired controlador llama al servicio
    @Autowired IEducacionService ieducacionService;
    
    // getmapping trae de la base al front con url
    // URL:PUERTO/personas/traer/(persona)/
    @GetMapping("/personas/traer")
    public List<Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    // postmapping trae de la base al front con url
    // URL:PUERTO/personas/crear/(persona)/
    @PostMapping("/personas/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
        return "La educacion fue creada correctamente";
    }
    
    // deletemapping trae de la base al front con url
    // URL:PUERTO/personas/borrar/(id)/
    @DeleteMapping("personas/borrar/{id}")
    public String deteleEducacion(@PathVariable Long id){
        ieducacionService.deleteEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    // putmapping trae de la base al front con url
    // URL:PUERTO/personas/editar/(id)/(nombre)&(apellido)&(img)
    @PutMapping("/personas/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                      @RequestParam("nombre") String nuevoNombre,
                                      @RequestParam("año de inicio") String nuevoAñoInicio,
                                      @RequestParam("año de cierre") String nuevoAñoCierre,
                                      @RequestParam("descripcion") String nuevoDescripcion){
        Educacion educacion = ieducacionService.findEducacion(id);
        
        educacion.setNombre(nuevoNombre);
        educacion.setAñoInicio(nuevoAñoInicio);
        educacion.setAñoCierre(nuevoAñoCierre);
        educacion.setDescripcion(nuevoDescripcion);
        ieducacionService.saveEducacion(educacion);
        return educacion;
    }
    @GetMapping("/educacion/traer/perfil")
    public Educacion findEducacion(){
        return ieducacionService.findEducacion((long) 1);
    }
}
