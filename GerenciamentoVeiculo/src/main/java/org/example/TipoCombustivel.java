package org.example;

public enum TipoCombustivel {
    GASOLINA ("Gasolina"),
    DIESEL ("Diesel"),
    ELETRICO ("Eletrico"),
    FLEX ("Flex");

    private String tipoCombustivel;

    public String getTipoCombustivel(){
        return tipoCombustivel;
    }

    public String getTipoCombustivelToUpperCase(){
        return tipoCombustivel.toUpperCase();
    }

    TipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
