package com.exaltateste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MotoristaTest {

    public MotoristaTest() {

    }

    Motorista objMotorista = new Motorista();

    @Test
    public void testSomeMethod() {
        assertEquals("10 ANOS", objMotorista.validarIdade(20));
    }
}
