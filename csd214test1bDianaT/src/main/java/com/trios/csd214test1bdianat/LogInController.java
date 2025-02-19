package com.trios.csd214test1bdianat;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LogInController
{
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label messageLabel;

    private final UserModel userModel = new UserModel();

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String result = userModel.authenticate(username, password);
        messageLabel.setText(result);
    }
}
