package com.ifpr.edu.impressora.controllers;

import com.ifpr.edu.impressora.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class TelaDePessoas {

    @FXML
    private TableColumn<?, ?> clmCreditUser;

    @FXML
    private TableColumn<?, ?> clmIDPersonServ;

    @FXML
    private TableColumn<?, ?> clmIDPersonUser;

    @FXML
    private TableColumn<?, ?> clmPersonCPFServ;

    @FXML
    private TableColumn<?, ?> clmPersonCPFUser;

    @FXML
    private TableColumn<?, ?> clmPersonEmailUser;

    @FXML
    private TableColumn<?, ?> clmPersonNameServ;

    @FXML
    private TableColumn<?, ?> clmPersonNameUser;

    @FXML
    private TableColumn<?, ?> clmServCIAPE;

    @FXML
    private AnchorPane hudServ;

    @FXML
    private AnchorPane hudUser;

    @FXML
    private Button openScreenEditUser;

    @FXML
    private ComboBox<?> optionsSearchServ;

    @FXML
    private ComboBox<?> optionsSearchUser;

    @FXML
    private Button removeUser;

    @FXML
    private TableView<?> tbUsuario;

    @FXML
    private TableView<?> tbUsuario1;

    @FXML
    private TextField tfSearchServ;

    @FXML
    private TextField tfSearchUser;

    @FXML
    private TextField tfSelectedServ;

    @FXML
    private TextField tfSelectedUser;

    @FXML
    void changeScreenToServ(ActionEvent event) {
        hudServ.setVisible(true);
        hudUser.setVisible(false);
    }

    @FXML
    void changeScreenToUser(ActionEvent event) {
        hudServ.setVisible(false);
        hudUser.setVisible(true);
    }

    @FXML
    void openEditScreenServ(ActionEvent event) {

    }

    @FXML
    void openRegisterScreenServ(ActionEvent event) {

    }

    @FXML
    void openRegisterScreenUser(ActionEvent event) {

    }

    @FXML
    void removeServ(ActionEvent event) {

    }

    @FXML
    void returnPrincipalScreen(ActionEvent event) {
        App.popScreen();
    }

    @FXML
    void searchInTableServ(ActionEvent event) {

    }

    @FXML
    void searchInTableUser(ActionEvent event) {

    }

    
    @FXML
    void selectServ(MouseEvent event) {

    }

    @FXML
    void selectUser(MouseEvent event) {

    }

}
