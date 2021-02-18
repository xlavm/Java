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
public class Propietario implements Serializable{
   
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String edad;
    private String genero;
    private String telefono;
    protected List<String[]> taxis;
    public Propietario() {
    }
    public Propietario(String identificacion, String nombre, String apellidos, String edad, String genero, String telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
        this.telefono = telefono;
        this.taxis=new ArrayList<>();
    }

    public List<String[]> getTaxis() {
        return taxis;
    }

    public void setTaxis(List<String[]> taxis) {
        this.taxis = taxis;
    }
    
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     public void insertarTaxi(String[] taxi){
         if(taxi!=null){
    this.taxis.add(taxi);
         }
    }
    public String listarTaxis(){
    String retorno="-";
        for (int i = 0; i < this.taxis.size(); i++) {
            retorno=retorno+"-"+this.taxis.get(i)[1];
        }
    return retorno;
    }
    @Override
    public String toString() {
        return "Propietario{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", genero=" + genero + ", telefono=" + telefono + '}';
    }
    
    
   
    
    
}
