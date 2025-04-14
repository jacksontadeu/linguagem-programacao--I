package org.example.model;

public class Casa {

    private String proprietario;
    private String cor;
    private int qtdeQuartos;
    private double area;
    private Double valor;

    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    

    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getQtdeQuartos() {
        return qtdeQuartos;
    }
    public void setQtdeQuartos(int qtdeQuartos) {
        this.qtdeQuartos = qtdeQuartos;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public StringBuilder detalharCasa(){
        StringBuilder sb = new StringBuilder();
        sb.append("Proprietario: "+proprietario + "\n")
        .append("cor: "+ cor + "\n")
        .append("Area: "+ area + " m² \n")
        .append("Dormitórios: "+ qtdeQuartos + " dormitórios \n ")
        .append("Valor de Venda: R$ "+ valor);
        
        return sb;
    }

    
}
