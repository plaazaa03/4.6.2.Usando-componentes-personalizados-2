package es.ieslosmontecillos.appusotextoboton;

import es.ieslosmontecillos.componentes_plazaraul.CampoTextoBoton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class UsoTextoBotonController implements Initializable {
    @FXML
    private Label lblResultado;
    @FXML
    private CampoTextoBoton txtNombre;
    @FXML
    private CampoTextoBoton txtApellido;

    @FXML
    public void grabaRegistroNombre(){
        lblResultado.setText("Se ha grabado: " + txtNombre);
    }

    @FXML
    public void grabaRegistroApellido() {
        lblResultado.setText("Se ha grabado: " + txtApellido);
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtNombre.setText("Nombre");
        txtApellido.setText("Apellido");
    }
}
