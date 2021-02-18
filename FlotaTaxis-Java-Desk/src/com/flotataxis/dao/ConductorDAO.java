/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.dao;

import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.modelo.Conductor;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public interface ConductorDAO {
    public List<String[]> listarConductor();
    public String[] consultarConductor(String id);
    public void almacenarConductor(Conductor conductor) throws LlaveDuplicadaException;   
    public boolean eliminarConductor(String id);
    public void actualizarConductor(Conductor conductor);
}
