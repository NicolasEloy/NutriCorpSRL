package nutricorp.visuales;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutricorp.AccesoADatos.CConection;
import nutricorp.AccesoADatos.PacienteData;

public class HistorialCliente extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")

    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    String sql = "";


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablesuspendidapaciente = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnoFecha = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        TXTNUEVOPESO = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtPesoInicial = new javax.swing.JLabel();
        TXTNULL = new javax.swing.JLabel();
        TXTNULL2 = new javax.swing.JLabel();
        TXTNULL3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        txtidpaciente = new javax.swing.JLabel();

        jLabel5.setText("BUSCAR CLIENTE");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jtablesuspendidapaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "PESO INICIAL"
            }
        ));
        jScrollPane2.setViewportView(jtablesuspendidapaciente);

        jButton3.setText("ACEPTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1))))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jButton3)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setClosable(true);
        setTitle("Historial Pesos del Paciente");

        jDesktopPane1.setBackground(new java.awt.Color(5, 47, 46));

        tablaAlumnoFecha.setBackground(new java.awt.Color(5, 47, 46));
        tablaAlumnoFecha.setForeground(new java.awt.Color(244, 243, 197));
        tablaAlumnoFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FECHA", "PESO"
            }
        ));
        tablaAlumnoFecha.setGridColor(new java.awt.Color(244, 243, 197));
        tablaAlumnoFecha.setOpaque(false);
        jScrollPane1.setViewportView(tablaAlumnoFecha);

        jLabel3.setForeground(new java.awt.Color(244, 243, 197));
        jLabel3.setText("NUEVO PESO");

        TXTNUEVOPESO.setBackground(new java.awt.Color(244, 243, 197));

        jButton1.setBackground(new java.awt.Color(106, 188, 80));
        jButton1.setForeground(new java.awt.Color(244, 243, 197));
        jButton1.setText("Guardar");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("_____________________________________________");

        jLabel2.setForeground(new java.awt.Color(244, 243, 197));
        jLabel2.setText("FECHA");

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setForeground(new java.awt.Color(0, 255, 51));
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtPesoInicial.setBackground(new java.awt.Color(244, 243, 197));
        txtPesoInicial.setForeground(new java.awt.Color(244, 243, 197));

        TXTNULL.setBackground(new java.awt.Color(244, 243, 197));
        TXTNULL.setForeground(new java.awt.Color(244, 243, 197));
        TXTNULL.setText("ID PACIENTE");

        TXTNULL2.setBackground(new java.awt.Color(244, 243, 197));
        TXTNULL2.setForeground(new java.awt.Color(244, 243, 197));
        TXTNULL2.setText("NOMBRE");

        TXTNULL3.setBackground(new java.awt.Color(244, 243, 197));
        TXTNULL3.setForeground(new java.awt.Color(244, 243, 197));
        TXTNULL3.setText("PESO INICIAL");

        txtnombre.setBackground(new java.awt.Color(244, 243, 197));
        txtnombre.setForeground(new java.awt.Color(244, 243, 197));

        txtidpaciente.setBackground(new java.awt.Color(102, 255, 102));
        txtidpaciente.setForeground(new java.awt.Color(102, 204, 0));

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTNUEVOPESO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtPesoInicial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTNULL, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTNULL2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTNULL3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtidpaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(TXTNULL2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(TXTNULL, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXTNULL3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXTNUEVOPESO, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addComponent(jButton1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txtPesoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(TXTNULL, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(TXTNULL3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(txtidpaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTNULL2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTNUEVOPESO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
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

    public HistorialCliente() {

        initComponents();
        PacienteData pd = new PacienteData();
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (TXTNUEVOPESO.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo peso es obligatorio.");
          
        } else if (!TXTNUEVOPESO.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Solo se permiten números en el campo peso.");
        }

        if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debe colocar una fecha.");
         }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(jDateChooser1.getDate());
        String sql = "insert into historialpeso (IdPaciente,Fecha,Peso) VALUES ('" + txtidpaciente.getText() + "','" + fecha + "','" + TXTNUEVOPESO.getText() + "')";
        System.out.println(jDateChooser1.getDate());
        connection = CConection.getConexion();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("actualizado el peso del paciente");

        } catch (SQLException ex) {
            Logger.getLogger(HistorialCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        llenarTablaHistorial();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jDialog1.setSize(480, 480);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setVisible(true);        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       
            sql="select IdPaciente,Nombre,Apellido,pesoActual from paciente where Nombre like '%"+jTextField1.getText()+"%'  ";
            DefaultTableModel modelo = (DefaultTableModel) jtablesuspendidapaciente.getModel();
            
         try {
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            modelo.setRowCount(0);
             while (rs.next()) {                 
                modelo.addRow(new Object[]{
                    rs.getString("IdPaciente"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("pesoActual")
                 });
                 
             }
           } catch (SQLException ex) {
            Logger.getLogger(HistorialCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        Integer fila = jtablesuspendidapaciente.getSelectedRow();
        txtidpaciente.setText(jtablesuspendidapaciente.getValueAt(fila, 0).toString());
        txtPesoInicial.setText(jtablesuspendidapaciente.getValueAt(fila, 3).toString());
        txtnombre.setText(jtablesuspendidapaciente.getValueAt(fila, 1).toString());
        jDialog1.setVisible(false);
        llenarTablaHistorial();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField TXTNUEVOPESO;
    public javax.swing.JLabel TXTNULL;
    public javax.swing.JLabel TXTNULL2;
    public javax.swing.JLabel TXTNULL3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTable jtablesuspendidapaciente;
    private javax.swing.JTable tablaAlumnoFecha;
    public javax.swing.JLabel txtPesoInicial;
    private javax.swing.JLabel txtidpaciente;
    public javax.swing.JLabel txtnombre;
    // End of variables declaration//GEN-END:variables

    public void llenarTablaHistorial() {
        String sql = "Select Fecha,Peso from historialpeso where IdPaciente='"+txtidpaciente.getText()+ "'";
        DefaultTableModel modeloT = (DefaultTableModel) tablaAlumnoFecha.getModel();
        connection = CConection.getConexion();
        try {
            modeloT.setRowCount(0);
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                modeloT.addRow(new Object[]{
                    rs.getString("Peso"),
                    rs.getString("Fecha"),});
            }
            tablaAlumnoFecha.setModel(modeloT);
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("eeror de tipo " + e);
        }
    }
}
