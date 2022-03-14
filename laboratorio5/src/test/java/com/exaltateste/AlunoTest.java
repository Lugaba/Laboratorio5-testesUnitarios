package com.exaltateste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlunoTest {

    public AlunoTest() {

    }

    Aluno objAluno = new Aluno();

    @Test
    public void testSomeMethod() {
        assertEquals("Nota válida", objAluno.validarNota(8.5));
    }
}
