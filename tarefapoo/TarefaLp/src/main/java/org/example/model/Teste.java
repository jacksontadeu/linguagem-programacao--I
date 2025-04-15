package org.example.model;

public class Teste {
    public static void main(String[] args) {
        
        ContaBancaria c = new ContaBancaria();
        c.setTitular("Jackson");
        c.setNumero(123);
        c.setSaldo(1200.00);


        System.out.println(c);
    }

}
