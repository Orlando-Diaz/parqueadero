package co.edu.uniquindio.poo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button boton_crearParqueadero;

    @FXML
    private TextField txt_columnas;

    @FXML
    private TextField txt_filas;

    @FXML
    void accion_crearParqueadero(ActionEvent event) throws IOException {

        App.setRoot("secondary");
        int filas;
        int columnas;

        filas = Integer.parseInt(txt_filas.getText());
        columnas = Integer.parseInt(txt_columnas.getText());
        Puesto parqueadero1[][] = new Puesto[filas][columnas];
        System.out.println("parqueadero creado de " + filas + "x" + columnas);
    }

}
