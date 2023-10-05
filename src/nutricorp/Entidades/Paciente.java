/*
 * nombre , dni , domicilio , telefono , idpaciente
 */
package nutricorp.Entidades;

/**
 *
 * @author Matias
 */
public class Paciente {
    private String nombre;
    private int dni;
    private String dominicilio;
    private String telefono;
    private int idPaciente;
    private String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDominicilio() {
        return dominicilio;
    }

    public void setDominicilio(String dominicilio) {
        this.dominicilio = dominicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Paciente() {
    }

    public Paciente(String nombre, int dni, String dominicilio, String telefono, int idPaciente, String apellido) {
        this.nombre = nombre;
        this.dni = dni;
        this.dominicilio = dominicilio;
        this.telefono = telefono;
        this.idPaciente = idPaciente;
        this.apellido = apellido;
    }
    
    

    public Paciente(String nombre, int dni, String dominicilio, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.dominicilio = dominicilio;
        this.telefono = telefono;
    }

    public void getApellido(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getDni(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getDominicilio(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
