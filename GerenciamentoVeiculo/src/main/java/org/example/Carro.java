package org.example;

public class Carro extends Veiculo{

    private double diariaSeguro;

    public Carro(String marca, String modelo, int ano, TipoCombustivel tipoCombustivel, double diariaSeguro) {
        super(marca, modelo, ano, tipoCombustivel);
        this.diariaSeguro = diariaSeguro;
    }

    public Carro(double diariaSeguro) {
        this.diariaSeguro = diariaSeguro;
    }

    public double getDiariaSeguro() {
        return diariaSeguro;
    }

    public void setDiariaSeguro(double diariaSeguro) {
        this.diariaSeguro = diariaSeguro;
    }

    @Override
    public double CalcularTarifaDiaria() {
        return getDiariaSeguro() + 400.0;
    }
}
