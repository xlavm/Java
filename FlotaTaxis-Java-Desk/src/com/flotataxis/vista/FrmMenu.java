package com.flotataxis.vista;
/**
 * @author Luis Angel
 */
public class FrmMenu extends javax.swing.JFrame {
    private String llamo="";
    public String getLlamo() {return llamo;}
    public void setLlamo(String llamo) {this.llamo = llamo;}
    
    
    public FrmMenu() {
        initComponents();
        this.setLocationRelativeTo(null);//para centrar la ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItemregistrarconduc = new javax.swing.JMenuItem();
        jMenuItemeliminarconduc = new javax.swing.JMenuItem();
        jMenuItembuscarconduc = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemregistrartaxi = new javax.swing.JMenuItem();
        jMenuItemeliminartaxi = new javax.swing.JMenuItem();
        jMenuItembuscartaxi = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemregistrarpropi = new javax.swing.JMenuItem();
        jMenuItemeliminarpropi = new javax.swing.JMenuItem();
        jMenuItembuscarpropi = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemregistrartaller = new javax.swing.JMenuItem();
        jMenuItemeliminartaller = new javax.swing.JMenuItem();
        jMenuItembuscartaller = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemrptconductores = new javax.swing.JMenuItem();
        jMenuItemrpttaxis = new javax.swing.JMenuItem();
        jMenuItemrptpropietarios = new javax.swing.JMenuItem();
        jMenuItemrpttalleres = new javax.swing.JMenuItem();
        jMenucreadores = new javax.swing.JMenu();
        jMenusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setResizable(false);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Copyright © 2018 Luis Angel Vanegas Martinez. Reservados todos los derechos.");
        jLabel16.setToolTipText("");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenuBar1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Inicio.png"))); // NOI18N
        jMenu1.setText("Sistema de Flota De Taxis ");
        jMenu1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/conductor.png"))); // NOI18N
        jMenu9.setText("Conductores");
        jMenu9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jMenuItemregistrarconduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/registrarusu.png"))); // NOI18N
        jMenuItemregistrarconduc.setText("Registrar Conductor");
        jMenuItemregistrarconduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemregistrarconducActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItemregistrarconduc);

        jMenuItemeliminarconduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminarusu.png"))); // NOI18N
        jMenuItemeliminarconduc.setText("Eliminar Conductor");
        jMenuItemeliminarconduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemeliminarconducActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItemeliminarconduc);

        jMenuItembuscarconduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscarusu.png"))); // NOI18N
        jMenuItembuscarconduc.setText("Buscar Conductor");
        jMenuItembuscarconduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItembuscarconducActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItembuscarconduc);

        jMenuBar1.add(jMenu9);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/taxi.png"))); // NOI18N
        jMenu3.setText("Taxis");
        jMenu3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jMenuItemregistrartaxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/registrarg.png"))); // NOI18N
        jMenuItemregistrartaxi.setText("Registrar Taxi");
        jMenuItemregistrartaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemregistrartaxiActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemregistrartaxi);

        jMenuItemeliminartaxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminarg.png"))); // NOI18N
        jMenuItemeliminartaxi.setText("Eliminar Taxi");
        jMenuItemeliminartaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemeliminartaxiActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemeliminartaxi);

        jMenuItembuscartaxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscarg.png"))); // NOI18N
        jMenuItembuscartaxi.setText("Buscar Taxi");
        jMenuItembuscartaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItembuscartaxiActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItembuscartaxi);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/registrarusu.png"))); // NOI18N
        jMenuItem1.setText("Asociar Conductor/Taller");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/propietario.png"))); // NOI18N
        jMenu4.setText("Propietarios");
        jMenu4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jMenuItemregistrarpropi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/registrarusu.png"))); // NOI18N
        jMenuItemregistrarpropi.setText("Registrar Propietario");
        jMenuItemregistrarpropi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemregistrarpropiActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemregistrarpropi);

        jMenuItemeliminarpropi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminarusu.png"))); // NOI18N
        jMenuItemeliminarpropi.setText("Eliminar Propietario");
        jMenuItemeliminarpropi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemeliminarpropiActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemeliminarpropi);

        jMenuItembuscarpropi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscarusu.png"))); // NOI18N
        jMenuItembuscarpropi.setText("Buscar Propietario");
        jMenuItembuscarpropi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItembuscarpropiActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItembuscarpropi);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/taller.png"))); // NOI18N
        jMenu5.setText("Talleres");
        jMenu5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jMenuItemregistrartaller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/registrarg.png"))); // NOI18N
        jMenuItemregistrartaller.setText("Registrar Taller");
        jMenuItemregistrartaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemregistrartallerActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemregistrartaller);

        jMenuItemeliminartaller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminarg.png"))); // NOI18N
        jMenuItemeliminartaller.setText("Eliminar Taller");
        jMenuItemeliminartaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemeliminartallerActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemeliminartaller);

        jMenuItembuscartaller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscarg.png"))); // NOI18N
        jMenuItembuscartaller.setText("Buscar Taller");
        jMenuItembuscartaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItembuscartallerActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItembuscartaller);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Archivo.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jMenuItemrptconductores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/conductor.png"))); // NOI18N
        jMenuItemrptconductores.setText("Conductores");
        jMenuItemrptconductores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemrptconductoresActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemrptconductores);

        jMenuItemrpttaxis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/taxi.png"))); // NOI18N
        jMenuItemrpttaxis.setText("Taxis");
        jMenuItemrpttaxis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemrpttaxisActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemrpttaxis);

        jMenuItemrptpropietarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/propietario.png"))); // NOI18N
        jMenuItemrptpropietarios.setText("Propietarios");
        jMenuItemrptpropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemrptpropietariosActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemrptpropietarios);

        jMenuItemrpttalleres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/taller.png"))); // NOI18N
        jMenuItemrpttalleres.setText("Talleres");
        jMenuItemrpttalleres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemrpttalleresActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemrpttalleres);

        jMenuBar1.add(jMenu6);

        jMenucreadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/creadores.png"))); // NOI18N
        jMenucreadores.setText("Creadores");
        jMenucreadores.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenucreadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenucreadoresMouseClicked(evt);
            }
        });
        jMenucreadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenucreadoresActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenucreadores);

        jMenusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Salir.png"))); // NOI18N
        jMenusalir.setText("Salir..");
        jMenusalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jMenusalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenusalirMouseClicked(evt);
            }
        });
        jMenusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenusalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenusalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(503, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//los 3 bloques siguientes son de los sub menus de CONDUCTORES
    private void jMenuItemregistrarconducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemregistrarconducActionPerformed
        FrmConductores abrirFrmConductores;
       abrirFrmConductores = new FrmConductores("registrar");
       abrirFrmConductores.setVisible(true);
    }//GEN-LAST:event_jMenuItemregistrarconducActionPerformed

    private void jMenuItemeliminarconducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemeliminarconducActionPerformed
        FrmConductores abrirFrmConductores;
       abrirFrmConductores = new FrmConductores("eliminar");
       abrirFrmConductores.setVisible(true);
    }//GEN-LAST:event_jMenuItemeliminarconducActionPerformed

    private void jMenuItembuscarconducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItembuscarconducActionPerformed
        FrmConductores abrirFrmConductores;
       abrirFrmConductores = new FrmConductores("buscar");
       abrirFrmConductores.setVisible(true);
    }//GEN-LAST:event_jMenuItembuscarconducActionPerformed
//los 3 bloques siguientes son de los sub menus de TAXIS
    private void jMenuItemregistrartaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemregistrartaxiActionPerformed
        FrmTaxis abrirFrmTaxis;
       abrirFrmTaxis = new FrmTaxis("registrar");
       abrirFrmTaxis.setVisible(true);
       
    }//GEN-LAST:event_jMenuItemregistrartaxiActionPerformed

    private void jMenuItemeliminartaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemeliminartaxiActionPerformed
       FrmTaxis abrirFrmTaxis;
       abrirFrmTaxis = new FrmTaxis("eliminar");
       abrirFrmTaxis.setVisible(true);
    }//GEN-LAST:event_jMenuItemeliminartaxiActionPerformed

    private void jMenuItembuscartaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItembuscartaxiActionPerformed
        FrmTaxis abrirFrmTaxis;
       abrirFrmTaxis = new FrmTaxis("buscar");
       abrirFrmTaxis.setVisible(true);
    }//GEN-LAST:event_jMenuItembuscartaxiActionPerformed
// los 3  bloques siguientes son de los sub menus de PROPIETARIOS
    private void jMenuItemregistrarpropiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemregistrarpropiActionPerformed
        FrmPropietarios abrirFrmPropietarios;
       abrirFrmPropietarios = new FrmPropietarios("registrar");
       abrirFrmPropietarios.setVisible(true);
    }//GEN-LAST:event_jMenuItemregistrarpropiActionPerformed

    private void jMenuItemeliminarpropiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemeliminarpropiActionPerformed
        FrmPropietarios abrirFrmPropietarios;
       abrirFrmPropietarios = new FrmPropietarios("eliminar");
       abrirFrmPropietarios.setVisible(true);
    }//GEN-LAST:event_jMenuItemeliminarpropiActionPerformed

    private void jMenuItembuscarpropiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItembuscarpropiActionPerformed
        FrmPropietarios abrirFrmPropietarios;
       abrirFrmPropietarios = new FrmPropietarios("buscar");
       abrirFrmPropietarios.setVisible(true);
    }//GEN-LAST:event_jMenuItembuscarpropiActionPerformed
