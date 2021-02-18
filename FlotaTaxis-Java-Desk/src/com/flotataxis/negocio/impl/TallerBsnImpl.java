/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.negocio.impl;

import com.flotataxis.dao.TallerDAO;
import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.dao.impl.FileTaller;
import com.flotataxis.modelo.Taller;
import com.flotataxis.negocio.TallerBsn;
import com.flotataxis.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public class TallerBsnImpl implements TallerBsn {
    private TallerDAO tallerDAO;

    public TallerBsnImpl() {
        tallerDAO = new FileTaller();
    }
    
    
    @Override
    public List<String[]> listarTaller() {
    return tallerDAO.listarTaller();
    }

    @Override
    public String[] consultarTaller(String id) {
    return tallerDAO.consultarTaller(id);
    }

    @Override
    public void armacenarTaller(Taller taller) throws YaExisteException {
     try {
            tallerDAO.armacenarTaller(taller);
        } catch (LlaveDuplicadaException lde) {
          throw new YaExisteException();
        }
    }

    @Override
    public boolean eliminarTaller(String codigo) {
    return tallerDAO.eliminarTaller(codigo);
    }

    @Override
    public void actualizarTaller(Taller taller) {
    tallerDAO.actualizarTaller(taller);
    }
    
}
