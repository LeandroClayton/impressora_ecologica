package com.ifpr.edu.impressora.model.entities;

public class Usuario extends Pessoa {

    private String email;
    private int numFichas;
    private int idUsuario;


    public Usuario(int idPessoa, String nome, String cpf, String senha, String email, int numFichas, int idUsuario) {
        super(idPessoa, nome, cpf, senha);
        this.email = email;
        this.numFichas = numFichas;
        this.idUsuario = idUsuario;
    }


    public Usuario(String nome, String cpf, String senha, String email, int numFichas, int idUsuario) {
        super(nome, cpf, senha);
        this.email = email;
        this.numFichas = numFichas;
        this.idUsuario = idUsuario;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public int getNumFichas() {
        return numFichas;
    }


    public void setNumFichas(int numFichas) {
        this.numFichas = numFichas;
    }


    public int getIdUsuario() {
        return idUsuario;
    }


    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    
    

}
