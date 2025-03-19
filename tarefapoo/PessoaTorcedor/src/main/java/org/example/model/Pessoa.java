package org.example.model;

public class Pessoa {

    private String nome;

    private int idade;

    private String time;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String comemorarTitulo(){

        return "Vai " + this.time;


    }
}
