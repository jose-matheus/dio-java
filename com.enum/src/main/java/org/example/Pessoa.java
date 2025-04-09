package org.example;

import java.util.Date;

public class Pessoa {
    private String nome;
    private int idade;
    private Date dataNascimento;
    private EstadosBrasileiros uf;

    public Pessoa(String nome, int idade, Date dataNascimento, EstadosBrasileiros uf) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.uf = uf;
    }

    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EstadosBrasileiros getUf() {
        return uf;
    }

    public void setUf(EstadosBrasileiros uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento=" + dataNascimento +
                ", uf=" + uf +
                '}';
    }
}
