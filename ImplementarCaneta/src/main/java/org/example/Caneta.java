package org.example;

public class Caneta {
    private String marca;
    private String cor;
    private int tamanho;

    public Caneta(int tamanho, String cor, String marca) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
    }

    public Caneta(){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
