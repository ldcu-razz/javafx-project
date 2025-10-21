package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void handleLoginButton() {
        System.out.println("Login Button clicked");
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Login");
        alert.setHeaderText("Login");
        alert.setContentText("Welcome to JavaFX Application!");

        alert.showAndWait();
    }

    @FXML
    protected void handleSignInButton() {
        System.out.println("Sign In Button clicked");
    }
}