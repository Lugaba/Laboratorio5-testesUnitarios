package com.exaltateste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnoTest {

    public AnoTest() {

    }

    Ano objAno = new Ano();

    @Test
    public void testDataValida() {
        // CT02
        assertEquals("Data válida", objAno.validarAno(2000));

        // CT05
        assertEquals("Data válida", objAno.validarAno(1900));

        // CT06
        assertEquals("Data válida", objAno.validarAno(1901));

        // CT07
        assertEquals("Data válida", objAno.validarAno(2021));

        // CT08
        assertEquals("Data válida", objAno.validarAno(2022));

    }

    @Test
    public void testDataInvalida() {
        // CT01
        assertEquals("Data inválida", objAno.validarAno(1800));

        // CT02
        assertEquals("Data inválida", objAno.validarAno(2100));

        // CT04
        assertEquals("Data inválida", objAno.validarAno(1899));

        // CT09
        assertEquals("Data inválida", objAno.validarAno(2023));

    }
}
