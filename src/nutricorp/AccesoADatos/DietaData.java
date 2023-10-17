/*seleccionar pacienten que la fecha de finalizacion ya termino 
SELECT paciente.Nombre ,paciente.Telefono ,dieta.fechaInicial ,
dieta.pesoInicial, dieta.pesoFinal, dieta.FechaFinal FROM paciente
, dieta WHERE dieta.FechaFinal < '2023/10/10' ORDER BY dieta.FechaFinal;
 */
package nutricorp.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import nutricorp.Entidades.Dieta;
import nutricorp.Entidades.Paciente;



public class DietaData {
    
     Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    String sql = "";

    public DietaData(Connection connection, PreparedStatement ps, ResultSet rs) {
        this.connection = connection;
        this.ps = ps;
        this.rs = rs;
    }
    public DietaData(){
        
    }
     public void guardarDieta(Dieta dieta) {
        sql = "INSERT INTO dieta(nombre, idPaciente, fechaInicial, pesoInicial, pesoFinal, fechaFinal) VALUES(?, ?, ?, ?, ?, ?)";
        try {
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dieta.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta Guardada, el ID de la dieta es " + dieta.getIdDieta());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de dieta: " + ex.getMessage());
        }
    }

  public Dieta buscarDieta(int id) {
        sql = "SELECT nombre, idPaciente, fechaInicial, pesoInicial, pesoFinal, fechaFinal FROM dieta WHERE idDieta = ?";
        Dieta dieta = null;
        try {
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                dieta = new Dieta();
                dieta.setIdDieta(id);
                dieta.setNombre(rs.getString("nombre"));
                // Puedes continuar llenando los demás campos de la dieta.
            } else {
                JOptionPane.showMessageDialog(null, "No existe esa Dieta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de dieta: " + ex.getMessage());
        }
        return dieta;
    }

    public void modificarDieta(Dieta dieta) {
        sql = "UPDATE dieta SET nombre = ?, idPaciente = ?, fechaInicial = ?, pesoInicial = ?, pesoFinal = ?, fechaFinal = ? WHERE idDieta = ?";
        try {
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setInt(7, dieta.getIdDieta());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó la Dieta correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de dieta: " + ex.getMessage());
        }
    }

    public void eliminarDieta(int id) {
        sql = "DELETE FROM dieta WHERE idDieta = ?";
        try {
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Dieta Eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de dieta: " + ex.getMessage());
        }
     
     
     
    /* idDieta , nombre , paciente paciente , localdate fechaInicial
double pesoInicial,double pesoFinal, localdate fechaFinal
 */
}
public List<Dieta> listarDieta() {
        List<Dieta> dietas = new ArrayList<>();
        try {
             sql = "SELECT nombre FROM dieta ";
             rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setNombre(rs.getString("nombre"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Dieta " + ex.getMessage());
        }
        return dietas;
    }
public List<Dieta>ListarPacientesDietaTerminada(Date ld){
        List<Dieta> dietas=new ArrayList<>();
        sql = "SELECT paciente.Nombre ,paciente.Telefono ,dieta.fechaInicial ,\n" +
                   "dieta.pesoInicial, dieta.pesoFinal, dieta.FechaFinal FROM paciente\n" +
                   ", dieta WHERE dieta.FechaFinal < ? ORDER BY dieta.FechaFinal";
        try{
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setDate(1,ld);
            
            rs =ps.executeQuery();
            while (rs.next()){
                Dieta dieta =new Dieta();
                Paciente paciente=new Paciente();
                paciente.setNombre(rs.getString("paciente.Nombre"));
                paciente.setTelefono(rs.getString("paciente.Telefono"));
                dieta.setPaciente(paciente);
                dieta.setFechaInicial(rs.getDate("dieta.fechaInicial").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("dieta.pesoInicial"));
                dieta.setPesoFinal(rs.getDouble("dieta.pesoFinal"));
                dieta.setFechaFinal(rs.getDate("dieta.FechaFinal").toLocalDate());
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Dieta"+ ex.getMessage());
        }
        return dietas;
}








}

