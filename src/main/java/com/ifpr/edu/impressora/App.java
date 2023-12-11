package com.ifpr.edu.impressora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.ifpr.edu.impressora.controllers.PrincipalServer;
import com.ifpr.edu.impressora.controllers.PrincipalUser;
import com.ifpr.edu.impressora.controllers.TelaDeLogin;
import com.ifpr.edu.impressora.controllers.TelaDePessoas;

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
        return "LOGIN";
    }

    @Override
    public void registrarTelas() {
        registraTela("LOGIN", new ScreenRegistryFXML(App.class, 
            "LoginScreen.fxml", 
                o -> new TelaDeLogin()));
        registraTela("PRINCIPAL_SERVER", new ScreenRegistryFXML(App.class, 
            "ServPrincipalScreen.fxml", 
                o -> new PrincipalServer()));

        registraTela("PRINCIPAL_USER", new ScreenRegistryFXML(App.class, 
            "UserPrincipalScreen.fxml", 
                o -> new PrincipalUser()));

        registraTela("TELA_PESSOAS", new ScreenRegistryFXML(App.class, 
            "PersonListScreen.fxml", 
                o -> new TelaDePessoas()));        
    }

}