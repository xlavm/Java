/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.dao.impl;

import com.flotataxis.dao.PropietarioDAO;
import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.modelo.Propietario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Angel
 */
public class FilePropietario implements PropietarioDAO {

    private final static String nombreArchivo = "C:\\Users\\Public\\Documents\\propietarios.txt";
    
    @Override
    public List<String[]> listarPropietario() {
         String linea = null;
         FileTaxi ft= new FileTaxi();
        List<String[]> propietarios = new ArrayList<>();
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                String propietario[] = new String[7];
                propietario[0] = datos[0];
                propietario[1] = datos[1];
                propietario[2] = datos[2];
                propietario[3] = datos[3];
                propietario[4] = datos[4];
                propietario[5] = datos[5];
                propietario[6] = datos[6];
                propietarios.add(propietario);
                
            }
            bufferedReader.close();
            return propietarios;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }

    @Override
    public String[] consultarPropietario(String id) {
      String linea = null;
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals(id)) {
                String propietario[] = new String[7];
                propietario[0] = datos[0];
                propietario[1] = datos[1];
                propietario[2] = datos[2];
                propietario[3] = datos[3];
                propietario[4] = datos[4];
                propietario[5] = datos[5];
                propietario[6] = datos[6];
                    bufferedReader.close();
                    return propietario;
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }

    @Override
    public void almacenarPropietario(Propietario propietario) throws LlaveDuplicadaException {
      if (consultarPropietario(propietario.getIdentificacion()) != null) {
            throw new LlaveDuplicadaException();
        }
        try {
            FileWriter escritor = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);
            bufferedWriter.write(propietario.getIdentificacion());
            bufferedWriter.write(",");
            bufferedWriter.write(propietario.getNombre());
            bufferedWriter.write(",");
            bufferedWriter.write(propietario.getApellidos());
            bufferedWriter.write(",");
            bufferedWriter.write(propietario.getEdad());
            bufferedWriter.write(",");
            bufferedWriter.write(propietario.getGenero());
            bufferedWriter.write(",");
            bufferedWriter.write(propietario.getTelefono());
            bufferedWriter.write(",");
            bufferedWriter.write(propietario.listarTaxis());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Override
    public boolean eliminarPropietario(String id) {
        boolean retorno=false;
    try {
            File inFile = new File(nombreArchivo);
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[0].equals(id)) {
                    retorno = true;
                } else {
                    pw.println(line);
                }
            }
            pw.close();
            br.close();
            if (!inFile.delete()) {
                JOptionPane.showMessageDialog(null, "No se puede borrar", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
            if (!tempFile.renameTo(inFile)) {
                JOptionPane.showMessageDialog(null, "No se puede renombrar el archivo", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    return retorno;
    }

    @Override
    public void actualizarPropietario(Propietario propietario) {
    try {
            File inFile = new File(nombreArchivo);
            File tempFile = new File(inFile.getAbsolutePath()+".tmp");
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[0].equals(propietario.getIdentificacion())) {
                    pw.print(propietario.getIdentificacion()+","+propietario.getNombre()+","+
                            propietario.getApellidos()+","+propietario.getEdad()+","+propietario.getGenero()+","
                            +propietario.getTelefono()+","+propietario.listarTaxis());
                } else {
                    pw.println(line);
                }
            }
            pw.close();
            br.close();
            if (!inFile.delete()) {
               JOptionPane.showMessageDialog(null, "No se puede Borrar", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
            if (!tempFile.renameTo(inFile)) {
                JOptionPane.showMessageDialog(null, "No se puede renombrar el archivo", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
