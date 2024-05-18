package co.edu.uniquindio.poo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    int filas;
    int columnas;

    @FXML
    private Button boton_crearParqueadero;

    @FXML
    private TextField txt_columnas;

    @FXML
    private TextField txt_filas;

    private Puesto[][] parqueadero ;

    
    //CONSTRUCTOR
    public PrimaryController(Puesto[][] parqueadero) {
        this.parqueadero = parqueadero;
    }
    
    //CONSTRUCTOR VACIO
    public PrimaryController() {
    }

    @FXML
    void accion_crearParqueadero(ActionEvent event) throws IOException {
        //APP.SETROOT PARA CARGAR LA SEGUNDA VISTA 
        App.setRoot("secondary");

        //SE OBTIENEN LAS FILAS Y COLUMNAS PARA CREAR EL PARQUEADERO 
        filas = Integer.parseInt(txt_filas.getText());
        columnas = Integer.parseInt(txt_columnas.getText());
        parqueadero = new Puesto[filas][columnas];
        System.out.println("parqueadero creado de " + filas + "x" + columnas);
    }

    

    public void agregarPuestoCarro(Puesto puesto){

    }

}
