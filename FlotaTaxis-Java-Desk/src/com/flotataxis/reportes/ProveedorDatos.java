/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flotataxis.reportes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Luis Angel
 */
public class ProveedorDatos {
	
	/**
	 * Retorna los valores de la tabla
	 * @param numeroFilas Number of rows we want to receive
	 * @return Values
	 */
	public static List<List<String>> getTableContent( JTable table, int numeroColumnas) {
		if (table.getRowCount() <= 0) {
			throw new IllegalArgumentException("El Numero de Filas debe ser un Entero Positivo");
		}
		
		List<List<String>> tableContent = new ArrayList<List<String>>();

		List<String> row = null;
                //recorremos el jTable y vamos almacenando cada fila a la fila de la lista
                for(int i=0;i<table.getRowCount();i++){
                    tableContent.add(row = new ArrayList<String>());
                    for(int j=0; j<numeroColumnas;j++){
			row.add(table.getValueAt(i, j).toString());
                    }
		}
		
		return tableContent;
	}
	
}
