/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.negocio.impl;

import com.flotataxis.dao.TaxiDAO;
import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.dao.impl.FileTaxi;
import com.flotataxis.modelo.Taxi;
import com.flotataxis.negocio.TaxiBsn;
import com.flotataxis.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public class TaxiBsnImpl implements TaxiBsn {
    private TaxiDAO taxiDAO;
    
    public TaxiBsnImpl() {
        taxiDAO = new FileTaxi();
    }
    @Override
    public List<String[]> listarTaxi() {
    return taxiDAO.listarTaxi();
    }

    @Override
    public String[] consultarTaxi(String id) {
     return taxiDAO.consultarTaxi(id);
    }

    @Override
    public void almacenarTaxi(Taxi taxi) throws YaExisteException {
     try {
            taxiDAO.almacenarTaxi(taxi);
        } catch (LlaveDuplicadaException lde) {
          throw new YaExisteException();
        }
    }
    

    @Override
    public boolean eliminarTaxi(String placa) {
    return taxiDAO.eliminarTaxi(placa);
      }

    @Override
    public void actualizarTaxi(Taxi taxi) {
    taxiDAO.actualizarTaxi(taxi);
    }
    
}
