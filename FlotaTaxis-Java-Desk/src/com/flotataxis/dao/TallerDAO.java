/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.dao;

import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.modelo.Taller;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public interface TallerDAO {
    public List<String[]> listarTaller();
    public String[] consultarTaller(String id);
    public void armacenarTaller(Taller taller) throws LlaveDuplicadaException; 
    public boolean eliminarTaller(String codigo);
    public void actualizarTaller(Taller taller);
}
