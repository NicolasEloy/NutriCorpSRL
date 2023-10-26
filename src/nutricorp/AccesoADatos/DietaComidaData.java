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
import nutricorp.Entidades.Dieta;
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

    public void guardarDietaComida(DietaComida dietacomida) {
        sql = "INSERT INTO comidadieta(IdDieta,IdComida,Horarios,Porciones) VALUES (?, ?, ?, ?)";
        try {
            connection =  CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, dietacomida.getDieta().getIdDieta());
            ps.setInt(2, dietacomida.getComida().getIdComida());
            ps.setString(3, dietacomida.getHorario());
            ps.setInt(4, dietacomida.getPorciones());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "ComidaDieta Guardada");

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comidadieta");
        }
    }
    public void modificarComida(DietaComida dietacomida) {
        sql = "UPDATE comidadieta SET IdDieta = ?, IdComida = ?, Horarios = ?, Porciones = ? WHERE IdComidaDieta";
        try {
            connection =  CConection.getConexion(); 
            ps = connection.prepareStatement(sql);
            ps.setInt(1, dietacomida.getDieta().getIdDieta());
            ps.setInt(2, dietacomida.getComida().getIdComida());
            ps.setString(3, dietacomida.getHorario());
            ps.setInt(4, dietacomida.getPorciones());
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
            sql = "SELECT comida.IdComida, comida.Nombre,comidadieta1.Horarios, comidadieta1.Porciones,comidadieta1.IdComidaDieta, dieta.IdDieta, dieta.Nombre\n" +
                  "FROM comida\n" +
                  "INNER JOIN comidadieta AS comidadieta1 ON comida.IdComida = comidadieta1.IdComida\n" +
                  "INNER JOIN dieta ON dieta.IdDieta = comidadieta1.IdDieta\n" +
                  "WHERE comidadieta1.IdDieta = ? AND comidadieta1.Horarios = ?;";
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, iddieta);
            ps.setString(2,horarios);
            rs = ps.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                Dieta dieta=new Dieta();
                DietaComida dietacomida=new DietaComida();
                comida.setIdComida(rs.getInt("comida.IdComida"));
                comida.setNombre(rs.getString("comida.Nombre"));
                dietacomida.setHorario(rs.getString("comidadieta1.Horarios"));
                dietacomida.setPorciones(rs.getInt("comidadieta1.Porciones"));
                dietacomida.setId(rs.getInt("comidadieta1.IdComidaDieta"));
                dieta.setIdDieta(rs.getInt("dieta.IdDieta"));
                dieta.setNombre(rs.getString("dieta.Nombre"));
                dietacomida.setDieta(dieta);
                dietacomida.setComida(comida);
                dietaComida.add(dietacomida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comidadieta " + ex.getMessage());
        }
        return dietaComida;
}
    public List<String> horarios(){
     List<String> horarios = new ArrayList<>();
        try {
            sql = "SELECT DISTINCT Horarios FROM comidadieta";
            connection = CConection.getConexion();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DietaComida dietacomida =new DietaComida();
                dietacomida.setHorario(rs.getString("Horarios"));
                horarios.add(dietacomida.getHorario());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de comidadieta " + ex.getMessage());
        }
        return horarios;
}
    
}
