package com.exaltateste;

public class Aluno {
    public String validarNota(Double nota) {
        String resultadoValidacao = "";

        if (nota >= 0 && nota <= 10) {
            resultadoValidacao = "Nota válida";
        } else {
            resultadoValidacao = "Nota inválida";
        }

        return resultadoValidacao;
    }
}
