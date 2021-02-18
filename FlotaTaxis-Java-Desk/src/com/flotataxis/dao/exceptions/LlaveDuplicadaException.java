package com.flotataxis.dao.exceptions;

/**
 *
 * @author Luis Angel
 */
public class LlaveDuplicadaException extends Exception {

    @Override
    public String getMessage() {
        return "Ha ocurrido un error con la llave primaria";
    }
}
