package com.exaltateste;

public class Ano {
    public String validarAno(int ano) {
        String resultadoValidacao = "";

        if (ano >= 1900 && ano <= 2022) {
            resultadoValidacao = "Data válida";
        } else {
            resultadoValidacao = "Data inválida";
        }

        return resultadoValidacao;
    }
}
