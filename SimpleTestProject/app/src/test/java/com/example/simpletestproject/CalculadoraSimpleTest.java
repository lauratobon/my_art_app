package com.example.simpletestproject;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraSimpleTest  {
    CalculadoraSimple calulador = new CalculadoraSimple();
    @Test
    public void addition_isCorrect() {
        assertEquals(4, calulador.add(2,2));
    }

}