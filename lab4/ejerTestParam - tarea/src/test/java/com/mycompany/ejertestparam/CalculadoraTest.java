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
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1,3}, {3,6}, {5,3},{3,0}
        });
    }
    
    @Parameterized.Parameter(0)
    public int a;
    
    @Parameterized.Parameter(1)
    public int b;
    
    
    
    Calculadora cal = new Calculadora();
    
    @Before
    public void setUp() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        int esperado = a + b; 
        int respuesta = cal.suma(a,b); 
        assertEquals(esperado, respuesta);
        
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        
        int esperado = a - b; 
        int respuesta = cal.resta(a,b); 
        assertEquals(esperado, respuesta);
    }

    /**
     * Test of multimplicacion method, of class Calculadora.
     */
    @Test
    public void testMultimplicacion() {
        
        int esperado = a * b; 
        int respuesta = cal.multimplicacion(a,b); 
        assertEquals(esperado, respuesta);
    }

    /**
     * Test of division method, of class Calculadora.
     */
    
    
    
  
    @Test
	public void testDivision() {
		try {
			int resultado =cal.division(a, b);
			
			assertEquals(a/b, resultado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			assertEquals("No se puede dividir entre 0", e.getMessage());
		}
        }
}
