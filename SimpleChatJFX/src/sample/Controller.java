package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML TextField txtfield;
    @FXML TextArea txtarea;

    public void btnOneClickAction(ActionEvent actionEvent) {
            txtarea.appendText(txtfield.getText() + "\n");
    }
}



