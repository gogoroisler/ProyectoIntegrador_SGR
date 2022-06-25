package com.portfolioweb.sgr.Controller;

import com.portfolioweb.sgr.Entity.Persona;
import com.portfolioweb.sgr.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

public class PersonaController {
    // autowired controlador llama al servicio
    @Autowired IPersonaService ipersonaService;
    
    // getmapping trae de la base al front con url
    // URL:PUERTO/personas/traer/(persona)/
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    // postmapping trae de la base al front con url
    // URL:PUERTO/personas/crear/(persona)/
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    // deletemapping trae de la base al front con url
    // URL:PUERTO/personas/borrar/(id)/
    @DeleteMapping("personas/borrar/{id}")
    public String detelePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    // putmapping trae de la base al front con url
    // URL:PUERTO/personas/editar/(id)/(nombre)&(apellido)&(img)
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                      @RequestParam("nombre") String nuevoNombre,
                                      @RequestParam("apellido") String nuevoApellido,
                                      @RequestParam("img") String nuevoImg){
        Persona persona = ipersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        ipersonaService.savePersona(persona);
        return persona;
    }
}
