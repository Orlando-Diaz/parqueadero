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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class facturaController {

  @FXML
  private Button botonRegresar;

  @FXML
  void accion_regresarventana(ActionEvent event) throws IOException {

    App.setRoot("secondary");
  }

  public void recibir_infoMotos(String nombre, String cedula, TipoMoto tipo, String velocidad, String placa,
      String modelo) {

  }

}
