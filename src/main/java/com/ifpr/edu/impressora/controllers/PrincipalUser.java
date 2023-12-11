package com.ifpr.edu.impressora.controllers;

import com.ifpr.edu.impressora.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PrincipalUser {

    @FXML
    private TableColumn<?, ?> clmDateWeighing;

    @FXML
    private TableColumn<?, ?> clmResidue;

    @FXML
    private TableColumn<?, ?> clmWeight;

    @FXML
    private Label lbNomePessoa;

    @FXML
    private Label lbNumFichas;

    @FXML
    private TableView<?> tbWeighing;

    @FXML
    void realizeLogoff(ActionEvent event) {
        App.popScreen();
    }

}
