package com.ifpr.edu.impressora.controllers;

import java.nio.file.Path;

import com.github.hugoperlin.results.Resultado;
import com.ifpr.edu.impressora.App;
import com.ifpr.edu.impressora.utils.FileSearch;
import com.ifpr.edu.impressora.utils.Imprimir;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

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
        Resultado result = FileSearch.selectFile();
        if (result.foiErro()) {
            Alert alert = new Alert(AlertType.INFORMATION, result.getMsg());
            alert.showAndWait();
            return; 
        }
        Path path = (Path)result.comoSucesso().getObj();
        result = Imprimir.realizarImpressao(path);
        if (result.foiErro()) {
            Alert alert = new Alert(AlertType.ERROR, result.getMsg());
            alert.showAndWait();
            return;
        }
        
        Alert alert = new Alert(AlertType.INFORMATION, result.getMsg());
        alert.showAndWait();
    
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
