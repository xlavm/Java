/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.negocio;

import com.flotataxis.modelo.Propietario;
import com.flotataxis.negocio.exceptions.YaExisteException;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public interface PropietarioBsn {

    public List<String[]> listarPropietario();

    public String[] consultarPropietario(String id);

    public void almacenarPropietario(Propietario propietario) throws YaExisteException;

    public boolean eliminarPropietario(String id);

    public void actualizarPropietario(Propietario propietario);
}
