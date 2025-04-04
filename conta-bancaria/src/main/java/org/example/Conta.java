package org.example;

public class Conta {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta(double saldo, String nomeCliente, String agencia, int numero) {
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero +
                ", e seu saldo " + saldo +
                " já está disponível para saque.";
    }

}
