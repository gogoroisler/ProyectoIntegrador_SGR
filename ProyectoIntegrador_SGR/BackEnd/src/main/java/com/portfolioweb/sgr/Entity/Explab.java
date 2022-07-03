package com.portfolioweb.sgr.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

// declaracion de entidad y getter y setter por lombok, sino tippearlos
@Getter 
@Setter
@Entity

public class Explab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "atencion limite de caracteres")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "atencion limite de caracteres")
    private Number añoInicio;
    
    @NotNull
    @Size(min = 1, max = 50, message = "atencion limite de caracteres")
    private Number añoCierre;
    
    @NotNull
    @Size(min = 1, max = 300, message = "atencion limite de caracteres")
    private String descripcion;

    public void setAñoInicio(String nuevoAñoInicio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAñoCierre(String nuevoAñoCierre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNombre(String nuevoNombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDescripcion(String nuevoDescripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
