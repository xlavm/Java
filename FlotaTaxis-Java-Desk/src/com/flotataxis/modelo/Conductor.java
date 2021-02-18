/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public class Conductor extends Propietario implements Serializable{
    
    public Conductor() {
        this.taxis= new ArrayList();
    }

    public Conductor(String identificacion, String nombre, String apellidos, String edad, String genero, String telefono ) {
        super(identificacion, nombre, apellidos, edad, genero, telefono);
        this.taxis= new ArrayList();
    }

    @Override
    public String toString() {
        return "Conductor{" +this.getIdentificacion()+","+this.getNombre()+","+this.getApellidos()+","+this.getGenero()+","+this.getEdad()+","+this.getTelefono()+ '}';
    }
        
    
    
    

    
    
    
    
   
    
}
