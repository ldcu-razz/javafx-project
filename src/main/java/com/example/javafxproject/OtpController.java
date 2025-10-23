package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OtpController {

    @FXML
    Label enterOtpLabel;

    @FXML
    TextField otpField;

    @FXML
    Button submitButton;

    @FXML
    public void handleSubmitButtonAction() {
        String otpValue = otpField.getText();

        System.out.println("OPT VALUE: " + otpValue);
    }

}
