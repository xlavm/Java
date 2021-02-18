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
public class Taxi implements Serializable {

    private String numeroTaxi;
    private String placa;
    private String modelo;
    private String marca;
    private Propietario propietario;
    private String turnos;
    private List<String[]> conductor;
    private List<String[]> taller;

    public Taxi() {
        this.turnos = turnos;
        this.conductor = new ArrayList();
        this.taller = new ArrayList();
    }

    public Taxi(String numeroTaxi, String placa, String modelo, String marca, Propietario propietario, String turnos) {
        this.numeroTaxi = numeroTaxi;
        this.placa = placa;
        this.modelo = modelo;
        this.propietario = propietario;
        this.turnos = turnos;
        this.conductor = new ArrayList();
        this.taller = new ArrayList();
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTurnos() {
        return turnos;
    }

    public void setTurnos(String turnos) {
        this.turnos = turnos;
    }

    public String getNumeroTaxi() {
        return numeroTaxi;
    }

    public void setNumeroTaxi(String numeroTaxi) {
        this.numeroTaxi = numeroTaxi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<String[]> getConductor() {
        return conductor;
    }

    public void setConductor(List<String[]> conductor) {
        this.conductor = conductor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public List<String[]> getTaller() {
        return taller;
    }

    public void setTaller(List<String[]> taller) {
        this.taller = taller;
    }

    public void insertarConductore(List<String[]> conductor) {
        if (conductor != null) {
            this.conductor = conductor;
        }
    }

    public String listarConductores() {
        String retorno = "-";
        for (int i = 0; i < this.conductor.size(); i++) {
            retorno = retorno + "-" + this.conductor.get(i)[0];
        }
        return retorno;
    }

    public void insertarTaller(List<String[]> taller) {
        if (taller != null) {
            this.taller = taller;
        }
    }

    public String listarTalleres() {
        String retorno = "-";
        for (int i = 0; i < this.taller.size(); i++) {
            retorno = retorno + "-" + this.taller.get(i)[1];
        }
        return retorno;
    }

}
