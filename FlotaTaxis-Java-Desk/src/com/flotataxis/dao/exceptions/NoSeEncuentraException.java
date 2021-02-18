/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.dao.exceptions;

/**
 *
 * @author Luis Angel
 */
public class NoSeEncuentraException extends Exception{
     @Override
    public String getMessage() {
        return "No se ha encontrado.";
    }
}
