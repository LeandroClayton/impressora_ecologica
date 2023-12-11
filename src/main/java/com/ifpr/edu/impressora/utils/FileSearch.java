package com.ifpr.edu.impressora.utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import com.github.hugoperlin.results.Resultado;

import javafx.stage.FileChooser;

public class FileSearch {
    
    public static Resultado selectFile() {
        FileChooser chooser = new FileChooser();
        chooser.setInitialDirectory(Paths.get(System.getProperty("user.dir")).toFile());
        File file = chooser.showOpenDialog(null);
        if (file != null) {
            Path path = file.toPath();
            
            return Resultado.sucesso("Realizado Com sucesso", path);
        }
        return Resultado.erro("Nenhum arquivo selecionado");
    }
}
