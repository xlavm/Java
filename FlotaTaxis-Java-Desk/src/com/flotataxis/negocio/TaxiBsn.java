/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.negocio;

import com.flotataxis.modelo.Taxi;
import com.flotataxis.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public interface TaxiBsn {
        public List<String[]> listarTaxi();
    public String[] consultarTaxi(String id);
    public void almacenarTaxi(Taxi taxi) throws YaExisteException; 
    public boolean eliminarTaxi(String placa);
    public void actualizarTaxi(Taxi taxi);
}
