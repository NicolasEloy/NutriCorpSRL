/*
 * nombre , dni , domicilio , telefono , idpaciente
 */
package nutricorp.Entidades;

/**
 *
 * @author Matias
 */
public class Paciente {
    private int idPaciente;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String telefono;
    private double pesoActual;
    private boolean estado;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Paciente() {
    }

    public Paciente(String nombre, String apellido, int dni, String domicilio, String telefono, double pesoActual, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.pesoActual = pesoActual;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paciente{" + nombre +","+ apellido + ",dni=" + dni + '}';
    }
    
    
    

    
    
    
}
