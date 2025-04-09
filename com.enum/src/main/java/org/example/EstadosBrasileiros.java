package org.example;

public enum EstadosBrasileiros {
    SAO_PAULO("SP", "São Paulo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI("PI", "Piauí"),
    MARANHAO("MA", "Maranhão"),
    CEARA("CE", "Ceara");

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeToUpperCase(){
        return nome.toUpperCase();
    }
}
