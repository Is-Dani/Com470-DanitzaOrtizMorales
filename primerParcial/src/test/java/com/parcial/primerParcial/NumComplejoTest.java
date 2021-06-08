/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial.primerParcial;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author DANI
 */
@RunWith(Parameterized.class)
public class NumComplejoTest {

    String res;

    public NumComplejoTest() {
    }

    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {2, 4, 1, 5}, {1, 3, 5, 2}, {5, 1, 5, 2},{2, 4, 1, 5}, {1, 3, 5, 2}, {5, 1, 5, 2},
            {2, 0, 3, 6}, {1, 3, 2, 2}, {5, 10, 500, 2},{105, 1, 52, 202}
        });
    }

    @Parameterized.Parameter(0)
    public int a;
    @Parameterized.Parameter(1)
    public int b;
    @Parameterized.Parameter(2)
    public int c;
    @Parameterized.Parameter(3)
    public int d;

    @Test
    public void testSumar() {

        NumComplejo complejo = new NumComplejo(a, b);
        NumComplejo complejo2 = new NumComplejo(c, d);
        String esperado = String.valueOf(a + c) + "+" + String.valueOf(b + d);
        NumComplejo resultado = complejo.sumar(complejo2);
        res = resultado.getParteReal() + "+" + resultado.getParteImaginaria();
        assertEquals(esperado, res);
    }

    @Test
    public void testRestar() {
        NumComplejo complejo = new NumComplejo(a, b);
        NumComplejo complejo2 = new NumComplejo(c, d);
        String esperado = String.valueOf(a - c) + "+" + String.valueOf(b - d);
        NumComplejo resultado = complejo.restar(complejo2);
        res = resultado.getParteReal() + "+" + resultado.getParteImaginaria();
        assertEquals(esperado, res);
    }

}
