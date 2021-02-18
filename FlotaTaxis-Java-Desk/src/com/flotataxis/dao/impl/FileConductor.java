/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.dao.impl;

import com.flotataxis.dao.ConductorDAO;
import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.modelo.Conductor;
import com.flotataxis.modelo.Taxi;
import com.flotataxis.negocio.exceptions.NoSeEncuentraException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Angel
 */
public class FileConductor implements ConductorDAO {
private final static String nombreArchivo = "C:\\Users\\Public\\Documents\\conductores.txt";
    
    @Override
    public List<String[]> listarConductor() {
        String linea = null;
        List<String[]> conductores = new ArrayList<>();
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                String conductor[] = new String[7];
                conductor[0] = datos[0];
                conductor[1] = datos[1];
                conductor[2] = datos[2];
                conductor[3] = datos[3];
                conductor[4] = datos[4];
                conductor[5] = datos[5];
                conductor[6] = datos[6];
                conductores.add(conductor);
            }
            bufferedReader.close();
            return conductores;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }

   @Override
   public String[] consultarConductor(String id) {
        String linea = null;
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals(id)) {
                    String conductor[] = new String[7];
                    conductor[0] = datos[0];
                    conductor[1] = datos[1];
                    conductor[2] = datos[2];
                    conductor[3] = datos[3];
                    conductor[4] = datos[4];
                    conductor[5] = datos[5];
                    conductor[6] = datos[6];
                    bufferedReader.close();
                    return conductor;
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
    public void almacenarConductor(Conductor conductor) throws LlaveDuplicadaException {
     if (consultarConductor(conductor.getIdentificacion()) != null) {
            throw new LlaveDuplicadaException();
        }
        try {
            FileWriter escritor = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);
            bufferedWriter.write(conductor.getIdentificacion());
            bufferedWriter.write(",");
            bufferedWriter.write(conductor.getNombre());
            bufferedWriter.write(",");
            bufferedWriter.write(conductor.getApellidos());
            bufferedWriter.write(",");
            bufferedWriter.write(conductor.getEdad());
            bufferedWriter.write(",");
            bufferedWriter.write(conductor.getGenero());
            bufferedWriter.write(",");
            bufferedWriter.write(conductor.getTelefono());
            bufferedWriter.write(",");
            bufferedWriter.write(conductor.listarTaxis());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Override
    public boolean eliminarConductor(String id) {
        boolean retorno=false;
    try {
            File inFile = new File(nombreArchivo);
            File tempFile = new File(inFile.getAbsolutePath()+".tmp");
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[0].equals(id)) {
                    retorno=true;
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
       return retorno; 
    }
    @Override
    public void actualizarConductor(Conductor conductor){
    try {
            File inFile = new File(nombreArchivo);
            File tempFile = new File(inFile.getAbsolutePath()+".tmp");
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[0].equals(conductor.getIdentificacion())) {
                    pw.print(conductor.getIdentificacion()+","+conductor.getNombre()+","+
                            conductor.getApellidos()+","+conductor.getEdad()+","+conductor.getGenero()+","
                            +conductor.getTelefono()+","+conductor.listarTaxis());
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
    

