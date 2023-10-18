/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricorp.visuales;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import nutricorp.AccesoADatos.DietaData;
import nutricorp.Entidades.Dieta;

/**
 *
 * @author gg
 */
public class DietaVigente extends javax.swing.JInternalFrame {
    DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
    DefaultTableModel jtablemod;
    public DietaVigente() {
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        TXTFecha = new javax.swing.JLabel();
        FechaDChooser = new com.toedter.calendar.JDateChooser();
        Tabla = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RbuttonVigente = new javax.swing.JRadioButton();
        RbuttonFinalizados = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setTitle("Dietas");

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        TXTFecha.setText("Fecha Actual:");

        FechaDChooser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FechaDChooserFocusGained(evt);
            }
        });
        FechaDChooser.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                FechaDChooserComponentShown(evt);
            }
        });
        FechaDChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaDChooserPropertyChange(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Paciente", "Dieta", "Inicio", "Finaliza"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setViewportView(jTable1);

        RbuttonVigente.setBackground(new java.awt.Color(204, 204, 204));
        RbuttonVigente.setText("Vigentes");

        RbuttonFinalizados.setBackground(new java.awt.Color(204, 204, 204));
        RbuttonFinalizados.setText("Finalizados");
        RbuttonFinalizados.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RbuttonFinalizadosStateChanged(evt);
            }
        });

        jDesktopPane1.setLayer(TXTFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(FechaDChooser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Tabla, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(RbuttonVigente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(RbuttonFinalizados, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(TXTFecha)
                        .addGap(18, 18, 18)
                        .addComponent(FechaDChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(228, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(RbuttonVigente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RbuttonFinalizados)
                        .addGap(62, 62, 62))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FechaDChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTFecha))
                .addGap(25, 25, 25)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbuttonVigente)
                    .addComponent(RbuttonFinalizados))
                .addGap(25, 25, 25)
                .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FechaDChooserComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_FechaDChooserComponentShown
        // TODO add your handling code here
        FechaDChooser.setDate(Date.from(Instant.now()));
       
    }//GEN-LAST:event_FechaDChooserComponentShown

    private void FechaDChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaDChooserPropertyChange
        // TODO add your handling code here:
        
        /*
          String titulos[]={"IdMateria"," Nombre "," Año "};
       jtablemod=new DefaultTableModel(null,titulos);
        int total=materiadata.listarMateria().size();
        String [] mate=new String[3];
        for (int i = 0; i < total; i++) {
            mate[0]=String.valueOf(materiadata.listarMateria().get(i).getIdMateria());
            mate[1]=materiadata.listarMateria().get(i).getNombre();
            mate[2]=String.valueOf(materiadata.listarMateria().get(i).getAño());
            jtablemod.addRow(mate);
        }
       jTableAlumnos.setModel(jtablemod); 
               }
        */
    }//GEN-LAST:event_FechaDChooserPropertyChange

    private void RbuttonFinalizadosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RbuttonFinalizadosStateChanged
        // TODO add your handling code here:
        DietaData dd=new DietaData();
        Date date = FechaDChooser.getDate(); //ic es la interfaz, jDate el JDatechooser
        long d = date.getTime(); //guardamos en un long el tiempo
        java.sql.Date fecha = new java.sql.Date(d);// parseamos al formato del sql  
        String titulos[]={"Nombre"," Telefono "," FechaInicial "," PesoInicial "," PesoFinal "," FechaFinal "};
        jtablemod=new DefaultTableModel(null,titulos);
        int total=dd.ListarPacientesDietaTerminada(fecha).size();
        List<Dieta>dtterminada=new ArrayList<>();
        dtterminada=dd.ListarPacientesDietaTerminada(fecha);
        String [] vec=new String [6];
        for (int i = 0; i < total; i++) {
            vec[0]=dtterminada.get(i).getPaciente().getNombre();
            vec[1]=dtterminada.get(i).getPaciente().getTelefono();
            vec[2]=String.valueOf(dtterminada.get(i).getFechaInicial());
            vec[3]=String.valueOf(dtterminada.get(i).getPesoInicial());
            vec[4]=String.valueOf(dtterminada.get(i).getPesoFinal());
            vec[5]=String.valueOf(dtterminada.get(i).getFechaFinal());
            jtablemod.addRow(vec);
        }
        jTable1.setModel(jtablemod);
    }//GEN-LAST:event_RbuttonFinalizadosStateChanged

    private void FechaDChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FechaDChooserFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FechaDChooserFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaDChooser;
    private javax.swing.JRadioButton RbuttonFinalizados;
    private javax.swing.JRadioButton RbuttonVigente;
    private javax.swing.JLabel TXTFecha;
    private javax.swing.JScrollPane Tabla;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
