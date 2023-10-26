package nutricorp.visuales;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import nutricorp.AccesoADatos.DietaData;
import nutricorp.Entidades.Dieta;
import nutricorp.Entidades.Paciente;

/**
 *
 * @author Matias
 */
public class CrearDieta extends javax.swing.JInternalFrame {

    DietaData dd=new DietaData();
    Dieta dt=new Dieta();
    Paciente pc=new Paciente();
    public CrearDieta() {
        initComponents();
        updateCombo();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PesoInicial = new javax.swing.JTextField();
        PesoFinal = new javax.swing.JTextField();
        FechaInicio = new com.toedter.calendar.JDateChooser();
        FechaFinal = new com.toedter.calendar.JDateChooser();
        jButtonBuscar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        NombreDieta = new javax.swing.JTextField();
        jButtoNuevo = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setTitle("Buscar/Crear dietas");

        jLabel1.setText("Nombre Dieta:");

        jLabel2.setText("Paciente:");

        jComboBox1.setSelectedItem(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setSelectedItem(null);

        jLabel3.setText("Fecha de inicio:");

        jLabel4.setText("Peso inicial:");

        jLabel5.setText("Peso final:");

        jLabel6.setText("Fecha final:");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("Paciente:");

        jLabel8.setText("Nombre Dieta:");

        jComboBox3.setSelectedItem(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButtoNuevo.setText("Nuevo");
        jButtoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoNuevoActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PesoFinal)
                                    .addComponent(PesoInicial)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NombreDieta)
                                    .addComponent(FechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(FechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtoNuevo)))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar)
                        .addGap(43, 43, 43))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(NombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtoNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(FechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonSalir))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jButtonBuscar.isEnabled()==true){
            jComboBox2.removeAllItems();
        String name=jComboBox1.getSelectedItem().toString();
        int total=dd.listarPacienteConDietas(name).size();
        for (int i = 0; i < total; i++) {
            jComboBox2.addItem(dd.listarPacienteConDietas(name).get(i).toString());
        }}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        jComboBox3.removeAllItems();
        String name=jComboBox1.getSelectedItem().toString();
        dt=dd.buscarDieta(name,dd.listarPacienteConDietas(name).get(0).getIdPaciente());
        NombreDieta.setText(dt.getNombre());
        PesoFinal.setText(Double.toString(dt.getPesoFinal()));
        PesoInicial.setText(Double.toString(dt.getPesoInicial()));
        FechaFinal.setDate(Date.valueOf(dt.getFechaFinal()));
        FechaInicio.setDate(Date.valueOf(dt.getFechaInicial()));
        jComboBox3.addItem(dd.listarPacienteConDietas(name).get(0).toString());
        int total=dd.listarPacienteSinDietas().size();
        for (int i = 0; i < total; i++) {
            jComboBox3.addItem(dd.listarPacienteSinDietas().get(i).toString());
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoNuevoActionPerformed
        // TODO add your handling code here:
        LimpiarCampos();
        int total=dd.listarPacienteSinDietas().size();
        for (int i = 0; i < total; i++) {
            jComboBox3.addItem(dd.listarPacienteSinDietas().get(i).toString());
        }
    }//GEN-LAST:event_jButtoNuevoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
     
    if (jComboBox3.getItemCount() == 0) {
        JOptionPane.showMessageDialog(this, "No hay pacientes sin dieta para agregar");
    } else {
        String nombreDieta = NombreDieta.getText();
        String pesoInicialStr = PesoInicial.getText();
        String pesoFinalStr = PesoFinal.getText();

        // Verificar que todos los campos estén completos
        if (nombreDieta.isEmpty() || pesoInicialStr.isEmpty() || pesoFinalStr.isEmpty()
                || FechaInicio.getDate() == null || FechaFinal.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos.");
        } else {
            // Verificar que los campos de peso inicial y final contengan solo números
            if (!EsNumero(pesoInicialStr) || !EsNumero(pesoFinalStr)) {
                JOptionPane.showMessageDialog(this, "Los campos de peso inicial y final deben contener solo números.");
            } else {
                double pesoInicial = Double.parseDouble(pesoInicialStr);
                double pesoFinal = Double.parseDouble(pesoFinalStr);

                // Obtener fechas de los componentes DateChooser
                Instant instant1 = FechaInicio.getDate().toInstant();
                LocalDate localDate1 = instant1.atZone(ZoneId.systemDefault()).toLocalDate();
                Instant instant2 = FechaFinal.getDate().toInstant();
                LocalDate localDate2 = instant2.atZone(ZoneId.systemDefault()).toLocalDate();

                if (jButtonBuscar.isEnabled() == false) {
                    // Crear una nueva dieta
                    dt.setNombre(nombreDieta);
                    dt.setPesoInicial(pesoInicial);
                    dt.setPesoFinal(pesoFinal);
                    dt.setFechaInicial(localDate1);
                    dt.setFechaFinal(localDate2);
                    pc = dd.listarPacienteSinDietas().get(jComboBox3.getSelectedIndex());
                    dt.setPaciente(pc);
                    dd.guardarDieta(dt);
                    LimpiarCampos();
                    updateCombo();
                    jComboBox1.setEnabled(true);
                    jComboBox2.setEnabled(true);
                    jButtonBuscar.setEnabled(true);
                } else {
                    // Modificar una dieta existente
                    dt = dd.listarDieta().get(jComboBox1.getSelectedIndex());
                    dt.setIdDieta(dt.getIdDieta());
                    dt.setNombre(nombreDieta);
                    dt.setPesoInicial(pesoInicial);
                    dt.setPesoFinal(pesoFinal);
                    dt.setFechaInicial(localDate1);
                    dt.setFechaFinal(localDate2);

                    // Obtener la lista de pacientes
                    ArrayList<Paciente> pacientes = new ArrayList<>();
                    pacientes.add(dd.listarPacienteConDietas(dt.getNombre()).get(0));
                    pacientes.addAll(dd.listarPacienteSinDietas());
                    pc = pacientes.get(jComboBox3.getSelectedIndex());
                    dt.setPaciente(pc);
                    dd.modificarDieta(dt);
                    LimpiarCampos();
                    updateCombo();
                    jComboBox1.setEnabled(true);
                    jComboBox2.setEnabled(true);
                    jButtonBuscar.setEnabled(true);
                }         
            }}
    }
    
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
      
        dt=dd.listarDieta().get(jComboBox1.getSelectedIndex());
        dd.eliminarDieta(dt.getIdDieta());
        LimpiarCampos();
        jComboBox1.setEnabled(true);
        jComboBox2.setEnabled(true);
        jButtonBuscar.setEnabled(true);
        updateCombo();
    }//GEN-LAST:event_jButtonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaFinal;
    private com.toedter.calendar.JDateChooser FechaInicio;
    private javax.swing.JTextField NombreDieta;
    private javax.swing.JTextField PesoFinal;
    private javax.swing.JTextField PesoInicial;
    private javax.swing.JButton jButtoNuevo;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

private void updateCombo() {
        int total=dd.listarDieta().size();
        for (int i = 0; i < total; i++) {
            jComboBox1.addItem(dd.listarDieta().get(i).toString());
        }    
        
    }
private void LimpiarCampos(){
    jButtonBuscar.setEnabled(false);
        jComboBox1.setEnabled(false);
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jComboBox2.setEnabled(false);
        jComboBox3.removeAllItems();
        NombreDieta.setText("");
        PesoFinal.setText("");
        PesoInicial.setText("");
        FechaFinal.setDate(null);
        FechaInicio.setDate(null);
}
 private boolean EsNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }



}