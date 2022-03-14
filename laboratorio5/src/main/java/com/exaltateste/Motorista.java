package com.exaltateste;

public class Motorista {
    public String validarIdade(int idade) {
        String resultadoValidacao = "";

        if (idade < 50) {
            resultadoValidacao = "10 ANOS";
        } else if (idade < 70) {
            resultadoValidacao = "5 ANOS";
        } else {
            resultadoValidacao = "3 ANOS";
        }

        return resultadoValidacao;
    }
}
