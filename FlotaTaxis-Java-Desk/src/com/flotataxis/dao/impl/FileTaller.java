/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.dao.impl;

import com.flotataxis.dao.TallerDAO;
import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.modelo.Taller;
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
public class FileTaller implements TallerDAO{
private final static String nombreArchivo = "C:\\Users\\Public\\Documents\\talleres.txt";

    @Override
    public List<String[]> listarTaller() {
    String linea = null;
        List<String[]> talleres = new ArrayList<>();
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                String taller[] = new String[5];
                taller[0] = datos[0];
                taller[1] = datos[1];
                taller[2] = datos[2];
                taller[3] = datos[3];
                taller[4] = datos[4];
                talleres.add(taller);
            }
            bufferedReader.close();
            return talleres;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }

    @Override
    public String[] consultarTaller(String id) {
    String linea = null;
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[1].equals(id)) {
                String taller[] = new String[5];
                taller[0] = datos[0];
                taller[1] = datos[1];
                taller[2] = datos[2];
                taller[3] = datos[3];
                taller[4] = datos[4];
                bufferedReader.close();
                return taller;
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
    public void armacenarTaller(Taller taller) throws LlaveDuplicadaException {
     if (consultarTaller(taller.getCodigo()) != null) {
            throw new LlaveDuplicadaException();
        }
        try {
            FileWriter escritor = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);
            bufferedWriter.write(taller.getNombre());
            bufferedWriter.write(",");
            bufferedWriter.write(taller.getCodigo());
            bufferedWriter.write(",");
            bufferedWriter.write(taller.getDireccion());
            bufferedWriter.write(",");
            bufferedWriter.write(taller.getTelefono());
            bufferedWriter.write(",");
            bufferedWriter.write(taller.listarTaxis());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

   
    @Override
    public boolean eliminarTaller(String codigo) {
        boolean retorno = false;
     try {
            File inFile = new File(nombreArchivo);
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[1].equals(codigo)) {
                    retorno=true;
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
    public void actualizarTaller(Taller taller) {
   try {
            File inFile = new File(nombreArchivo);
            File tempFile = new File(inFile.getAbsolutePath()+".tmp");
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[1].equals(taller.getCodigo())) {
                    pw.print(taller.getNombre()+","+taller.getCodigo()+","+taller.getDireccion()+","+taller.getTelefono()+","+taller.listarTaxis()
                    );
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
