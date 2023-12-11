package com.ifpr.edu.impressora.model.entities;

public class Impressao {
    private int idImpressao;
    private Usuario usuario;
    private Servidor servidor;
    private String dataImpressao;
    private int custo;
    private int numFolhas;




    
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Servidor getServidor() {
        return servidor;
    }
    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }
    public String getDataImpressao() {
        return dataImpressao;
    }
    public void setDataImpressao(String dataImpressao) {
        this.dataImpressao = dataImpressao;
    }
    public int getCusto() {
        return custo;
    }
    public void setCusto(int custo) {
        this.custo = custo;
    }
    public int getNumFolhas() {
        return numFolhas;
    }
    public void setNumFolhas(int numFolhas) {
        this.numFolhas = numFolhas;
    }
    public int getIdImpressao() {
        return idImpressao;
    }

    
}
