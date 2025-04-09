package org.example.model;

public class Carro {

    private String nome;
    private String cor;
    private int anoFabricacao;
    private int velocidade;
    private boolean estaLigado = false;

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean ligarCarro(){
       if (this.estaLigado== false){
           return false;
       }else{
           return true;
       }

    }
    public int acelerarCarro(){
        return this.velocidade +=10;
    }
    public int frearCarro(){
        return  this.velocidade -=10;

    }
}
