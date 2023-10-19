
package nutricorp.visuales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nutricorp.AccesoADatos.CConection;
import nutricorp.AccesoADatos.PacienteData;
import nutricorp.Entidades.Paciente;
import nutricorp.Entidades.HistorialPeso;


public class HistorialCliente extends javax.swing.JInternalFrame {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Historial Pesos del Paciente");

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Cliente:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Peso", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Fecha:");

        jLabel3.setText("Peso:");

        jButton1.setText("Guardar");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("_____________________________________________");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jButton1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addGap(35, 35, 35))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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

    
 private PacienteData pacienteData;
 private JComboBox<Paciente> cbPaciente;
 
    public HistorialCliente() {
        initComponents();
        
        pacienteData = new PacienteData();
         cbPaciente = new JComboBox<>();
        
     
        cargarPacientesEnComboBox();
        
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
    // Obtén el ID del paciente desde tu ComboBox o desde donde lo tengas
    int idPaciente = obtenerIdPacienteSeleccionado();  // Reemplaza esto con la lógica adecuada para obtener el ID del paciente

    // Obtén la fecha seleccionada
    
    java.util.Date selectedDate = jDateChooser1.getDate();
    if (selectedDate == null) {
        JOptionPane.showMessageDialog(this, "Selecciona una fecha válida.");
        return;
    }

    // Obtén el valor del peso del paciente
    String pesoText = jTextField1.getText();
    if (pesoText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingresa el peso del paciente.");
        return;
    }

    try {
        double peso = Double.parseDouble(pesoText);

        // Conecta a la base de datos y ejecuta la inserción
        
      
        try (Connection connection = CConection.getConexion()) {
            String sql = "INSERT INTO HistorialPeso (IdPaciente, Fecha, Peso) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ps.setDate(2, new java.sql.Date(selectedDate.getTime()));
            ps.setDouble(3, peso);
            guardarRegistroPeso();
            
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Registro de peso guardado correctamente.");
                        // Limpia los campos después de guardar los datos
                        jDateChooser1.setDate(null);
                        jTextField1.setText("");
                        // Actualiza la tabla para reflejar el nuevo registro
                        actualizarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el registro de peso.");
            }
            
            // Cierra la conexión
            ps.close();
        }
     
       
    }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog( this, "Ingresa un valor de peso válido.");
    }
    }

 

    private void cargarPacientesEnComboBox() {
        List<Paciente> pacientes = pacienteData.listarPaciente();

        // Crear un modelo de ComboBox
        JComboBox<String> comboBoxModel = new JComboBox<>();

        // Agregar nombres de pacientes al modelo
        for (Paciente paciente : pacientes) {
            jComboBox1.addItem(paciente.getNombre());
        }

        
    }
    private void actualizarTabla() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // Borra todas las filas existentes
    while (model.getRowCount() > 0) {
        model.removeRow(0);
    }
        Iterable<HistorialPeso> historialPesos = null;

    // Agrega las filas con los datos actualizados
    for (HistorialPeso historialPeso : historialPesos) {
        model.addRow(new Object[] { historialPeso.getFechaRegistro(), historialPeso.getPeso() });
    }
}

private int obtenerIdPacienteSeleccionado() {
    // Obtén el paciente seleccionado en el ComboBox
    Paciente pacienteSeleccionado = (Paciente) jComboBox1.getSelectedItem();

    // Aquí deberás implementar la lógica para obtener el ID del paciente a partir del objeto "pacienteSeleccionado"
    // Puedes obtener el ID de tu modelo de datos o base de datos

    // Ejemplo (reemplaza esto con la lógica adecuada):
    int idPaciente = pacienteSeleccionado.getDni();  // Suponiendo que tu objeto "Paciente" tiene un método "getDni"
    
    return idPaciente;
}  
private void guardarRegistroPeso() {
    java.util.Date selectedDate = jDateChooser1.getDate();
    String pesoText = jTextField1.getText();

    if (selectedDate == null) {
        JOptionPane.showMessageDialog(this, "Selecciona una fecha válida.");
        return;
    }

    if (pesoText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingresa el peso del paciente.");
        return;
    }

    try {
        double peso = Double.parseDouble(pesoText);
        
        // Obtén el ID del paciente seleccionado (reemplaza esto con la lógica adecuada)
        int idPaciente = obtenerIdPacienteSeleccionado();

        // Conecta a la base de datos y ejecuta la inserción
        try (Connection connection = CConection.getConexion()) {
            String sql = "INSERT INTO HistorialPeso (IdPaciente, Fecha, Peso) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ps.setDate(2, new java.sql.Date(selectedDate.getTime()));
            ps.setDouble(3, peso);

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Registro de peso guardado correctamente.");
                // Limpia los campos después de guardar los datos
                jDateChooser1.setDate(null);
                jTextField1.setText("");
                // Actualiza la tabla para reflejar el nuevo registro
                actualizarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el registro de peso.");
            }

            // Cierra la conexión
            ps.close();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingresa un valor de peso válido.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar el registro de peso en la base de datos: " + e.getMessage());
    }
}

        
    

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
