package com.exaltateste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlunoTest {

    public AlunoTest() {

    }

    Aluno objAluno = new Aluno();

    @Test
    public void testNotaValida() {
        // CT02
        assertEquals("Nota válida", objAluno.validarNota(6.0));

        // CT05
        assertEquals("Nota válida", objAluno.validarNota(0.0));

        // CT06
        assertEquals("Nota válida", objAluno.validarNota(1.0));

        // CT07
        assertEquals("Nota válida", objAluno.validarNota(9.0));

        // CT08
        assertEquals("Nota válida", objAluno.validarNota(10.0));
    }

    @Test
    public void testNotaInvalida() {
        // CT01
        assertEquals("Nota inválida", objAluno.validarNota(-5.0));

        // CT03
        assertEquals("Nota inválida", objAluno.validarNota(15.0));

        // CT04
        assertEquals("Nota inválida", objAluno.validarNota(-1.0));

        // CT09
        assertEquals("Nota inválida", objAluno.validarNota(11.0));

    }
}
