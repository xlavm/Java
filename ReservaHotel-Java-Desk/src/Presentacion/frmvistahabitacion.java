package Presentacion;
import Logica.fhabitacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*** @author Luis Angel*/
public class frmvistahabitacion extends javax.swing.JFrame {
    public frmvistahabitacion() {
        initComponents();
        mostrar("");
        this.setTitle("Buscar Habitaciones"); //titulo formulario
        this.setLocationRelativeTo(null);//hace que el formulario aparezca en la parte central de la pantalla
    }
    //metodo silimar al de la calse fhabitaciones
    void ocultar_columnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    //metodo similar al de la clase fhabitaciones
     void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            fhabitacion func = new fhabitacion();
            modelo = func.mostrarvista(buscar);
            tablalistado.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Registros " + Integer.toString(func.totalregistros));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Habitaciones"));

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablalistadoMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tablalistado);

        jLabel9.setText("Buscar");

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscar.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(lbltotalregistros))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked

    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMousePressed
        if (evt.getClickCount() == 2) {//si hago 2 clic, debemos tener en cuenta el evento
            int fila= tablalistado.getSelectedRow();//selecciona la fila 
            String cod;
            String valor;
            //obtiene los valores de cada columna de la fila seleccionada 
            cod=tablalistado.getValueAt(fila, 0).toString();
            valor=tablalistado.getValueAt(fila, 1).toString();
            //los valores obtenidos los pasa a dichos campos del formulario reserva
            frmreserva.txtidhabitacion.setText(cod);
            frmreserva.txtnumero.setText(valor);
            this.dispose(); 
        }
    }//GEN-LAST:event_tablalistadoMousePressed

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
            java.util.logging.Logger.getLogger(frmvistahabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmvistahabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmvistahabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmvistahabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmvistahabitacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
