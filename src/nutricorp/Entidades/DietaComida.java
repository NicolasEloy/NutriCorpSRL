package nutricorp.Entidades;

public class DietaComida {
    private int id;
    private Comida comida;
    private Dieta dieta;
    private String Horario;
    private int porciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }
    
    public DietaComida() {
    }

    public DietaComida(Comida comida, Dieta dieta,String Horario,int porciones) {
        this.comida = comida;
        this.dieta = dieta;
        this.Horario=Horario;
        this.porciones=porciones;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
    
}