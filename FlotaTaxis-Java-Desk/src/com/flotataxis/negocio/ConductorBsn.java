/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.negocio;

import com.flotataxis.modelo.Conductor;
import com.flotataxis.negocio.exceptions.NoSeEncuentraException;
import com.flotataxis.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public interface ConductorBsn {

    public List<String[]> listarConductor();

    public String[] consultarConductor(String id) throws NoSeEncuentraException;

    public void almacenarConductor(Conductor conductor) throws YaExisteException;

    public boolean eliminarConductor(String id);

    public void actualizarConductor(Conductor conductor);

}
