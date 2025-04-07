package org.example;

public class ValidarAgencia {

    public String ValidarAgenciaEx(String agencia) throws AgenciaException{
        if(agencia.length() != 4){
            throw new AgenciaException();
        }
        return agencia;
    }
}
