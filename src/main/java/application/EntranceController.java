package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EntranceController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Entre;

    @FXML
    private TextField loginField;

    @FXML
    private Label result;

    static User user = new User("Alex", 4);

    @FXML
    void initialize() {
        Entre.setOnAction(event -> {
            String login = loginField.getText().trim();
            if (!(login.equals(""))) {
                if (login.equals(user.getUsername())){
                    Main.repaint();
            }
        };
    });

}}
