
package nutricorp.visuales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import nutricorp.AccesoADatos.ComidaData;
import nutricorp.Entidades.Comida;


public class Comidas extends javax.swing.JInternalFrame {
 
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        TXTNombre = new javax.swing.JLabel();
        TXTDetalle = new javax.swing.JLabel();
        TXTCaloria = new javax.swing.JLabel();
        ButtonEliminar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();
        TFNombreComida = new javax.swing.JTextField();
        TFDetalle = new javax.swing.JTextField();
        TFCalorias = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Comidas");

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        TXTNombre.setText("Nombre de Comida:");

        TXTDetalle.setText("Detalle:");

        TXTCaloria.setText("Calorias:");

        ButtonEliminar.setText("Eliminar");

        ButtonEditar.setText("Guardar");

        ButtonGuardar.setText("Nuevo");

        jLabel1.setText("Buscar comida");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("________________________________________");

        jDesktopPane1.setLayer(TXTNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTDetalle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TXTCaloria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFNombreComida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFDetalle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TFCalorias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TXTDetalle)
                                .addComponent(TXTNombre)
                                .addComponent(TXTCaloria)
                                .addComponent(ButtonEliminar))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFCalorias, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(TFNombreComida, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(TFDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(ButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(ButtonGuardar))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFNombreComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTNombre))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTDetalle))
                .addGap(27, 27, 27)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTCaloria))
                .addGap(53, 53, 53)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEliminar)
                    .addComponent(ButtonEditar)
                    .addComponent(ButtonGuardar))
                .addContainerGap())
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
 private ComidaData comidaData;
    private JComboBox<Comida> cbComidas;

    public Comidas() {
        initComponents();
        
     
        comidaData = new ComidaData();
         cbComidas = new JComboBox<>();
          
       cargarComidasEnComboBox();
         jComboBox1.setSelectedIndex(-1);
       
       
        jComboBox1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Llamada a un método para cargar los datos de la comida seleccionada
            cargarDatosComidaSeleccionada((String) jComboBox1.getSelectedItem());
        }
    });
        ButtonGuardar.addActionListener(new ActionListener() {
         @Override
        public void actionPerformed(ActionEvent e) {
        guardarComida();
    }
});

        ButtonEditar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        editarComida();
    }
});
        ButtonEliminar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        eliminarComida();
    }
});

    
    }
        
    
   private void cargarComidasEnComboBox() {
 
    List<Comida> comidas = comidaData.listarComidas();

 
    jComboBox1.removeAllItems(); 
    for (Comida comida : comidas) {
        jComboBox1.addItem(comida.getNombre()); // Puedes usar otro atributo si deseas mostrar algo diferente.
    }
    
  
    System.out.println("Elementos agregados al JComboBox: " + comidas.size());
}
private void cargarDatosComidaSeleccionada(String nombreComida) {
    Comida comidaSeleccionada = comidaData.buscarComidaPorNombre(nombreComida); // Cambiado para usar el método adecuado

    if (comidaSeleccionada != null) {
        // Cargar los datos en los campos de texto
        TFNombreComida.setText(comidaSeleccionada.getNombre());
        TFDetalle.setText(comidaSeleccionada.getDetalle());
        TFCalorias.setText(String.valueOf(comidaSeleccionada.getCantCalorias()));
    }
}
         
  private void guardarComida() {
    String nombre = TFNombreComida.getText();
    String detalle = TFDetalle.getText();
    String caloriasText = TFCalorias.getText();
    
    if (nombre.isEmpty() || detalle.isEmpty() || caloriasText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        return;
    }

    // Validación para asegurarse de que los campos "nombre" y "detalle" solo contengan letras y espacios
    if (!validarTexto(nombre) || !validarTexto(detalle)) {
        JOptionPane.showMessageDialog(null, "Los campos de nombre y detalle solo deben contener letras y espacios.");
        return;
    }
    
    try {
        double CantCalorias = Double.parseDouble(caloriasText);
        Comida nuevaComida = new Comida(nombre, detalle, (int) CantCalorias);
        comidaData.guardarComida(nuevaComida);
        
        cargarComidasEnComboBox(); // Actualiza el JComboBox con los cambios
        jComboBox1.setSelectedIndex(-1);
        TFNombreComida.setText("");
        TFDetalle.setText("");
        TFCalorias.setText("");
        JOptionPane.showMessageDialog(null, "Comida guardada exitosamente.");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor válido para las calorías.");
    }
}

     
 private void editarComida() {
    String nombre = TFNombreComida.getText();
    String detalle = TFDetalle.getText();
    String caloriasText = TFCalorias.getText();
    
    if (nombre.isEmpty() || detalle.isEmpty() || caloriasText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        return;
    }

    // Validación para asegurarse de que los campos "nombre" y "detalle" solo contengan letras y espacios
    if (!validarTexto(nombre) || !validarTexto(detalle)) {
        JOptionPane.showMessageDialog(null, "Los campos de nombre y detalle solo deben contener letras y espacios.");
        return;
    }
    
    try {
        double CantCalorias = Double.parseDouble(caloriasText);
        Comida comidaSeleccionada = obtenerComidaSeleccionada();
        
        if (comidaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una comida para editar.");
            return;
        }
        
        comidaSeleccionada.setNombre(nombre);
        comidaSeleccionada.setDetalle(detalle);
        comidaSeleccionada.setCantCalorias((int) CantCalorias);
        
        comidaData.modificarComida(comidaSeleccionada);

        cargarComidasEnComboBox(); // Actualiza el JComboBox con los cambios
        jComboBox1.setSelectedIndex(-1);
        TFNombreComida.setText("");
        TFDetalle.setText("");
        TFCalorias.setText("");
        
        JOptionPane.showMessageDialog(null, "Comida editada exitosamente.");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor válido para las calorías.");
    }
}


private Comida obtenerComidaSeleccionada() {
    String nombreComida = (String) jComboBox1.getSelectedItem();
    return comidaData.buscarComidaPorNombre(nombreComida);
}
   private void eliminarComida() {
    Comida comidaSeleccionada = obtenerComidaSeleccionada();
    
    if (comidaSeleccionada == null) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una comida para eliminar.");
        return;
    }
    
    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas eliminar esta comida?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
    
    if (confirmacion == JOptionPane.YES_OPTION) {
        comidaData.eliminarComida(comidaSeleccionada.getIdComida());
        cargarComidasEnComboBox(); // Actualiza el JComboBox sin la comida eliminada
        limpiarCampos();
        JOptionPane.showMessageDialog(null, "Comida eliminada exitosamente.");
    }
}

private void limpiarCampos() {
     cargarComidasEnComboBox(); // Actualiza el JComboBox con los cambios
        jComboBox1.setSelectedIndex(-1);
         TFNombreComida.setText("");
        TFDetalle.setText("");
        TFCalorias.setText("");

}

// Método para validar que un campo solo contiene letras y espacios
private boolean validarTexto(String texto) {
    // La expresión regular permite letras mayúsculas, minúsculas y espacios
    String regex = "^[A-Za-z ]+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(texto);
    return matcher.matches();
}
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JTextField TFCalorias;
    private javax.swing.JTextField TFDetalle;
    private javax.swing.JTextField TFNombreComida;
    private javax.swing.JLabel TXTCaloria;
    private javax.swing.JLabel TXTDetalle;
    private javax.swing.JLabel TXTNombre;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
