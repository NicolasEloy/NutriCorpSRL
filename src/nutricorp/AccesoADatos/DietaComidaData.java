/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricorp.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import nutricorp.Entidades.Comida;
import nutricorp.Entidades.DietaComida;

/**
 *
 * @author Matias
 */
public class DietaComidaData {
        Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    String sql = "";
    
    public void guardarDietaComida(DietaComida comida) {
        sql = "INSERT INTO comidadieta(IdDieta,Horarios,Porciones) VALUES (?, ?, ?)";
        try {
            connection =  CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, comida.getDieta().getIdDieta());
            ps.setString(2, comida.getHorario());
            ps.setInt(3, comida.getComida().getIdComida());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "ComidaDieta Guardada");

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comidadieta");
        }
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
                JOptionPane.showMessageDialog(null, "Se modificó la ComidaDieta correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comidadieta" + ex.getMessage());
        }
    }

    public void eliminarComidaDieta(int id) {
        sql = "DELETE FROM comidadieta WHERE IdComidaDieta = ?";
        try {
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "ComidaDieta Eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comidadieta");
        }
    }
    public List<DietaComida> comidasEnDieta(int iddieta,String horarios){
     List<DietaComida> dietaComida = new ArrayList<>();
        try {
            sql = "SELECT comida.IdComida, comida.Nombre, comida.CantCalorias,comidadieta.Porciones FROM comida INNER JOIN comidadieta ON comida.IdComida = comidadieta.IdComida WHERE comidadieta.IdDieta = ? and comidadieta.Horarios=?";
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, iddieta);
            ps.setString(2,horarios);
            rs = ps.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                DietaComida dietacomida=new DietaComida();
                comida.setIdComida(rs.getInt("comida.IdComida"));
                comida.setNombre(rs.getString("comida.Nombre"));
                comida.setCantCalorias( rs.getInt("comida.CantCalorias"));
                dietacomida.setPorciones(rs.getInt("comidadieta.Porciones"));
                dietacomida.setComida(comida);
                dietaComida.add(dietacomida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comidadieta " + ex.getMessage());
        }
        return dietaComida;
}
    public List<DietaComida> horarios(){
     List<DietaComida> dietaComida = new ArrayList<>();
        try {
            sql = "SELECT Horarios FROM comidadieta";
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DietaComida dietacomida=new DietaComida();
                dietacomida.setHorario("Horarios");
                dietaComida.add(dietacomida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comidadieta " + ex.getMessage());
        }
        return dietaComida;
}
}
