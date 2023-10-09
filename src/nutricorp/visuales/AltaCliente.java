/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricorp.visuales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import nutricorp.AccesoADatos.PacienteData;
import nutricorp.Entidades.Paciente;

public class AltaCliente extends javax.swing.JInternalFrame {


    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    String sql = "";
   
    public AltaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        TXTnombre = new javax.swing.JLabel();
        TXTapellido = new javax.swing.JLabel();
        TXTDNI = new javax.swing.JLabel();
        TXTDomicilio = new javax.swing.JLabel();
        TXTtelefono = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        TFApellido = new javax.swing.JTextField();
        TFDNI = new javax.swing.JTextField();
        TFDomicilio = new javax.swing.JTextField();
        TFTelefono = new javax.swing.JTextField();
        ButtonAgregar = new javax.swing.JButton();
        ButtonBuscar = new javax.swing.JButton();
        ButtonModificar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alta Clientes ");

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        TXTnombre.setText("Nombre:");

        TXTapellido.setText("Apellido/s:");

        TXTDNI.setText("DNI:");

        TXTDomicilio.setText("Domicilio:");

        TXTtelefono.setText("Telefono:");

        ButtonAgregar.setText("Agregar");
        ButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarActionPerformed(evt);
            }
        });

        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        ButtonModificar.setText("Modificar");
        ButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificarActionPerformed(evt);
            }
        });

        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(TXTnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTapellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTDNI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTDomicilio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTtelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFDNI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFDomicilio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTtelefono)
                            .addComponent(TXTDomicilio)
                            .addComponent(TXTapellido)
                            .addComponent(TXTnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTDNI, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFNombre)
                            .addComponent(TFApellido)
                            .addComponent(TFDomicilio)
                            .addComponent(TFTelefono)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(TFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBuscar))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(ButtonAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEliminar)))
                .addGap(48, 48, 48))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTDNI)
                    .addComponent(TFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscar))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTnombre)
                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTapellido)
                    .addComponent(TFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTDomicilio)
                    .addComponent(TFDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTtelefono)
                    .addComponent(TFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonModificar)
                    .addComponent(ButtonAgregar)
                    .addComponent(ButtonEliminar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed

        Paciente paciente = new Paciente();
              
         paciente.setApellido(TFApellido.getText());
        paciente.setDni(Integer.parseInt(TFDNI.getText()));
        paciente.setDomicilio(TFDomicilio.getText());
        paciente.setNombre(TFNombre.getText());
        paciente.setTelefono(TFTelefono.getText());
        
        PacienteData pacienteDate = new PacienteData();
        pacienteDate.insertarPaciente(paciente);
        limpiarCampos();
       
        //listo y funcionando

    }//GEN-LAST:event_ButtonAgregarActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed

        int DNI =  Integer.parseInt(TFDNI.getText());
        Paciente paci = new Paciente();
        PacienteData pacidata = new PacienteData();
               
        paci = pacidata.buscarPacientePorDni(DNI);
        TFApellido.setText(paci.getApellido());
        TFDomicilio.setText(paci.getDomicilio());
        TFNombre.setText(paci.getNombre());
        TFTelefono.setText(paci.getTelefono());
      
        ///listo y funcionando
 
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarActionPerformed

        Paciente paci = new Paciente();       
        paci.setApellido(TFApellido.getText());
        paci.setDni(Integer.parseInt(TFDNI.getText()));
        paci.setDomicilio(TFDomicilio.getText());
        paci.setNombre(TFNombre.getText());
        paci.setTelefono(TFTelefono.getText());       
        PacienteData pacidata = new PacienteData();
        pacidata.modificadorPaciente(paci);
        limpiarCampos();
        

    }//GEN-LAST:event_ButtonModificarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed

        int dni = Integer.parseInt(TFDNI.getText());
        PacienteData pacidata = new PacienteData();        
        pacidata.eliminarPaciente(dni);
        limpiarCampos();


    }//GEN-LAST:event_ButtonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonModificar;
    private javax.swing.JTextField TFApellido;
    private javax.swing.JTextField TFDNI;
    private javax.swing.JTextField TFDomicilio;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFTelefono;
    private javax.swing.JLabel TXTDNI;
    private javax.swing.JLabel TXTDomicilio;
    private javax.swing.JLabel TXTapellido;
    private javax.swing.JLabel TXTnombre;
    private javax.swing.JLabel TXTtelefono;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos(){
    
    TFApellido.setText("");
    TFDNI.setText("");
    TFDomicilio.setText("");
    TFNombre.setText("");
    TFTelefono.setText("");
    
    }

}
