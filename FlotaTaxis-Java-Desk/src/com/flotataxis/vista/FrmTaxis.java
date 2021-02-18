package com.flotataxis.vista;

import com.flotataxis.modelo.Propietario;
import com.flotataxis.modelo.Taxi;
import com.flotataxis.negocio.impl.TaxiBsnImpl;
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
public class FrmTaxis extends javax.swing.JFrame {

    ExportarExcel obj;
    TaxiBsnImpl taxiBsn = new TaxiBsnImpl();
    public static Propietario propietario = new Propietario();
    public static List<String[]> listaTalleres = new ArrayList();
    public static List<String[]> listaConductores = new ArrayList();
    private String meLlamo;

    public FrmTaxis(String llamo) {
        initComponents();
        this.setLocationRelativeTo(null);//para centrar la ventana
        String ruta = "C:\\Users\\Public\\Documents\\taxis.txt";
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
                txtbuscarnrplaca.setEnabled(false);
                btnbuscar.setEnabled(false);
                txteliminarnroplaca.setEnabled(false);
                btneliminar.setEnabled(false);
                btnmostrartodos.setEnabled(false);
                btndescargarreporte.setEnabled(false);
                btnguardar.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "eliminar":
                txtmarca.setEnabled(false);
                txtmodelo.setEnabled(false);
                txtnroplaca.setEnabled(false);
                txtnrotaxi.setEnabled(false);
                btnguardar.setEnabled(false);
                btnlimpiar.setEnabled(false);
                txtbuscarnrplaca.setEnabled(false);
                btnbuscar.setEnabled(false);
                btnmostrartodos.setEnabled(false);
                btndescargarreporte.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "buscar":
                txtmarca.setEnabled(false);
                txtmodelo.setEnabled(false);
                txtnroplaca.setEnabled(false);
                txtnrotaxi.setEnabled(false);
                btnguardar.setEnabled(false);
                btnlimpiar.setEnabled(false);
                txteliminarnroplaca.setEnabled(false);
                btneliminar.setEnabled(false);
                btndescargarreporte.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "rpt":
                txtmarca.setEnabled(false);
                txtmodelo.setEnabled(false);
                txtnroplaca.setEnabled(false);
                txtnrotaxi.setEnabled(false);
                btnguardar.setEnabled(false);
                btnlimpiar.setEnabled(false);
                txteliminarnroplaca.setEnabled(false);
                btneliminar.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "asociar":
                txtmarca.setEnabled(false);
                txtmodelo.setEnabled(false);
                txtnroplaca.setEnabled(false);
                txtnrotaxi.setEnabled(false);
                btnlimpiar.setEnabled(false);
                txteliminarnroplaca.setEnabled(false);
                btneliminar.setEnabled(false);
                btndescargarreporte.setEnabled(false);
                btnbuscarpropietario.setEnabled(false);
                break;
        }
        meLlamo = llamo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnrotaxi = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        jButtonsalir = new javax.swing.JButton();
        btndescargarreporte = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtnroplaca = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        btnmostrartodos = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtpropietario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnbuscarconductor = new javax.swing.JButton();
        btnbuscarpropietario = new javax.swing.JButton();
        btnbuscartaller = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaTaller = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaConductor = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaTurno = new javax.swing.JTextArea();
        btnbuscarturno = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtbuscarnrplaca = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        txteliminarnroplaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Taxis");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Taxis");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Registrar Taxi");

        jLabel3.setText("Nro. Taxi:");

        jLabel5.setText("Modelo:");

        jLabel6.setText("Marca:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro Taxi", "Nro Placa", "Modelo", "Marca", "Propietario", "Turno", "Conductores", "Talleres"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jLabel10.setText("Nro. Placa:");

        btnmostrartodos.setText("Mostrar Todos");
        btnmostrartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrartodosActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Copyright © 2018 Luis Angel Vanegas Martinez. Reservados todos los derechos.");
        jLabel13.setToolTipText("");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtpropietario.setEditable(false);

        jLabel11.setText("Propietario:");

        jLabel12.setText("Taller:");

        jLabel14.setText("Conductor:");

        jLabel15.setText("Truno:");

        btnbuscarconductor.setText("...");
        btnbuscarconductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarconductorActionPerformed(evt);
            }
        });

        btnbuscarpropietario.setText("...");
        btnbuscarpropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarpropietarioActionPerformed(evt);
            }
        });

        btnbuscartaller.setText("...");
        btnbuscartaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscartallerActionPerformed(evt);
            }
        });

        txtAreaTaller.setEditable(false);
        txtAreaTaller.setColumns(20);
        txtAreaTaller.setRows(5);
        jScrollPane2.setViewportView(txtAreaTaller);

        txtAreaConductor.setEditable(false);
        txtAreaConductor.setColumns(20);
        txtAreaConductor.setRows(5);
        jScrollPane3.setViewportView(txtAreaConductor);

        txtAreaTurno.setEditable(false);
        txtAreaTurno.setColumns(20);
        txtAreaTurno.setRows(5);
        jScrollPane4.setViewportView(txtAreaTurno);

        btnbuscarturno.setText("...");
        btnbuscarturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarturnoActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        txtbuscarnrplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarnrplacaActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Nro. Placa:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbuscar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscarnrplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarnrplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar Taxi", jPanel1);

        jLabel8.setText("Nro. Placa:");

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btneliminar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txteliminarnroplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txteliminarnroplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Taxi", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonsalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtnrotaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel10))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnroplaca)
                                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnbuscarconductor)
                                        .addComponent(btnbuscarturno))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscartaller))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnlimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnguardar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnbuscarpropietario)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 663, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnmostrartodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndescargarreporte)
                                .addGap(103, 103, 103))))
                    .addComponent(jSeparator4))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButtonsalir))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtnrotaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnroplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnbuscarturno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnbuscarconductor)
                                    .addComponent(jLabel14)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(112, 112, 112)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnbuscartaller)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnbuscarpropietario)
                                    .addComponent(jLabel11)
                                    .addComponent(txtpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiar)
                    .addComponent(btnguardar)
                    .addComponent(btnmostrartodos)
                    .addComponent(btndescargarreporte))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirActionPerformed
        //oculta la ventana taxis
        this.setVisible(false);
    }//GEN-LAST:event_jButtonsalirActionPerformed

    private void txtbuscarnrplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarnrplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarnrplacaActionPerformed

    private void btndescargarreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndescargarreporteActionPerformed
        String nombreReporte = " Reporte de Taxis ";
        //el siguiente es el header del reporte
        List<String> header = new ArrayList<String>();
        header.add("Nro Taxi");
        header.add("Nro Placa");
        header.add("Modelo");
        header.add("Marca");
        header.add("Propietario");
        header.add("Turno");
        header.add("Conductores");
        header.add("Talleres");

        //generamos el informe de estudiantes partiendo del archivo
        HSSFWorkbook workbook = new GeneradorStyleExcel().generateExcel(jTable1, nombreReporte, header);
        //exprtamos el excel al pc
        try {
            obj = new ExportarExcel();
            obj.exportarExcel(workbook, nombreReporte);
        } catch (IOException ex) {
            Logger.getLogger(FrmTaxis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndescargarreporteActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (txtnrotaxi.getText().length() > 0 && txtnroplaca.getText().length() > 0 && txtmodelo.getText().length() > 0 && txtmarca.getText().length() > 0) {
            Taxi taxi = new Taxi(txtnrotaxi.getText(), txtnroplaca.getText(), txtmodelo.getText(), txtmarca.getText(), propietario, txtAreaTurno.getText());
            try {
                if (meLlamo.equals("registrar")) {
                    taxiBsn.almacenarTaxi(taxi);
                    JOptionPane.showMessageDialog(null, "Taxi Guardado Correctamente!!", "Guardado", JOptionPane.INFORMATION_MESSAGE);
                } else if (meLlamo.equals("asociar")) {
                    Taxi taxiActualizar = new Taxi(txtnrotaxi.getText(), txtnroplaca.getText(), txtmodelo.getText(), txtmarca.getText(), propietario, txtAreaTurno.getText());
                    //actualizamos los 3 datos modificables
                    taxiActualizar.insertarTaller(listaTalleres);
                    taxiActualizar.insertarConductore(listaConductores);
                    taxiActualizar.setTurnos(txtAreaTurno.getText());
                    //ahora si actualizamos taxi
                    taxiBsn.actualizarTaxi(taxiActualizar);
                    JOptionPane.showMessageDialog(null, "Taxi Guardado Correctamente!!", "Asociado", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ya se encuentra almacenado", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            
            }
            mostrarTodos();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Faltan Campos Por llenar", "Error", HEIGHT);
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed

    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmostrartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrartodosActionPerformed

    }//GEN-LAST:event_btnmostrartodosActionPerformed

    //METODOS QUE BUSCAN
    private void btnbuscarconductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarconductorActionPerformed

        FrmConductores abrirFrmConductores;
        abrirFrmConductores = new FrmConductores("buscarDesdeOtroForm");
        abrirFrmConductores.toFront();
        abrirFrmConductores.setVisible(true);

    }//GEN-LAST:event_btnbuscarconductorActionPerformed

    private void btnbuscarpropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarpropietarioActionPerformed
        FrmPropietarios abrirFrmPropietarios;
        btnguardar.setEnabled(true);
        abrirFrmPropietarios = new FrmPropietarios("buscarDesdeOtroForm");
        abrirFrmPropietarios.toFront();
        abrirFrmPropietarios.setVisible(true);
    }//GEN-LAST:event_btnbuscarpropietarioActionPerformed

    private void btnbuscartallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscartallerActionPerformed
        FrmTalleres abrirFrmTalleres;
        abrirFrmTalleres = new FrmTalleres("buscarDesdeOtroForm");
        abrirFrmTalleres.toFront();
        abrirFrmTalleres.setVisible(true);
    }//GEN-LAST:event_btnbuscartallerActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if (evt.getClickCount() == 2) {
            int fila = jTable1.getSelectedRow();
            txtnrotaxi.setText(jTable1.getValueAt(fila, 0).toString());
            txtnroplaca.setText(jTable1.getValueAt(fila, 1).toString());
            txtmodelo.setText(jTable1.getValueAt(fila, 2).toString());
            txtmarca.setText(jTable1.getValueAt(fila, 3).toString());
            txtpropietario.setText(jTable1.getValueAt(fila, 4).toString());
            txtAreaTurno.setText(jTable1.getValueAt(fila, 5).toString());
            txtAreaTaller.setText(jTable1.getValueAt(fila, 6).toString());
            txtAreaConductor.setText(jTable1.getValueAt(fila, 7).toString());
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void btnbuscarturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarturnoActionPerformed
        FrmSeleccionTurno abrirFrmSeleccionTurno;
        abrirFrmSeleccionTurno = new FrmSeleccionTurno();
        abrirFrmSeleccionTurno.toFront();
        abrirFrmSeleccionTurno.setVisible(true);
    }//GEN-LAST:event_btnbuscarturnoActionPerformed
