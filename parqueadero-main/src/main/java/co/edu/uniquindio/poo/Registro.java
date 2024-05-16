package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;

public class Registro {
   
    private Collection<Puesto> puestos;
    private Vehiculo vehiculo;
    private double ingresos;
    private int puestoOcupado;
    private LocalDate horaIngreso;
    private String idPropietario;
    public Registro(Collection<Puesto> puestos, Vehiculo vehiculo, double ingresos, int puestoOcupado,
            LocalDate horaIngreso, String idPropietario) {
        this.puestos = puestos;
        this.vehiculo = vehiculo;
        this.ingresos = ingresos;
        this.puestoOcupado = puestoOcupado;
        this.horaIngreso = horaIngreso;
        this.idPropietario = idPropietario;
    }
    public Collection<Puesto> getPuestos() {
        return puestos;
    }
    public void setPuestos(Collection<Puesto> puestos) {
        this.puestos = puestos;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public double getIngresos() {
        return ingresos;
    }
    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    public int getPuestoOcupado() {
        return puestoOcupado;
    }
    public void setPuestoOcupado(int puestoOcupado) {
        this.puestoOcupado = puestoOcupado;
    }
    public LocalDate getHoraIngreso() {
        return horaIngreso;
    }
    public void setHoraIngreso(LocalDate horaIngreso) {
        this.horaIngreso = horaIngreso;
    }
    public String getIdPropietario() {
        return idPropietario;
    }
    public void setIdPropietario(String idPropietario) {
        this.idPropietario = idPropietario;
    }
   
}