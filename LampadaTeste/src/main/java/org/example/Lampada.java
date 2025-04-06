package org.example;

public class Lampada {
    private String led;
    private boolean fluorescente;
    private int voltagem;
    private String cor;
    private String marca;
    private double preco;
    private int potencia;
    private boolean status;

    public Lampada(String led, boolean fluorescente, int voltagem, String cor, String marca, double preco, int potencia, boolean status) {
        this.led = led;
        this.fluorescente = fluorescente;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status = status;
    }

    public Lampada(){

    }

    public void acender(){
        this.setStatus(true);
    }

    public void apagar(){
        this.setStatus(false);
    }

    public String getLed() {
        return led;
    }

    public void setLed(String led) {
        this.led = led;
    }

    public boolean isFluorescente() {
        return fluorescente;
    }

    public void setFluorescente(boolean fluorescente) {
        this.fluorescente = fluorescente;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreço(double preco) {
        this.preco = preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "led='" + led + '\'' +
                ", fluorescente=" + fluorescente +
                ", voltagem=" + voltagem +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", preço=" + preco +
                ", potencia=" + potencia +
                ", status=" + status +
                '}';
    }
}
