/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricorp.Entidades;

import java.time.LocalDate;


public class HistorialPeso {
    private double peso;
    private LocalDate fechaRegistro;

    public HistorialPeso(double peso, LocalDate fechaRegistro) {
        this.peso = peso;
        this.fechaRegistro = fechaRegistro;
    }

    public HistorialPeso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
    
}
