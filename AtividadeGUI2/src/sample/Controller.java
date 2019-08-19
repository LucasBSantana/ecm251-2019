package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label lblTexto;
    @FXML
    private TextField txtNome;

    @FXML
    public void changeText(){
        lblTexto.setText("Hello "+txtNome.getText());
        txtNome.clear();
    }

}
