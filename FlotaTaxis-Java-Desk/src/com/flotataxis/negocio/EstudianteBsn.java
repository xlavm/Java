package com.flotataxis.negocio;

import com.flotataxis.modelo.Estudiante;
import com.flotataxis.negocio.exceptions.EstudianteYaExisteException;
import com.flotataxis.negocio.exceptions.PromedioFueraDeRangoException;

import java.util.List;

/**
 *
 * @author Luis Angel
 */
public interface EstudianteBsn {

    public void almacenarEstudiante(Estudiante estudiante) throws EstudianteYaExisteException, PromedioFueraDeRangoException;

    public List<Estudiante> listarEstudiantes();


}
