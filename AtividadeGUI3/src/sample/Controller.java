package sample;

import javafx.fxml.FXML;
import model.BasicCalculator;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class Controller {

    @FXML
    private TextField txtValue1;

    @FXML
    private TextField txtValue2;

    @FXML
    private Label lblRes;

    @FXML
    public void sum(){
        BasicCalculator cassio = new BasicCalculator();
        lblRes.setText(""+cassio.getAdd(txtValue1.getText(), txtValue2.getText()));
    }

    @FXML
    public void subt(){
        BasicCalculator cassio = new BasicCalculator();
        lblRes.setText(""+cassio.getSub(txtValue1.getText(), txtValue2.getText()));
    }

    @FXML
    public void mult(){
        BasicCalculator cassio = new BasicCalculator();
        lblRes.setText(""+cassio.getMult(txtValue1.getText(), txtValue2.getText()));
    }

    @FXML
    public void div(){
        BasicCalculator cassio = new BasicCalculator();
        lblRes.setText(""+cassio.getDiv(txtValue1.getText(), txtValue2.getText()));
    }
}
