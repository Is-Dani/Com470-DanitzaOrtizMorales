/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p4app.service;

import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author CHELO
 */
@RunWith(Parameterized.class)
public class PalindromoTest {
     
    public PalindromoTest() {
    }
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {"somos", true},{"amor", false},{"oso", true}
        });
    } 
    @Parameter(0)
    public String palabra;
    @Parameter(1)
    public boolean res;
    
    Palindromo palindromo = new Palindromo();
    @Test
    public void testBuscaPalindromo() {
        boolean resultado = palindromo.buscaPalindromo(palabra);
        
        assertThat(resultado, is(res));
        
    }
    
}
