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
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author DANI
 */

@RunWith(Parameterized.class)
public class FibonacciTest {
    
    public FibonacciTest() {
    }
    
    
    @Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1, "0,1,1"},{3,"0,1,1,2,3" },{5, "0,1,1,2,3,5"}
        });
    }
    
    @Parameter(0)
    public int v1;
    
    @Parameter(1)
    public String esperado;
    
    Fibonacci fibo = new Fibonacci();
    
    @Before
    public void setUp() {
    }

    /**
     * Test of bibonacci method, of class Fibonacci.
     */
    @Test
    public void testBibonacci() {
        String respuesta = fibo.bibonacci(v1);
        assertEquals(esperado, respuesta);
    }
    
}
