package org.example;

public class FuncionarioComum extends Funcionario{


    public FuncionarioComum(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    public FuncionarioComum(){
        super();
    }

    @Override
    public double getSalarioTotal() {
        return getSalarioBase();
    }
}
