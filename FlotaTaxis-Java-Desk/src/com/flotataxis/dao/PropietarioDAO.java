/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.dao;

import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.modelo.Propietario;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public interface PropietarioDAO {
    public List<String[]> listarPropietario();

    public String[] consultarPropietario(String id);
    public void almacenarPropietario(Propietario propietario) throws LlaveDuplicadaException;      
    public boolean eliminarPropietario(String id);
    public void actualizarPropietario(Propietario propietario);
}
