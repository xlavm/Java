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
public class Taller implements Serializable{
    private String nombre;
    private String codigo;
    private String direccion;
    private String telefono;
    private List<String[]> taxis;
    
    public Taller() {
        this.taxis=new ArrayList(); 
    }

    public Taller(String nombre, String codigo, String direccion, String telefono) {
       this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono=telefono;
        this.taxis = taxis;
        this.taxis=new ArrayList();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<String[]> getTaxis() {
        return taxis;
    }

    public void setTaxis(List<String[]> taxis) {
        this.taxis = taxis;
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
        return "Taller{" + "nombre=" + nombre + ", codigo=" + codigo + ", direccion=" + direccion + '}';
    }

    
    
}
