/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.negocio.exceptions;

/**
 *
 * @author Luis Angel
 */
public class YaExisteException extends Exception{
    
    @Override
    public String getMessage() {
        return "EL objeto que intenta ingresar ya se encuentra almacenado.";
    }
}
