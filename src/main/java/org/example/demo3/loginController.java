package org.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class loginController {
    @FXML
    private Button connecter;
    @FXML
    private TextField txtemail;
    @FXML
    private PasswordField txtpassword;
    @FXML
    private Label lblError;

    private static final String EMAIL = "marchelle21@gmail.com";
    private static final String PASSWORD = "march21";

    @FXML
    private void switchTohomePage(ActionEvent e) {
        String enteredEmail = txtemail.getText();
        String enteredPassword = txtpassword.getText();

        if (EMAIL.equals(enteredEmail) && PASSWORD.equals(enteredPassword)) {
            try {
                HelloApplication.loadPage("page_acceuil.fxml");
            } catch (IOException ex) {
                ex.printStackTrace();
                lblError.setText("Error: " + ex.getMessage());
            }
        } else {
            lblError.setText("Invalid email or password.");
        }
    }
}
