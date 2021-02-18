package com.flotataxis.vista;

import com.flotataxis.modelo.Taller;
import com.flotataxis.negocio.TallerBsn;
import com.flotataxis.negocio.exceptions.NoSeEncuentraException;
import com.flotataxis.negocio.exceptions.YaExisteException;
import com.flotataxis.negocio.impl.TallerBsnImpl;
import com.flotataxis.reportes.ExportarExcel;
import com.flotataxis.reportes.GeneradorStyleExcel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author Luis Angel
 */
public class FrmTalleres extends javax.swing.JFrame {

    ExportarExcel obj;
    TallerBsn tallerBsn = new TallerBsnImpl();
    List<String[]> talleres = new ArrayList<>();
    private String talleresSelecDoc ="";
        
    public FrmTalleres(String llamo) {
        initComponents();
        this.setLocationRelativeTo(null);//para centrar la ventana
        String ruta = "C:\\Users\\Public\\Documents\\talleres.txt";
        File archivo = new File(ruta);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        mostrarTodos();
        //validamos que submenu llamo a este formulario, para saber que controles habilitar
        switch (llamo) {
            case "registrar"://si se llamo desde el submenu registrar entonces
                //habilito tales controles y deshabilito tales controles
                txteliminarcodigo.setEnabled(false);
                btneliminar.setEnabled(false);
                txtbuscarcodigo.setEnabled(false);
                btnbuscar.setEnabled(false);
                btnmostrartodos.setEnabled(false);
                btndescargarreporte.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "eliminar":
                txtcodigo.setEnabled(false);
                txtdireccion.setEnabled(false);
                txtnombre.setEnabled(false);
                txttelefono.setEnabled(false);
                btnguardar.setEnabled(false);
                btnlimpiar.setEnabled(false);
                txtbuscarcodigo.setEnabled(false);
                btnbuscar.setEnabled(false);
                btnmostrartodos.setEnabled(false);
                btndescargarreporte.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "buscar":
                txtcodigo.setEnabled(false);
                txtdireccion.setEnabled(false);
                txtnombre.setEnabled(false);
                txttelefono.setEnabled(false);
                btnguardar.setEnabled(false);
                btnlimpiar.setEnabled(false);
                txteliminarcodigo.setEnabled(false);
                btneliminar.setEnabled(false);
                btndescargarreporte.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "rpt":
                txtcodigo.setEnabled(false);
                txtdireccion.setEnabled(false);
                txtnombre.setEnabled(false);
                txttelefono.setEnabled(false);
                btnguardar.setEnabled(false);
                btnlimpiar.setEnabled(false);
                txteliminarcodigo.setEnabled(false);
                btneliminar.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "buscarDesdeOtroForm":
                //a diferencia del otro buscar es que este habilita la tabla
                txteliminarcodigo.setEnabled(false);
                btneliminar.setEnabled(false);
                btndescargarreporte.setEnabled(false);
                btnaceptar.setEnabled(true);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnlimpiar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbuscarcodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txteliminarcodigo = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        jButtonsalir = new javax.swing.JButton();
        btndescargarreporte = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnmostrartodos = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnaceptar = new javax.swing.JButton();
        txtseleccionados = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Talleres");
        setResizable(false);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Eliminar Taller");

        jLabel8.setText("Código:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Talleres");

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Registrar Taller");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Buscar Taller");

        jLabel3.setText("Código:");

        jLabel4.setText("Nombre:");

        jLabel10.setText("Código:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Teléfono:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Código", "Dirección", "Teléfono"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jButtonsalir.setText("Salir");
        jButtonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalirActionPerformed(evt);
            }
        });

        btndescargarreporte.setText("Descargar Reporte");
        btndescargarreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndescargarreporteActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnmostrartodos.setText("Mostrar Todos");
        btnmostrartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrartodosActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Copyright © 2018 Luis Angel Vanegas Martinez. Reservados todos los derechos.");
        jLabel15.setToolTipText("");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnaceptar.setText("Aceptar");
        btnaceptar.setEnabled(false);
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        txtseleccionados.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Talleres Seleccionados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnbuscar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnlimpiar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnguardar))
                                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txttelefono))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(txtcodigo)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtbuscarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txteliminarcodigo))
                                .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonsalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(btnmostrartodos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btndescargarreporte)
                                        .addGap(47, 47, 47)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtseleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnaceptar)
                                        .addGap(36, 36, 36))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)))))))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonsalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtseleccionados))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnlimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txteliminarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtbuscarcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(btnmostrartodos)
                    .addComponent(btndescargarreporte)
                    .addComponent(btnaceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirActionPerformed
        //direcciona al menu y oculta la ventana talleres
        this.setVisible(false);
    }//GEN-LAST:event_jButtonsalirActionPerformed

    private void btndescargarreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndescargarreporteActionPerformed
        String nombreReporte = "Reporte de Talleres";
        //el siguiente es el header del reporte
        List<String> header = new ArrayList<String>();
        header.add("Código");
        header.add("Nombre");
        header.add("Teléfono");
        header.add("Dirección");

        //generamos el informe de estudiantes partiendo del archivo
        HSSFWorkbook workbook = new GeneradorStyleExcel().generateExcel(jTable1, nombreReporte, header);
        //exprtamos el excel al pc
        try {
            obj = new ExportarExcel();
            obj.exportarExcel(workbook, nombreReporte);
        } catch (IOException ex) {
            Logger.getLogger(FrmTalleres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndescargarreporteActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if (evt.getClickCount() == 2) {
            int fila = jTable1.getSelectedRow();
            String taller[] = new String[4];
            taller[0] = jTable1.getValueAt(fila, 0).toString();
            taller[1] = jTable1.getValueAt(fila, 1).toString();
            taller[2] = jTable1.getValueAt(fila, 2).toString();
            taller[3] = jTable1.getValueAt(fila, 3).toString();
            talleresSelecDoc= talleresSelecDoc+jTable1.getValueAt(fila, 0).toString()+"\n";   
            //eliminamos la fila que seleccionamos para que no la buelvan a seleccionar
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel(); 
            modelo.removeRow(fila); 
            talleres.add(taller);
            txtseleccionados.setText("");
            txtseleccionados.setText(talleresSelecDoc);
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        if (txtnombre.getText().length() > 0 && txtcodigo.getText().length() > 0 && txtdireccion.getText().length() > 0 && txttelefono.getText().length() > 0) {
            Taller conductor = new Taller(txtnombre.getText(), txtcodigo.getText(), txtdireccion.getText(), txttelefono.getText());
            try {
                tallerBsn.armacenarTaller(conductor);
            } catch (YaExisteException ex) {
                JOptionPane.showMessageDialog(null, "Ya se encuentra almacenado", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
            mostrarTodos();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Faltan Campos Por llenar", "Error", HEIGHT);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (txteliminarcodigo.getText().length() > 0) {
            tallerBsn.eliminarTaller(txteliminarcodigo.getText());
            mostrarTodos();
        } else {
            JOptionPane.showMessageDialog(null, "Faltan Campos Por llenar", "Error", HEIGHT);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        if (txtbuscarcodigo.getText().length() > 0) {
            try {
                limpiartabla();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(tallerBsn.consultarTaller(txtbuscarcodigo.getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Faltan Campos Por llenar", "Error", HEIGHT);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmostrartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrartodosActionPerformed
        // TODO add your handling code here:
        mostrarTodos();
    }//GEN-LAST:event_btnmostrartodosActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        FrmTaxis.listaTalleres =talleres;
         FrmTaxis.txtAreaTaller.setText("");
        FrmTaxis.txtAreaTaller.setText(talleresSelecDoc);
        
        this.setVisible(false);
        
    }//GEN-LAST:event_btnaceptarActionPerformed
    private void mostrarTodos() {
        limpiartabla();
        List<String[]> conductores = tallerBsn.listarTaller();
        for (int i = 0; i < conductores.size(); i++) {
            //Agregamos los datos que hemos almacenado anteriormente, a la tabla
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String filaNueva[] = conductores.get(i);
            model.addRow(filaNueva);
        }
    }

    private void limpiarCampos() {
        txtcodigo.setText("");
        txtdireccion.setText("");
        txtnombre.setText("");
        txttelefono.setText("");
    }

    //el sgt bloque de codigo es para limpiar los datos de la tabla
    public void limpiartabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTalleres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTalleres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTalleres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTalleres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTalleres("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btndescargarreporte;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmostrartodos;
    private javax.swing.JButton jButtonsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbuscarcodigo;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txteliminarcodigo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtseleccionados;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
