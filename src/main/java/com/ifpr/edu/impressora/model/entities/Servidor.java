package com.ifpr.edu.impressora.model.entities;

public class Servidor extends Pessoa{
    private String siape;

    public Servidor(int idPessoa, String nome, String cpf, String senha, String siape) {
        super(idPessoa, nome, cpf, senha);
        this.siape = siape;
    }

    public Servidor(String nome, String cpf, String senha, String siape) {
        super(nome, cpf, senha);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    
}
