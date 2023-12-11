package com.ifpr.edu.impressora.controllers;

import com.ifpr.edu.impressora.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class TelaDeLogin {

    @FXML
    private AnchorPane body;

    @FXML
    private Button btAvancarServ;

    @FXML
    private Button btAvancarUser;

    @FXML
    private Button btServidor;

    @FXML
    private Button btUsuario;

    @FXML
    private VBox hudLoginServ;

    @FXML
    private VBox hudLoginUser;

    @FXML
    private Label labelH2;

    @FXML
    private Label labelTitulo;

    @FXML
    private Label lbErroServ;

    @FXML
    private Label lbErroUser;

    @FXML
    private PasswordField pswSenhaServ;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfSiape;

    
    @FXML
    void mudarTelaServ(ActionEvent event) {
        hudLoginServ.setVisible(true);
        hudLoginUser.setVisible(false);
        btServidor.getStyleClass().add("active");
        btUsuario.getStyleClass().remove(2);
    }

    @FXML
    void mudarTelaUser(ActionEvent event) {
        hudLoginServ.setVisible(false);
        hudLoginUser.setVisible(true);
        btServidor.getStyleClass().remove(2);
        btUsuario.getStyleClass().add("active");
    }

    @FXML
    void realizeLoginServ(ActionEvent event) {
        App.pushScreen("PRINCIPAL_SERVER");
    }

    @FXML
    void realizeLoginUser(ActionEvent event) {
        App.pushScreen("PRINCIPAL_USER");
    }

}
