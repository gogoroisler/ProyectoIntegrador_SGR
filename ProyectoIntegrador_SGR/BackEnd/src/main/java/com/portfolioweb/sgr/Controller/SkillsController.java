package com.portfolioweb.sgr.Controller;

import com.portfolioweb.sgr.Entity.Skills;
import com.portfolioweb.sgr.Interface.ISkillsService;
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

public class SkillsController {
    // autowired controlador llama al servicio
    @Autowired ISkillsService iskillsService;
    
    // getmapping trae de la base al front con url
    // URL:PUERTO/personas/traer/(persona)/
    @GetMapping("/personas/traer")
    public List<Skills> getSkills(){
        return iskillsService.getSkills();
    }
    
    // postmapping trae de la base al front con url
    // URL:PUERTO/personas/crear/(persona)/
    @PostMapping("/personas/crear")
    public String createSkills(@RequestBody Skills skills){
        iskillsService.saveSkills(skills);
        return "La habilidad fue creada correctamente";
    }
    
    // deletemapping trae de la base al front con url
    // URL:PUERTO/personas/borrar/(id)/
    @DeleteMapping("personas/borrar/{id}")
    public String deteleSkills(@PathVariable Long id){
        iskillsService.deleteSkills(id);
        return "La habilidad fue eliminada correctamente";
    }
    
    // putmapping trae de la base al front con url
    // URL:PUERTO/personas/editar/(id)/(nombre)&(apellido)&(img)
    @PutMapping("/personas/editar/{id}")
    public Skills editSkills(@PathVariable Long id,
                                      @RequestParam("nombre") String nuevoNombre,
                                      @RequestParam("porcentaje") String nuevoPorcentaje,
                                      @RequestParam("descripcion") String nuevoDescripcion){
        Skills skills = iskillsService.findSkills(id);
        
        skills.setNombre(nuevoNombre);
        skills.setPorcentaje(nuevoPorcentaje);
        skills.setDescripcion(nuevoDescripcion);
        iskillsService.saveSkills(skills);
        return skills;
    }
    @GetMapping("/skills/traer/perfil")
    public Skills findSkills(){
        return iskillsService.findSkills((long) 1);
    }
}
