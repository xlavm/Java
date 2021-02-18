/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.dao.impl;

import com.flotataxis.dao.TaxiDAO;
import com.flotataxis.dao.exceptions.LlaveDuplicadaException;
import com.flotataxis.modelo.Taxi;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Angel
 */
public class FileTaxi implements TaxiDAO{
private final static String nombreArchivo = "C:\\Users\\Public\\Documents\\taxis.txt";
   
    @Override
    public List<String[]> listarTaxi() {
    String linea = null;
        List<String[]> taxis = new ArrayList<>();
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                String taxi[] = new String[8];
                taxi[0] = datos[0];
                taxi[1] = datos[1];
                taxi[2] = datos[2];
                taxi[3] = datos[3];
                taxi[4] = datos[4];
                taxi[5] = datos[5];
                taxi[6] = datos[6];
                taxi[7] = datos[7];
                taxis.add(taxi);
            }
            bufferedReader.close();
            return taxis;
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }

    @Override
    public String[] consultarTaxi(String placa) {
     String linea = null;
        try {
            FileReader lectorArchivo = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lectorArchivo);
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[1].equals(placa)) {
                String taxi[] = new String[8];
                taxi[0] = datos[0];
                taxi[1] = datos[1];
                taxi[2] = datos[2];
                taxi[3] = datos[3];
                taxi[4] = datos[4];
                taxi[5] = datos[5];
                taxi[6] = datos[6];
                taxi[7] = datos[7];
                    bufferedReader.close();
                    return taxi;
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
    public void almacenarTaxi(Taxi taxi) throws LlaveDuplicadaException {
    if (consultarTaxi(taxi.getPlaca()) != null) {
            throw new LlaveDuplicadaException();
        }
        try {
            FileWriter escritor = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);
            bufferedWriter.write(taxi.getNumeroTaxi());
            bufferedWriter.write(",");
            bufferedWriter.write(taxi.getPlaca());
            bufferedWriter.write(",");
            bufferedWriter.write(taxi.getModelo());
            bufferedWriter.write(",");
            bufferedWriter.write(taxi.getMarca());
            bufferedWriter.write(",");
            bufferedWriter.write(taxi.getPropietario().getIdentificacion());
            bufferedWriter.write(",");
            bufferedWriter.write(taxi.getTurnos());
            bufferedWriter.write(",");
            bufferedWriter.write(taxi.listarConductores());
            bufferedWriter.write(",");
            bufferedWriter.write(taxi.listarTalleres());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

   

    @Override
    public boolean eliminarTaxi(String placa) {
        boolean retorno=false;
      try {
            File inFile = new File(nombreArchivo);
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[1].equals(placa)) {
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
    public void actualizarTaxi(Taxi taxi) {
    try {
            File inFile = new File(nombreArchivo);
            File tempFile = new File(inFile.getAbsolutePath()+".tmp");
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(",")[1].equals(taxi.getPlaca())) {
                    pw.print(taxi.getNumeroTaxi()+","+taxi.getPlaca()+","+taxi.getModelo()+","+taxi.getMarca()+","+taxi.getPropietario().getIdentificacion()
                            +","+taxi.getTurnos()+","+taxi.listarConductores()+","+taxi.listarTalleres()
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
