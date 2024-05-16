package co.edu.uniquindio.poo;

import java.io.IOException;

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
    private TextField txt_motoClasica;

    @FXML
    private TextField txt_tarifaCarro;

    @FXML
    private TextField txt_tarifa_motoHibrida;

    @FXML
    private TextField txt_TarifamotoClasica;

    public double tarifaMotoClasica;
    public double tarifaMotoHibrida;
    public double tarifaCarro;
    SecondaryController s2 = new SecondaryController();

    @FXML
    void accion_crearParqueadero(ActionEvent event) throws IOException {
        App.setRoot("secondary");
        int filas = 0;
        int columnas = 0;

        tarifaMotoClasica = Double.parseDouble(txt_TarifamotoClasica.getText());
        tarifaMotoHibrida = Double.parseDouble(txt_tarifa_motoHibrida.getText());
        tarifaCarro = Double.parseDouble(txt_tarifaCarro.getText());

        s2.recibir_tarifas(tarifaMotoClasica, tarifaMotoHibrida, tarifaCarro);

        filas = Integer.parseInt(txt_filas.getText());
        columnas = Integer.parseInt(txt_columnas.getText());
        Puesto parqueadero1[][] = new Puesto[filas][columnas];
        System.out.println("parqueadero creado de " + filas + "x" + columnas);
    }

}
