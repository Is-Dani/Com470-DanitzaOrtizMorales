/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.OperationModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DANI
 */
public class CalculateSimpleTest {

    CalculateSimple calc = new CalculateSimple();

    public CalculateSimpleTest() {
    }

    /**
     * Test of add method, of class CalculateSimple.
     */
    @Test
    public void testAdd() {
        OperationModel operationModel = new OperationModel(5, 4);
        int resultadoEsperado = 9;
        int resultadoDevuelto = calc.add(operationModel);
        assertEquals(resultadoEsperado, resultadoDevuelto);
    }

    @Test
    public void testResta() {
        OperationModel operationModel = new OperationModel(10, 2);
        int resultadoEsperado = 8;
        int resultadoDevuelto = calc.subtract(operationModel);
        assertEquals(resultadoEsperado, resultadoDevuelto);
        assertNotEquals(10, resultadoDevuelto);
    }

    @Test
    public void testMultiplicacion() {
        OperationModel operationModel = new OperationModel(3, 4);
        int resultadoEsperado = 12;
        int resultadoDevuelto = calc.multiply(operationModel);
        assertEquals(resultadoEsperado, resultadoDevuelto);
    }

    @Test
    public void testDivision() {
        OperationModel operationModel = new OperationModel(8, 2);
        int resultadoEsperado = 4;
        int resultadoDevuelto = (int) calc.divide(operationModel);
        assertEquals(resultadoEsperado, resultadoDevuelto);
    }

    @Test
    public void testFactorial() {
        OperationModel operationModel = new OperationModel(5);
        int resultadoEsperado = 120;
        int resultadoDevuelto = calc.factorial(operationModel);
        assertEquals(resultadoEsperado, resultadoDevuelto);
    }

    @Test
    public void testFibonacci() {
        OperationModel operationModel = new OperationModel(3);
        int resultadoEsperado = 2;
        int resultadoDevuelto = calc.fibonacci(operationModel);
        assertEquals(resultadoEsperado, resultadoDevuelto);
    }

    @Test
    public void testPotencia() {
        OperationModel operationModel = new OperationModel(3);
        int resultadoEsperado = 9;
        int resultadoDevuelto = calc.power(operationModel);
        assertEquals(resultadoEsperado, resultadoDevuelto);
    }

    @Test
    public void testRaiz() {
        OperationModel operationModel = new OperationModel(9);
        int resultadoEsperado = 3;
        int resultadoDevuelto = (int) calc.sqrt(operationModel);
        assertEquals(resultadoEsperado, resultadoDevuelto);
    }

    @Test
    public void testLimpiarSimple() {
        OperationModel operationModel = new OperationModel(10, 2);
        OperationModel resultadoDevuelto = calc.clearSimple(operationModel);
        int resultadoEsperado1 = 0;
        int resultadoEsperado2 = 0;
        assertEquals(resultadoEsperado1, resultadoDevuelto.getA());
        assertEquals(resultadoEsperado2, resultadoDevuelto.getB());

    }

    @Test
    public void testLimpiarAvanzada() {
        OperationModel operationModel = new OperationModel(10);
        OperationModel resultadoDevuelto = calc.clearAdvanced(operationModel);
        int resultadoEsperado = 0;
        assertEquals(resultadoEsperado, resultadoDevuelto.getC());
    }

    /**
     * Test of subtract method, of class CalculateSimple.
     */
}
