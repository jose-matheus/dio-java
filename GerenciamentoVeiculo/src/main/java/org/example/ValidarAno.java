package org.example;

import java.time.LocalDate;

public class ValidarAno{

    public int ValidarAnoEx(int ano) throws AnoInvalidoException {
        if (ano < 1990 || ano > LocalDate.now().getYear()) {
            throw new AnoInvalidoException();
        }
        return ano;
    }

}
