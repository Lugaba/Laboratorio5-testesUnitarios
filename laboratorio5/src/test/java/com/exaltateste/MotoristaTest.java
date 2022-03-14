package com.exaltateste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MotoristaTest {

    public MotoristaTest() {

    }

    Motorista objMotorista = new Motorista();

    @Test
    public void testRenovacao10Anos() {
        // CT01
        assertEquals("10 ANOS", objMotorista.validarIdade(20));

        // CT04
        assertEquals("10 ANOS", objMotorista.validarIdade(49));
    }

    @Test
    public void testRenovacao5Anos() {
        // CT02
        assertEquals("5 ANOS", objMotorista.validarIdade(60));

        // CT05
        assertEquals("5 ANOS", objMotorista.validarIdade(50));

        // CT06
        assertEquals("5 ANOS", objMotorista.validarIdade(51));

        // CT07
        assertEquals("5 ANOS", objMotorista.validarIdade(69));
    }

    @Test
    public void testRenovacao3Anos() {
        // CT03
        assertEquals("3 ANOS", objMotorista.validarIdade(80));

        // CT08
        assertEquals("3 ANOS", objMotorista.validarIdade(70));

        // CT09
        assertEquals("3 ANOS", objMotorista.validarIdade(71));
    }
}
