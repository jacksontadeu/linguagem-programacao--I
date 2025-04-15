package org.example.model;

public class Casa {

    private String proprietario;
    private String cor;
    private int qtdeQuartos;
    private double area;
    private Double valor;
   
    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }
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
    private Regiao regiao;

    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Regiao getRegiao() {
        return regiao;
    }
    public StringBuilder detalharCasa(){
        StringBuilder sb = new StringBuilder();
        sb.append("Proprietario: "+proprietario + "\n")
        .append("cor: "+ cor + "\n")
        .append("Area: "+ area + " m² \n")
        .append("Dormitórios: "+ qtdeQuartos + " dormitórios \n ")
        .append("Valor de Venda: R$ "+ valor + "\n")
        .append(regiao);
        
        return sb;
    }
    public void calcularValorVenda(){
        switch(this.regiao){
            case SUL:
             this.valor = this.area *2000;
            break;
            
            case LESTE:
            this.valor = this.area *1500;
            break;
            
            case NORTE:
            this.valor = area *1000;
            break;
        }
       
       
    }

    
}
