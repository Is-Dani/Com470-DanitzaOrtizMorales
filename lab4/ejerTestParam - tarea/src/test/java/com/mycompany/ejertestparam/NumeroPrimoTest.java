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

/**
 *
 * @author DANI
 */

@RunWith(Parameterized.class)
public class NumeroPrimoTest {
    
    public NumeroPrimoTest() {
    }
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {3, true},{10,false},{19, true}, {2, true}, {8, false}
        });
    }
    
    @Parameter(0)
    public static int parametro0;
    
     @Parameter(1)
    public static boolean esperado;
    
     NumeroPrimo numP = new NumeroPrimo();
    
    @Before
    public void setUp() {
    }

    /**
     * Test of validate method, of class NumeroPrimo.
     */
    @Test
    public void testPrimo() {
        Boolean respuesta = numP.validate(parametro0);
        assertEquals(esperado, respuesta);
        
    }
    
}
