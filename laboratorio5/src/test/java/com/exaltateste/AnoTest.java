package com.exaltateste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnoTest {

    public AnoTest() {

    }

    Ano objAno = new Ano();

    @Test
    public void testSomeMethod() {
        assertEquals("Data válida", objAno.validarAno(2000));
    }
}
