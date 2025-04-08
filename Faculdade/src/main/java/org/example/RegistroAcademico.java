package org.example;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class RegistroAcademico {
    private String nomeDoAluno;
    private int numeroDaMatricula;
    private Date dataDeNascimento;
    private boolean eBolsista = false;
    private int anoDeMatricula;
    private double mensalidade;

    public RegistroAcademico(){

    }

    public RegistroAcademico(double mensalidade, int anoDeMatricula, boolean eBolsista, Date dataDeNascimento, int numeroDaMatricula, String nomeDoAluno) {
        this.mensalidade = mensalidade;
        this.anoDeMatricula = anoDeMatricula;
        this.eBolsista = eBolsista;
        this.dataDeNascimento = dataDeNascimento;
        this.numeroDaMatricula = numeroDaMatricula;
        this.nomeDoAluno = nomeDoAluno;
    }

    public void inicializaRegistro(String nome, int matricula, String data, boolean bolsa, int ano){

        setNomeDoAluno(nome);
        setNumeroDaMatricula(matricula);
        try {
            setDataDeNascimento(data);
        } catch (ParseException e) {
            System.err.println("Data de nascimento não foi convertida para o tipo data");
        }
        seteBolsista(bolsa);
        setAnoDeMatricula(ano);

    }

    public void calculaMensalidade(double mensalidade){
        if(iseBolsista()){
            double nova  = mensalidade / 2;
            setMensalidade(nova);
        }
        setMensalidade(mensalidade);
    }

    @Override
    public String toString() {
        return "RegistroAcademico{" +
                "nomeDoAluno='" + nomeDoAluno + '\'' +
                ", numeroDaMatricula=" + numeroDaMatricula +
                ", dataDeNascimento=" + dataDeNascimento +
                ", eBolsista=" + eBolsista +
                ", anoDeMatricula=" + anoDeMatricula +
                ", mensalidade=" + mensalidade +
                '}';
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public int getNumeroDaMatricula() {
        return numeroDaMatricula;
    }

    public void setNumeroDaMatricula(int numeroDaMatricula) {
        this.numeroDaMatricula = numeroDaMatricula;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = formatter.parse(dataDeNascimento);
        } catch (ParseException e) {
            System.err.println("Data de nascimento não foi convertida para o tipo data");
        }
        this.dataDeNascimento = date;
    }

    public boolean iseBolsista() {
        return eBolsista;
    }

    public void seteBolsista(boolean eBolsista) {
        this.eBolsista = eBolsista;
    }

    public int getAnoDeMatricula() {
        return anoDeMatricula;
    }

    public void setAnoDeMatricula(int anoDeMatricula) {
        this.anoDeMatricula = anoDeMatricula;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
