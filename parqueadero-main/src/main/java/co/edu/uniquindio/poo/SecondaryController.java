package co.edu.uniquindio.poo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

//investiguen esta implementacion "initializable"
public class SecondaryController implements Initializable {

    public double tarifaMotoClasica;
    public double tarifaMotoHibrida;
    public double tarifaCarro;

    String cadena = "";
    Parqueadero par = new Parqueadero();
    PrimaryController primary = new PrimaryController();

    @FXML
    private Button boton_registrar;

    @FXML
    private ComboBox<TipoMoto> combo_tipoMoto;

    @FXML
    private ComboBox<Vehiculo> combo_tipoVehiculo;

    @FXML
    private TextField txt_cedula;

    @FXML
    private TextField txt_modeloMoto;

    @FXML
    private TextField txt_nombre;

    @FXML
    private TextField txt_velocidadMaxima;

    @FXML
    private TextField txt_placa;

    @FXML
    private TextField txt_placaCarro;

    @FXML
    private TextField txt_modeloCarro;

    @FXML
    private Button boton_registrarCarro;

    @FXML
    private TextField txt_tiempoDeUso;

    @FXML
    private Button boton_actualizarPrecios;

    @FXML
    private TextArea txtArea;

    // METODO PARA RECIBIR LAS 3 TARIFAS DE PRIMARYCONTROLLER
    public double recibir_tarifas(double t1, double t2, TipoMoto tipo, int tiempouso) {

        this.tarifaMotoClasica = t1;
        this.tarifaMotoHibrida = t2;

        if (tipo.equals(TipoMoto.CLASICA)) {
            double total = tarifaMotoClasica * tiempouso;
            System.out.println("la moto clasica debe pagar : " + total);
            return total;
        } else {
            double total = tarifaMotoHibrida * tiempouso;
            System.out.println("la moto hibrida debe pagar :" + total);
            return total;
        }

    }

    @FXML
    void accion_registrarMoto(ActionEvent event) throws IOException {

        double totalPagar;
        tarifaMotoClasica = 1000;
        tarifaMotoHibrida = 1500;

        String nombre = txt_nombre.getText();
        String cedula = txt_cedula.getText();
        Propietario p1 = new Propietario(nombre, cedula, null);

        TipoMoto tipoMoto = combo_tipoMoto.getSelectionModel().getSelectedItem();
        String placa = txt_placa.getText();
        int velocidaMaxima = Integer.parseInt(txt_velocidadMaxima.getText());
        String modeloVehiculo = txt_modeloMoto.getText();

        Moto m1 = new Moto(placa, modeloVehiculo, p1, velocidaMaxima);

        int tiempoDeUso = Integer.parseInt(txt_tiempoDeUso.getText());

        if (tipoMoto.equals(TipoMoto.CLASICA)) {
            totalPagar = tiempoDeUso * tarifaMotoClasica;
        } else {
            totalPagar = tiempoDeUso * tarifaMotoHibrida;
        }


        txtArea.setText("COMPROBANTE :" + "\n " + nombre + "\n" + cedula + "\n" + tipoMoto + "\n" + placa + "\n" + 
        velocidaMaxima + "\n" + modeloVehiculo + "\n"+ totalPagar);

        System.out.println(nombre);
        System.out.println(cedula);
        System.out.println(tipoMoto);
        System.out.println(placa);
        System.out.println(velocidaMaxima);
        System.out.println(modeloVehiculo);
        System.out.println("debe pagar : " + totalPagar);

    }

    @FXML
    void acccion_registrarCarro(ActionEvent event) throws IOException {

        tarifaCarro = 2000;

        String nombre = txt_nombre.getText();
        String cedula = txt_cedula.getText();
        // CREACION DEL PROPIETARIO DEL CARRO
        Propietario p2 = new Propietario(nombre, cedula, null);

        String placaCarro = txt_placaCarro.getText();
        String modeloCarro = txt_modeloCarro.getText();
        // CREACION DEL CARRO
        Carro c1 = new Carro(placaCarro, modeloCarro, null);

        int tiempoDeUso = Integer.parseInt(txt_tiempoDeUso.getText());

        double totalPagar = tarifaCarro * tiempoDeUso;

        txtArea.setText("COMPROBANTE :" + "\n " + nombre + "\n" + cedula + "\n" + "\n" + placaCarro + "\n" + 
         "\n" + modeloCarro + "\n"+ totalPagar);

        System.out.println(nombre);
        System.out.println(cedula);
        System.out.println(placaCarro);
        System.out.println(modeloCarro);
        System.out.println("Total a Pagar: " + totalPagar);

    }

    // METODO SOBREESCRITO DE LA IMPLEMENTACION DE LA CLASE INITIALIZABLE
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        ObservableList<TipoMoto> list = FXCollections.observableArrayList(TipoMoto.values());
        combo_tipoMoto.setItems(list);
    }

    @FXML
    void accion_actualizarprecios(ActionEvent event) {

    }

}