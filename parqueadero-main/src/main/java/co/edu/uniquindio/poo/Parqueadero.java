package co.edu.uniquindio.poo;

import java.util.Arrays;
import java.util.Collection;

public class Parqueadero {
    private String nombre;
    
    private Puesto [][] puestos ;
    private Collection<Registro> registros;

    private Collection<Moto> listaMotos;
    private Collection<Carro> listaCarros;
    private Collection<Vehiculo> vehiculos;

    private Double tarifaHora;
    

    public Parqueadero(String nombre, Collection<Vehiculo> vehiculos, Puesto[][] puestos,
            Collection<Registro> registros) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
        this.puestos = puestos;
        this.registros = registros;
    }

    //CONSTRUCTOR VACIO 
    public Parqueadero() {
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public Puesto[][] getPuestos() {
        return puestos;
    }
    public void setPuestos(Puesto[][] puestos) {
        this.puestos = puestos;
    }
    public Collection<Registro> getRegistros() {
        return registros;
    }
    public void setRegistros(Collection<Registro> registros) {
        this.registros = registros;
    }
    
    @Override
    public String toString() {
        return "Parqueadero [nombre=" + nombre + ", vehiculos=" + vehiculos + ", puestos=" + Arrays.toString(puestos)
                + ", registros=" + registros + ", tarifaHora=" + tarifaHora + "]";
    }
    public Double getTarifaHora() {
        return tarifaHora;
    }
    public void setTarifaHora(Double tarifaHora) {
        this.tarifaHora = tarifaHora;
    } 

    public void agregarCarro(Carro carro) {
        listaCarros.add(carro); // Agrega el objeto de tipo Carro a la colección listaCarros
    }

    public void agregarMoto(Moto moto) {
        listaMotos.add(moto); // Agrega el objeto de tipo moto a la colección listaCarros
    }

    public void imprimirListaCarros() {
        for (Carro carro : listaCarros) {
            System.out.println(carro); // Imprime cada objeto Carro en la colección
        }
    }

    public void imprimirListaMotos() {
        for (Moto moto : listaMotos) {
            System.out.println(listaMotos); // Imprime cada objeto moto en la colección
        }
    }

}
