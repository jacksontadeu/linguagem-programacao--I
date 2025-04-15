package org.example.model;

public class Teste {
    public static void main(String[] args) {
        
        Casa c = new Casa();
        c.setProprietario("Jackson");
        c.setRegiao(Regiao.NORTE);
        c.setArea(100);
        c.calcularValorVenda();
        
        System.out.println(c);


        System.out.println(c.detalharCasa());
    }

}
