package com.flotataxis.negocio.exceptions;

/**
 *
 * @author Luis Angel
 */
public class EstudianteYaExisteException extends Exception {

    @Override
    public String getMessage() {
        return "El estudiante ya se encuentra almacenado";
    }
}
