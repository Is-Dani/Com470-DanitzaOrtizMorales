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

public class PalindromoTest {
    
    public PalindromoTest() {
    }
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {"casa", false},{"oso",true },{"vaca", false},{"somos", true}
        });
    }
    
    @Parameterized.Parameter(0)
    public String v1;
    
    @Parameterized.Parameter(1)
    public boolean esperado;
    
    @Before
    public void setUp() {
    }
    Palindromo palindromo = new Palindromo();

    /**
     * Test of buscaPalindromo method, of class Palindromo.
     */
    @Test
    public void testBuscaPalindromo() {
        boolean respuesta = palindromo.buscaPalindromo(v1);
        assertEquals(esperado, respuesta);
    }
    
}
