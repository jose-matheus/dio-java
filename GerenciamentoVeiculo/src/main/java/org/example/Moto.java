package org.example;

public class Moto extends Veiculo {

    public Moto(String marca, String modelo, int ano, TipoCombustivel tipoCombustivel) {
        super(marca, modelo, ano, tipoCombustivel);
    }

    public Moto() {
    }

    @Override
    public double CalcularTarifaDiaria() {
        return 400.0;
    }
}
