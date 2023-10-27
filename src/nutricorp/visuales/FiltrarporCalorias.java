/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricorp.visuales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutricorp.AccesoADatos.CConection;


/**
 *
 * @author gg
 */
public class FiltrarporCalorias extends javax.swing.JInternalFrame {
    Connection connection;
        PreparedStatement ps;
         ResultSet rs;
        String sql = "";
    
    
    
    /**
     * Creates new form FiltrarporCalorias
     */
    public FiltrarporCalorias() {
        initComponents();
        crearTabla();       
         
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Filtrar por Calorias");

        jDesktopPane1.setBackground(new java.awt.Color(5, 47, 46));

        jLabel2.setForeground(new java.awt.Color(244, 243, 197));
        jLabel2.setText("Comidas con Calorias menores a:");

        jTextField1.setBackground(new java.awt.Color(244, 243, 197));

        jTable1.setBackground(new java.awt.Color(5, 47, 46));
        jTable1.setForeground(new java.awt.Color(244, 243, 197));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(244, 243, 197));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setForeground(new java.awt.Color(244, 243, 197));
        jLabel1.setText("Calorias");

        jButtonBuscar.setBackground(new java.awt.Color(106, 188, 80));
        jButtonBuscar.setForeground(new java.awt.Color(244, 243, 197));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setOpaque(false);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBuscar)
                .addGap(53, 53, 53))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonBuscar))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

      String input = jTextField1.getText();
    if (input.isEmpty()) {
     
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor numérico.");
        return;
    }

    try {
        int extraerNumero = Integer.parseInt(input);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("COMIDAS");
        modelo.addColumn("DETALLES");
        modelo.addColumn("CALORIAS");
        jTable1.setModel(modelo);

        try {
          
            connection = CConection.getConexion();
            sql = "SELECT `Nombre`,`Detalle`,`CantCalorias` FROM `comida` WHERE `CantCalorias` < ?";
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, extraerNumero);
            rs = ps.executeQuery();

            Object[] objeto = new Object[3];
            while (rs.next()) {
                objeto[0] = rs.getString("Nombre");
                objeto[1] = rs.getString("Detalle");
                objeto[2] = rs.getInt("CantCalorias");
                modelo.addRow(objeto);
            }
            jTable1.setModel(modelo);
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error al cargar los datos de las comidas: " + e.getMessage());
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor numérico válido en el campo.");
    }

    }//GEN-LAST:event_jButtonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
    private void crearTabla(){
        
        
    }
   
    
    






}
