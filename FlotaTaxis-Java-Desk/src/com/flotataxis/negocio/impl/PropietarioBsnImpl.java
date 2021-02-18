/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.negocio.impl;

import com.flotataxis.dao.PropietarioDAO;
import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.dao.impl.FilePropietario;
import com.flotataxis.modelo.Propietario;
import com.flotataxis.negocio.PropietarioBsn;
import com.flotataxis.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public class PropietarioBsnImpl implements PropietarioBsn{
    private PropietarioDAO propietarioDAO;
    
    public PropietarioBsnImpl() {
        propietarioDAO = new FilePropietario();
    }
    
    @Override
    public List<String[]> listarPropietario() {
    return propietarioDAO.listarPropietario();
            }

    @Override
    public String[] consultarPropietario(String id) {
    return propietarioDAO.consultarPropietario(id);
    }

    @Override
    public void almacenarPropietario(Propietario propietario) throws YaExisteException {
    try {
            propietarioDAO.almacenarPropietario(propietario);
        } catch (LlaveDuplicadaException lde) {
          throw new YaExisteException();
        }
    }

    @Override
    public boolean eliminarPropietario(String id) {
    return propietarioDAO.eliminarPropietario(id);
    }

    @Override
    public void actualizarPropietario(Propietario propietario) {
    propietarioDAO.actualizarPropietario(propietario);
    }
    
}
