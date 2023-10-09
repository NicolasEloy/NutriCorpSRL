package nutricorp.AccesoADatos;
import java.sql.*;
import javax.swing.JOptionPane;
public class CConection {
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="nutricorp";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
            
         private CConection(){}
                                  
         public static Connection getConexion(){
             if(connection==null){
                 try{                  
                     Class.forName("org.mariadb.jdbc.Driver");
                     
                     connection=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                 }catch(ClassNotFoundException ex){
                    JOptionPane.showMessageDialog(null, "Error al cargar los driver "+ex);
             }   catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos"+ ex);
             }
             }
             return connection;
         }
            
}