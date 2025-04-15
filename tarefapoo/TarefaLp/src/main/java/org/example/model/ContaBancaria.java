package org.example.model;

public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;
    private double valor;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double valor){
         this.saldo += valor;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titular: " + titular+  "\n")
                .append("Número da Conta: " + numero + "\n")
                .append("Saldo da Conta: " + saldo);

        return String.valueOf(sb);
    }
}
