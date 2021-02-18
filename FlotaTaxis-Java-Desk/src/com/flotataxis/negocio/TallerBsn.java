/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.negocio;

import com.flotataxis.modelo.Taller;
import com.flotataxis.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public interface TallerBsn {
    public List<String[]> listarTaller();
    public String[] consultarTaller(String id);
    public void armacenarTaller(Taller taller) throws YaExisteException; 
    public boolean eliminarTaller(String codigo);  
    public void actualizarTaller(Taller taller);
}
