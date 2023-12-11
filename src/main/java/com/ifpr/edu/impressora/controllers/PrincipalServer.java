package com.ifpr.edu.impressora.controllers;

import com.ifpr.edu.impressora.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrincipalServer {

    @FXML
    private Button cancelButton;

    @FXML
    private Button confirmButton;

    @FXML
    private Button editButton;

    @FXML
    private Label lbNumFichas;

    @FXML
    private TextField tfNovoValorFicha;

    @FXML
    void cancelChanges(ActionEvent event) {
            editButton.setVisible(true);
        tfNovoValorFicha.setVisible(false);
        cancelButton.setVisible(false);
        confirmButton.setVisible(false);
    }

    @FXML
    void confirmChanges(ActionEvent event) {
        editButton.setVisible(true);
        tfNovoValorFicha.setVisible(false);
        cancelButton.setVisible(false);
        confirmButton.setVisible(false);
    }

    @FXML
    void emitPrint(ActionEvent event) {

    }

    @FXML
    void pushCreditScreen(ActionEvent event) {

    }

    @FXML
    void pushUsersScreen(ActionEvent event) {
        App.pushScreen("TELA_PESSOAS");
    }

    @FXML
    void startCreditChanges(ActionEvent event) {
        editButton.setVisible(false);
        tfNovoValorFicha.setVisible(true);
        cancelButton.setVisible(true);
        confirmButton.setVisible(true);
    }

    @FXML
    void realizeLogoff(ActionEvent event) {
        App.popScreen();
    }
    

}
