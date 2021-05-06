/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

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

public class TrianguloTest {

    public TrianguloTest() {
    }

    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1, 1, 1, "Equilatero"}, {3, 3, 4, "Isoceles"}, {5, 3, 6, "Escaleno"}
        });
    }

    @Parameterized.Parameter(0)
    public int v1;
    @Parameterized.Parameter(1)
    public int v2;
    @Parameterized.Parameter(2)
    public int v3;

    @Parameterized.Parameter(3)
    public String esperado;
    
    Triangulo triangulo = new Triangulo();

    @Before

    public void setUp() {
    }

    /**
     * Test of tipoTriangulo method, of class Triangulo.
     */
    @Test
    public void testTipoTriangulo() {
        String respuesta = triangulo.tipoTriangulo(v1, v2, v3);
        assertEquals(esperado, respuesta);
    }

}
