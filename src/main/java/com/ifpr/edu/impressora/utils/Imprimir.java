package com.ifpr.edu.impressora.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

import com.github.hugoperlin.results.Resultado;

public class Imprimir {

    static private PrintService [] printServices =  PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.AUTOSENSE,null);
    static private PrintService impressoraPadrao = PrintServiceLookup.lookupDefaultPrintService();
    static private DocFlavor docFlavor =  DocFlavor.INPUT_STREAM.AUTOSENSE;
    static private HashDocAttributeSet hashdoc = new HashDocAttributeSet();

    public static Resultado realizarImpressao(Path path) {
        File file = path.toFile();
        FileInputStream fs;
        try {
            fs = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            return Resultado.erro(e.getMessage());
        }
        Doc doc = new SimpleDoc(fs, docFlavor, hashdoc);
        if (printServices.length > 0) {
            PrintRequestAttributeSet pAttributeSet = new HashPrintRequestAttributeSet();
            PrintService printService = ServiceUI.printDialog(  null, 600, 400, printServices, 
                                                                impressoraPadrao, docFlavor, pAttributeSet);
            if (printService != null) {
                DocPrintJob docPrintJob = printService.createPrintJob();
                try {
                    docPrintJob.print(doc, pAttributeSet);
                    return Resultado.sucesso( "Arquivo enviado para impressão", docPrintJob);
                } catch (PrintException e) {
                    Resultado.erro(e.getMessage());
                }
            } else {
                return Resultado.erro("Operacao cancelada");
            }
        }

        return Resultado.erro("Impressora nao encontrada");
    }
}
