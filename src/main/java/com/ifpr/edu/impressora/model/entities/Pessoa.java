package com.ifpr.edu.impressora.model.entities;

abstract class Pessoa {
    private int idPessoa;
    private String nome;
    private String cpf;
    private String senha;


    public Pessoa(int idPessoa, String nome, String cpf, String senha) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }


    public Pessoa(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public int getIdPessoa() {
        return idPessoa;
    }

    
}
