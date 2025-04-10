package org.example;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private TipoCombustivel tipoCombustivel;

    public Veiculo(String marca, String modelo, int ano, TipoCombustivel tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Veiculo(){

    }

    public abstract double CalcularTarifaDiaria();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano){
        try{
            this.ano = new ValidarAno().ValidarAnoEx(ano);
        } catch (AnoInvalidoException e) {
            System.out.println("Ano invalido! Defina um ano entre 1990 e o atual!");;
        }
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
