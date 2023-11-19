package com.ifpr.edu.impressora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.ifpr.edu.impressora.controllers.Principal;

import io.github.hugoperlin.navigatorfx.BaseAppNavigator;
import io.github.hugoperlin.navigatorfx.ScreenRegistry;
import io.github.hugoperlin.navigatorfx.ScreenRegistryFXML;

/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {

    private static Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    @Override
    public String getAppTitle() {
        return "Impressora meu pau na sua oreia";
    }

    @Override
    public String getHome() {
        return "PRINCIPAL";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryFXML(App.class, 
            "NaoSei.fxml", 
                o -> new Principal()));
        // registraTela("TELA_INICIAL", new ScreenRegistryFXML(App.class, 
        //     "principal.fxml", 
        //         o -> new Principal()));

        // registraTela("TELA_FICHAS", new ScreenRegistryFXML(App.class, 
        //     "principal.fxml", 
        //         o -> new Principal()));

        // registraTela("TELA_IMPRESSOES", new ScreenRegistryFXML(App.class, 
        //     "principal.fxml", 
        //         o -> new Principal()));        
    }

}