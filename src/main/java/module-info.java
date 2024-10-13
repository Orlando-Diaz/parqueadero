module uniquindio.edu.co.parqueadero {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens uniquindio.edu.co.parqueadero to javafx.fxml;
    exports uniquindio.edu.co.parqueadero;
}