//METODOS ADICIONALES

    private void mostrarTodos() {
        limpiartabla();
        List<String[]> conductores = taxiBsn.listarTaxi();
        for (int i = 0; i < conductores.size(); i++) {
            //Agregamos los datos que hemos almacenado anteriormente, a la tabla
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String filaNueva[] = conductores.get(i);
            model.addRow(filaNueva);
        }
    }

    private void limpiarCampos() {
        txtmarca.setText("");
        txtnroplaca.setText("");
        txtmodelo.setText("");
        txtnrotaxi.setText("");
        txtpropietario.setText("");
        txtAreaTaller.setText("");
        txtAreaConductor.setText("");
        txtAreaTurno.setText("");
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
            java.util.logging.Logger.getLogger(FrmTaxis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTaxis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTaxis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTaxis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTaxis("").setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscarconductor;
    private javax.swing.JButton btnbuscarpropietario;
    private javax.swing.JButton btnbuscartaller;
    private javax.swing.JButton btnbuscarturno;
    private javax.swing.JButton btndescargarreporte;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmostrartodos;
    private javax.swing.JButton jButtonsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextArea txtAreaConductor;
    public static javax.swing.JTextArea txtAreaTaller;
    public static javax.swing.JTextArea txtAreaTurno;
    private javax.swing.JTextField txtbuscarnrplaca;
    private javax.swing.JTextField txteliminarnroplaca;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnroplaca;
    private javax.swing.JTextField txtnrotaxi;
    public static javax.swing.JTextField txtpropietario;
    // End of variables declaration//GEN-END:variables
}
