/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.p4app.service;

import com.com470.p4app.model.MinimoMaximo;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author CHELO
 */
@RunWith(Parameterized.class)
public class BuscarMinimoMaximoTest {

    private static final List<Integer> miLista1 = Arrays.asList(3, 1, 4);
    private static final List<Integer> mires1 = Arrays.asList(1, 4);

    private static final List<Integer> miLista2 = Arrays.asList(5, 8, 1, 7);
    private static final List<Integer> mires2 = Arrays.asList(1, 8);

    private static final List<Integer> miLista3 = Arrays.asList(9, 8, 7);
    private static final List<Integer> mires3 = Arrays.asList(7, 9);

    public BuscarMinimoMaximoTest() {
    }

    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {miLista1, mires1}, {miLista2, mires2}, {miLista3, mires3}
        });
    }
    @Parameterized.Parameter(0)
    public List<Integer> palabra;
    @Parameterized.Parameter(1)
    public List<Integer> res;

    BuscarMinimoMaximo min = new BuscarMinimoMaximo();

    @Test
    public void testBuscaPalindromo() {
        //    Realizamos el test al metodo buscarminimoMaximo

        MinimoMaximo resultado = min.buscaMinimoMaximo(palabra);
        MinimoMaximo esperado = new MinimoMaximo(res.get(0), res.get(1));

        assertThat(resultado.toString(), Matchers.equalTo(esperado.toString()));

    }
}
