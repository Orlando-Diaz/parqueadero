package co.edu.uniquindio.poo;

public class Puesto {
    private int numeroPuesto;
    private boolean disponibilidad;
    private Registro registro;
    
    public Puesto(int numeroPuesto, boolean disponibilidad, Registro registro) {
        this.numeroPuesto = numeroPuesto;
        this.disponibilidad = disponibilidad;
        this.registro = registro;
    }
    public int getNumeroPuesto() {
        return numeroPuesto;
    }
    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public Registro getRegistro() {
        return registro;
    }
    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    
}
