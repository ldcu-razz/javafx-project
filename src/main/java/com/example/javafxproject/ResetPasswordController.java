package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

public class ResetPasswordController {

    @FXML
    PasswordField currentPasswordField;

    @FXML
    PasswordField newPasswordField;

    @FXML
    Button continueButton;

    public void initialize() {
        System.out.println("Initialize ResetPasswordController");
    }

    @FXML
    public void handleContinueButtonAction() {
        String currentPasswordValue = currentPasswordField.getText();
        String newPasswordValue = newPasswordField.getText();

        System.out.println("Current Password Value: " + currentPasswordValue);
        System.out.println("New Password Value: " + newPasswordValue);
    }

}