//los 3 bloques siguientes son de los sub menus de TALLERES
    private void jMenuItemregistrartallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemregistrartallerActionPerformed
        FrmTalleres abrirFrmTalleres;
       abrirFrmTalleres = new FrmTalleres("registrar");
       abrirFrmTalleres.setVisible(true);
    }//GEN-LAST:event_jMenuItemregistrartallerActionPerformed

    private void jMenuItemeliminartallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemeliminartallerActionPerformed
             FrmTalleres abrirFrmTalleres;
       abrirFrmTalleres = new FrmTalleres("eliminar");
       abrirFrmTalleres.setVisible(true);
    }//GEN-LAST:event_jMenuItemeliminartallerActionPerformed

    private void jMenuItembuscartallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItembuscartallerActionPerformed
             FrmTalleres abrirFrmTalleres;
       abrirFrmTalleres = new FrmTalleres("buscar");
       abrirFrmTalleres.setVisible(true);
    }//GEN-LAST:event_jMenuItembuscartallerActionPerformed
//los 4 bloques siguientes son de los sub menus de REPORTES
    private void jMenuItemrptconductoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemrptconductoresActionPerformed
       FrmConductores abrirFrmConductores;
       abrirFrmConductores = new FrmConductores("rpt");
       abrirFrmConductores.setVisible(true);
    }//GEN-LAST:event_jMenuItemrptconductoresActionPerformed

    private void jMenuItemrpttaxisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemrpttaxisActionPerformed
        FrmTaxis abrirFrmTaxis;
       abrirFrmTaxis = new FrmTaxis("rpt");
       abrirFrmTaxis.setVisible(true);
    }//GEN-LAST:event_jMenuItemrpttaxisActionPerformed

    private void jMenuItemrptpropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemrptpropietariosActionPerformed
        FrmPropietarios abrirFrmPropietarios;
       abrirFrmPropietarios = new FrmPropietarios("rpt");
       abrirFrmPropietarios.setVisible(true);
    }//GEN-LAST:event_jMenuItemrptpropietariosActionPerformed

    private void jMenuItemrpttalleresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemrpttalleresActionPerformed
        FrmTalleres abrirFrmTalleres;
       abrirFrmTalleres = new FrmTalleres("rpt");
       abrirFrmTalleres.setVisible(true);
    }//GEN-LAST:event_jMenuItemrpttalleresActionPerformed

    private void jMenusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenusalirActionPerformed
        
    }//GEN-LAST:event_jMenusalirActionPerformed

    private void jMenucreadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenucreadoresActionPerformed

    }//GEN-LAST:event_jMenucreadoresActionPerformed

    private void jMenusalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenusalirMouseClicked
        this.dispose(); this.setVisible(false);System.exit(0);//salir del sistema  
    }//GEN-LAST:event_jMenusalirMouseClicked

    private void jMenucreadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenucreadoresMouseClicked
       FrmCreadores abrirFrmCreadores;
       abrirFrmCreadores = new FrmCreadores();
       abrirFrmCreadores.setVisible(true);
    }//GEN-LAST:event_jMenucreadoresMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmTaxis abrirFrmTaxis;
       abrirFrmTaxis = new FrmTaxis("asociar");
       abrirFrmTaxis.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel16;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItembuscarconduc;
    private javax.swing.JMenuItem jMenuItembuscarpropi;
    private javax.swing.JMenuItem jMenuItembuscartaller;
    private javax.swing.JMenuItem jMenuItembuscartaxi;
    private javax.swing.JMenuItem jMenuItemeliminarconduc;
    private javax.swing.JMenuItem jMenuItemeliminarpropi;
    private javax.swing.JMenuItem jMenuItemeliminartaller;
    private javax.swing.JMenuItem jMenuItemeliminartaxi;
    private javax.swing.JMenuItem jMenuItemregistrarconduc;
    private javax.swing.JMenuItem jMenuItemregistrarpropi;
    private javax.swing.JMenuItem jMenuItemregistrartaller;
    private javax.swing.JMenuItem jMenuItemregistrartaxi;
    private javax.swing.JMenuItem jMenuItemrptconductores;
    private javax.swing.JMenuItem jMenuItemrptpropietarios;
    private javax.swing.JMenuItem jMenuItemrpttalleres;
    private javax.swing.JMenuItem jMenuItemrpttaxis;
    private javax.swing.JMenu jMenucreadores;
    private javax.swing.JMenu jMenusalir;
    // End of variables declaration//GEN-END:variables
}
