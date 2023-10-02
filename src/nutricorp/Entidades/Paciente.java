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

    public Paciente(String nombre, int dni, String dominicilio, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.dominicilio = dominicilio;
        this.telefono = telefono;
    }
    
}
