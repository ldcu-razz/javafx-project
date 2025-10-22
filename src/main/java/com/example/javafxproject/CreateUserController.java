package com.example.javafxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateUserController {

    @FXML
    private TextField firstnameTextField;
    @FXML
    private TextField lastnameTextField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField reEnterPasswordTextField;

    public void initialize() {
        // TODO
    }

    public void handleBackButtonAction(ActionEvent action) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login-view.fxml"));
        Parent root = loader.load();

        // Get the current stage
        Stage stage = (Stage) ((Node) action.getSource()).getScene().getWindow();

        // Set new scene
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void handleCreateButtonAction(ActionEvent action) throws IOException {
        String firstname = firstnameTextField.getText();
        String lastname = lastnameTextField.getText();
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        String reEnterPassword = reEnterPasswordTextField.getText();

        System.out.println(firstname + " " + lastname + " " + username + " " + password + " " + reEnterPassword);
    }
}
