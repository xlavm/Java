/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.negocio.impl;

import com.flotataxis.dao.ConductorDAO;
import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.dao.impl.FileConductor;
import com.flotataxis.modelo.Conductor;
import com.flotataxis.negocio.ConductorBsn;
import com.flotataxis.negocio.exceptions.NoSeEncuentraException;
import com.flotataxis.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public class ConductorBsnImpl implements ConductorBsn {
    private ConductorDAO conductorDAO;
    
    public ConductorBsnImpl() {
        conductorDAO = new FileConductor();
    }
    @Override
    public List<String[]> listarConductor() {
    return conductorDAO.listarConductor();
    }

    @Override
    public String[] consultarConductor(String id) throws NoSeEncuentraException{
    return conductorDAO.consultarConductor(id);
    }

    @Override
    public void almacenarConductor(Conductor conductor) throws YaExisteException {
        try {
            conductorDAO.almacenarConductor(conductor);
        } catch (LlaveDuplicadaException lde) {
          throw new YaExisteException();
        }
    }

    @Override
    public boolean eliminarConductor(String id) {
    return conductorDAO.eliminarConductor(id);
    }

    @Override
    public void actualizarConductor(Conductor conductor) {
    conductorDAO.actualizarConductor(conductor);
    }
    
}
