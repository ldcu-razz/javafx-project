package com.example.javafxproject;

import com.example.javafxproject.services.UsersService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
        navigateBackToLogin(action);
    }

    public void handleCreateButtonAction(ActionEvent action) {
        String firstname = firstnameTextField.getText();
        String lastname = lastnameTextField.getText();
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        String reEnterPassword = reEnterPasswordTextField.getText();

        if (!checkPasswordIfTheSame(password, reEnterPassword)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Passwords do not match!");
            alert.showAndWait();
            return;
        }

        boolean result = UsersService.createUser(
                firstname,
                lastname,
                username,
                password
        );

        if (result) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("User created successfully!");
            alert.showAndWait();
            resetForm();
        }
    }

    public void navigateBackToLogin(ActionEvent action) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login-view.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) action.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private boolean checkPasswordIfTheSame(String password, String reEnterPassword) {
        return password.equals(reEnterPassword);
    }

    private void resetForm() {
        firstnameTextField.clear();
        lastnameTextField.clear();
        usernameTextField.clear();
        passwordTextField.clear();
        reEnterPasswordTextField.clear();
    }
}
