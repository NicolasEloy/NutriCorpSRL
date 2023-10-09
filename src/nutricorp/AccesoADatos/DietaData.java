/*seleccionar pacienten que la fecha de finalizacion ya termino 
SELECT paciente.Nombre ,paciente.Telefono ,dieta.fechaInicial ,
dieta.pesoInicial, dieta.pesoFinal, dieta.FechaFinal FROM paciente
, dieta WHERE dieta.FechaFinal < '2023/10/10' ORDER BY dieta.FechaFinal;
 */
package nutricorp.AccesoADatos;

/**
 *
 * @author Matias
 */
public class DietaData {
    
}
