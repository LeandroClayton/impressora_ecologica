package com.ifpr.edu.impressora.model.entities;

public class Pesagem {
    private int idPesagem;
    private String dataPesagem;
    private Usuario usuario;
    private Servidor servidor;
    private double peso;
    private String tipoResiduo;


    public Pesagem(String dataPesagem, Usuario usuario, Servidor servidor, double peso, String tipoResiduo) {
        this.dataPesagem = dataPesagem;
        this.usuario = usuario;
        this.servidor = servidor;
        this.peso = peso;
        this.tipoResiduo = tipoResiduo;
    }

    public Pesagem(int idPesagem, String dataPesagem, Usuario usuario, Servidor servidor, double peso,
            String tipoResiduo) {
        this.idPesagem = idPesagem;
        this.dataPesagem = dataPesagem;
        this.usuario = usuario;
        this.servidor = servidor;
        this.peso = peso;
        this.tipoResiduo = tipoResiduo;
    }

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

    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public int getIdPesagem() {
        return idPesagem;
    }


    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public String getDataPesagem() {
        return dataPesagem;
    }
    public void setDataPesagem(String dataPesagem) {
        this.dataPesagem = dataPesagem;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }


    
}
