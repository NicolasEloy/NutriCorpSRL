/*
 *nombre , dni , domicilio , telefono , idpaciente
 */
package nutricorp.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import nutricorp.Entidades.Paciente;
/**
 *
 * @author Matias
 */
public class PacienteData extends Paciente{
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    String sql = "";
    
    public void insertarPaciente(Paciente paciente) {
        try {
            // Establecer la conexión antes de la preparación de la sentencia SQL
            connection = CConection.getConexion();

            sql = "INSERT INTO `alumno`( `nombre`, `dni`, `domicilio`, `telefono`) VALUES (?,?,?,?);";
            ps = connection.prepareStatement(sql);

            // Completar los campos con símbolos por las variables
            // Primera posición corresponde al primer símbolo y así sucesivamente, la contabilización arranca desde 1
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setString(4, paciente.getTelefono());    
            ps.executeUpdate();
            // Cerrar la consulta y otros recursos si es necesario
            System.out.println("Paciente cargado correctamente ");
            JOptionPane.showMessageDialog(null, "Paciente Ingresado Correctamente");

        } catch (SQLException | NumberFormatException e) { // Coloca esto aquí
            // Coloca esto aquí
            System.out.println("Error al cargar los datos del Pacientealumno: " + e.getMessage());
        }
    }
    public List<Paciente> listarPaciente() {
        List<Paciente> pacientes = new ArrayList<>();
        try {
             sql = "SELECT * FROM paciente WHERE estado = 1 ";
             rs = ps.executeQuery();
            while (rs.next()) {
                Paciente paciente = new Paciente();

                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return pacientes;
    }
}
