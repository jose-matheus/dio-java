package org.example;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase){
        this.cpf = cpf;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public Funcionario(){}

    public abstract double getSalarioTotal();

    public double getSalarioBase(){
        return salarioBase;
    }

    public void reajustarSalario(double percentual){
        this.salarioBase += this.salarioBase * (percentual / 100);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
