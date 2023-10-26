/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricorp.visuales;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutricorp.AccesoADatos.ComidaData;
import nutricorp.AccesoADatos.DietaComidaData;
import nutricorp.AccesoADatos.DietaData;
import nutricorp.Entidades.Comida;
import nutricorp.Entidades.Dieta;
import nutricorp.Entidades.DietaComida;



/**
 *
 * @author gg
 */
public class ComidasaDieta extends javax.swing.JInternalFrame {

    DietaComida dc=new DietaComida();
    DietaComidaData dcd=new DietaComidaData();
    DietaData dd=new DietaData();
    Dieta dt=new Dieta();
    ComidaData cd=new ComidaData();
    Comida cm=new Comida();
    DefaultTableModel jtablemod;
    public ComidasaDieta() {
        initComponents();
        updateCombo();
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
        TXTND = new javax.swing.JLabel();
        CuadroDietas = new javax.swing.JScrollPane();
        TablaDieta = new javax.swing.JTable();
        CBNombreDieta = new javax.swing.JComboBox<>();
        TXTHorario = new javax.swing.JLabel();
        CBHorario = new javax.swing.JComboBox<>();
        RBComidasAgregadas = new javax.swing.JRadioButton();
        RBComidasNoAgregadas = new javax.swing.JRadioButton();
        ButtonAgregar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Agregar Comidas a Dietas");

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        TXTND.setText("Nombre de la Dieta:");

        TablaDieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        CuadroDietas.setViewportView(TablaDieta);

        CBNombreDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNombreDietaActionPerformed(evt);
            }
        });

        TXTHorario.setText("Horarios:");

        RBComidasAgregadas.setBackground(new java.awt.Color(204, 204, 204));
        RBComidasAgregadas.setText("Comidas Agregadas");
        RBComidasAgregadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBComidasAgregadasActionPerformed(evt);
            }
        });

        RBComidasNoAgregadas.setBackground(new java.awt.Color(204, 204, 204));
        RBComidasNoAgregadas.setText("Comidas No Agreagadas");
        RBComidasNoAgregadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBComidasNoAgregadasActionPerformed(evt);
            }
        });

        ButtonAgregar.setText("Agregar");
        ButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarActionPerformed(evt);
            }
        });

        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(TXTND, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CuadroDietas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CBNombreDieta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTHorario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CBHorario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(RBComidasAgregadas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(RBComidasNoAgregadas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(ButtonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(ButtonEliminar)
                .addGap(93, 93, 93))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTHorario)
                            .addComponent(TXTND))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBNombreDieta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBHorario, 0, 262, Short.MAX_VALUE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(RBComidasAgregadas)
                        .addGap(188, 188, 188)
                        .addComponent(RBComidasNoAgregadas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CuadroDietas)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTND)
                    .addComponent(CBNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTHorario)
                    .addComponent(CBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBComidasAgregadas)
                    .addComponent(RBComidasNoAgregadas))
                .addGap(18, 18, 18)
                .addComponent(CuadroDietas, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAgregar)
                    .addComponent(ButtonEliminar))
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
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBComidasAgregadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBComidasAgregadasActionPerformed
        // TODO add your handling code here:
        dt=(dd.listarDieta().get(CBNombreDieta.getSelectedIndex()));
        dc.setHorario(dcd.horarios().get(CBHorario.getSelectedIndex()));
        dcd.comidasEnDieta(dt.getIdDieta(), dc.getHorario());
        String titulos[]={"IdComidaDieta","NombreDieta"," NombreComida "," IdComida "," Horarios "," Porciones "};
        jtablemod=new DefaultTableModel(null,titulos);
        int total=dcd.comidasEnDieta(dt.getIdDieta(), dc.getHorario()).size();
        List<DietaComida>dietacd=new ArrayList<>();
        dietacd=dcd.comidasEnDieta(dt.getIdDieta(), dc.getHorario());
        if(total==0){
            JOptionPane.showMessageDialog(null, "No se encontraron comidas en esta dieta y en este horario");
        }else{
        String [] vec=new String [6];
        for (int i = 0; i < total; i++) {
            vec[0]=String.valueOf(dietacd.get(i).getId());
            vec[1]=dietacd.get(i).getDieta().getNombre();
            vec[2]=dietacd.get(i).getComida().getNombre();
            vec[3]=String.valueOf(dietacd.get(i).getComida().getIdComida());
            vec[4]=dietacd.get(i).getHorario();
            vec[5]=String.valueOf(dietacd.get(i).getPorciones());
            jtablemod.addRow(vec);
        }
        TablaDieta.setModel(jtablemod);
        }
    }//GEN-LAST:event_RBComidasAgregadasActionPerformed

    private void CBNombreDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNombreDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBNombreDietaActionPerformed

    private void RBComidasNoAgregadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBComidasNoAgregadasActionPerformed
        // TODO add your handling code here:
        dt=(dd.listarDieta().get(CBNombreDieta.getSelectedIndex()));
        cd.comidasSinDieta(dt.getIdDieta());
        String titulos[]={"Id"," Nombre "," CantidadCalorioas"," Porciones"};
        jtablemod=new DefaultTableModel(null,titulos);
        int total=cd.comidasSinDieta(dt.getIdDieta()).size();
        List<Comida>cdl=new ArrayList<>();
        cdl=cd.comidasSinDieta(dt.getIdDieta());
        if(total==0){
            JOptionPane.showMessageDialog(null, "Ya estan todas las comidas en la dieta");
        }else{
        String [] vec=new String [3];
        for (int i = 0; i < total; i++) {
            vec[0]=String.valueOf(cdl.get(i).getIdComida());
            vec[1]=cdl.get(i).getNombre();
            vec[2]=String.valueOf(cdl.get(i).getCantCalorias());
            jtablemod.addRow(vec);
        }
        TablaDieta.setModel(jtablemod);
        }
    }//GEN-LAST:event_RBComidasNoAgregadasActionPerformed

    private void ButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed
        // TODO add your handling code here:
        int fila=TablaDieta.getSelectedRow();
        int id=Integer.parseInt(String.valueOf(TablaDieta.getValueAt(fila, 0)));
        int porciones=Integer.parseInt(String.valueOf(TablaDieta.getValueAt(fila, 3)));
        cm.setIdComida(id);
        dt=(dd.listarDieta().get(CBNombreDieta.getSelectedIndex()));
        dc.setComida(cm);
        dc.setDieta(dt);
        dc.setHorario(dcd.horarios().get(CBHorario.getSelectedIndex()));
        dc.setPorciones(porciones);
        dcd.guardarDietaComida(dc);
    }//GEN-LAST:event_ButtonAgregarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        // TODO add your handling code here:
        int fila=TablaDieta.getSelectedRow();
        int id=Integer.parseInt(String.valueOf(TablaDieta.getValueAt(fila, 0)));
        dcd.eliminarComidaDieta(id);
    }//GEN-LAST:event_ButtonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JComboBox<String> CBHorario;
    private javax.swing.JComboBox<String> CBNombreDieta;
    private javax.swing.JScrollPane CuadroDietas;
    private javax.swing.JRadioButton RBComidasAgregadas;
    private javax.swing.JRadioButton RBComidasNoAgregadas;
    private javax.swing.JLabel TXTHorario;
    private javax.swing.JLabel TXTND;
    private javax.swing.JTable TablaDieta;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
private void updateCombo() {
        int total=dd.listarDieta().size();
        int total1=dcd.horarios().size();
        for (int i = 0; i < total; i++) {
            CBNombreDieta.addItem(dd.listarDieta().get(i).toString());
        }    
        for (int i = 0; i < total1; i++) {
            CBHorario.addItem(dcd.horarios().get(i));
        
    }
    }
}
