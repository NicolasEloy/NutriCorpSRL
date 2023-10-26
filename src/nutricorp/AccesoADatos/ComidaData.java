package nutricorp.AccesoADatos; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import nutricorp.Entidades.Comida;

public class ComidaData {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    String sql = "";

    public void guardarComida(Comida comida) {
        sql = "INSERT INTO comida(Nombre, Detalle, CantCalorias) VALUES (?, ?, ?)";
        try {
            connection =  CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setDouble(3, comida.getCantCalorias());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Comida Guardada");

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comida");
        }
    }

    public Comida buscarComida(int id) {
        sql = "SELECT Nombre, Detalle, CantCalorias FROM comida WHERE IdComida = ?";
        Comida comida = null;
        try {
            connection =  CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                comida = new Comida();
                comida.setNombre(rs.getString("Nombre"));
                comida.setDetalle(rs.getString("Detalle"));
                comida.setCantCalorias((int) rs.getDouble("CantCalorias"));
            } else {
                //JOptionPane.showMessageDialog(null, "No existe esa Comida");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comida");
        }
        return comida;
    }

    public void modificarComida(Comida comida) {
        sql = "UPDATE comida SET Nombre = ?, Detalle = ?, CantCalorias = ? WHERE IdComida = ?";
        try {
            connection =  CConection.getConexion(); 
            ps = connection.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setDouble(3, comida.getCantCalorias());
            ps.setInt(4, comida.getIdComida());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó la Comida correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comida" + ex.getMessage());
        }
    }

    public void eliminarComida(int id) {
        sql = "DELETE FROM comida WHERE IdComida = ?";
        try {
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Comida Eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comida");
        }
    }

public List<Comida> listarComidas() {
        List<Comida> comidas = new ArrayList<>();
        try {
            sql = "SELECT * FROM comida";
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Comida comida = new Comida();
                comida.setIdComida(rs.getInt("IdComida"));
                comida.setNombre(rs.getString("Nombre"));
                comida.setDetalle(rs.getString("Detalle"));
                comida.setCantCalorias( rs.getInt("CantCalorias"));
                comidas.add(comida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comida " + ex.getMessage());
        }
        return comidas;
    }

public Comida buscarComidaPorNombre(String nombreComida) {
    Comida comida = null;
    String sql = "SELECT * FROM comida WHERE Nombre = ?";
    
    try {
        connection = CConection.getConexion();
        ps = connection.prepareStatement(sql);
        ps.setString(1, nombreComida);
        rs = ps.executeQuery();

        if (rs.next()) {
            comida = new Comida();
            comida.setIdComida(rs.getInt("IdComida"));
            comida.setNombre(rs.getString("Nombre"));
            comida.setDetalle(rs.getString("Detalle"));
            comida.setCantCalorias(rs.getInt("CantCalorias"));
        } else {
          //  JOptionPane.showMessageDialog(null, "No existe esa Comida");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar la comida por nombre: " + ex.getMessage());
    }
    return comida;
}

public List<Comida> comidasSinDieta(int iddieta){
    List<Comida> comidas = new ArrayList<>();
        try {
            sql = "SELECT IdComida, Nombre, CantCalorias\n" +
                  "FROM comida\n" +
                  "WHERE IdComida NOT IN (SELECT IdComida FROM comidadieta WHERE IdDieta = ?);";
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, iddieta);
            rs = ps.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                comida.setIdComida(rs.getInt("IdComida"));
                comida.setNombre(rs.getString("Nombre"));
                comida.setCantCalorias( rs.getInt("CantCalorias"));
                comidas.add(comida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comida " + ex.getMessage());
        }
        return comidas;
}

}




