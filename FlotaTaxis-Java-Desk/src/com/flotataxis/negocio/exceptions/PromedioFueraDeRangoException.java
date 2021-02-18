package com.flotataxis.negocio.exceptions;

/**
 *
 * @author Luis Angel
 */
public class PromedioFueraDeRangoException extends Exception {

    @Override
    public String getMessage() {
        return "El promedio está por fuera del rango permitido (0-5)";
    }
}
