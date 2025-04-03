package org.example.model;

public class Computador {

    private String nome;
    private String modelo;
    private String processador;
    private boolean isLigado = false;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public String ligarPc(){
        if(isLigado == false){
            this.isLigado = true;
            return "Pc ligado";
        }
        else {
            return "Pc jã está ligado";
        }
    }
    public String desligarPc(){
        if(isLigado == false){

            return "Pc já desligado";
        }
        else {
            this.isLigado = false;

            return "Desligando";
        }
    }
    public void navegarInternet(){
        System.out.println("Abra o chrome e boa navegação!!!");
    }
}
