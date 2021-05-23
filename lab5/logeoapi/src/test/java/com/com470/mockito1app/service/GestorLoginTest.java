/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.mockito1app.service;

import com.com470.mockito1app.controller.ExcepcionCuentaEnUso;
import com.com470.mockito1app.controller.ExcepcionUsuarioDesconocido;
import com.com470.mockito1app.controller.ICuenta;
import com.com470.mockito1app.controller.IRepositorioCuentas;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author DANI
 */
public class GestorLoginTest {

    public GestorLoginTest() {
    }
    @Mock
    ICuenta cuenta;

    @Mock
    IRepositorioCuentas repoCuentas;

    @InjectMocks
    GestorLogin gestorLogin;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    //1
    @Test
    public void inicializarTest() {
        Mockito.when(repoCuentas.buscar("pepe")).thenReturn(cuenta);
    }

    //2
    @Test
    public void testAccesoConcedidoAlaPrimera() {

    }

    //4    
    @Test(expected = ExcepcionUsuarioDesconocido.class)
    public void testUsuarioIncorrecto() {
        when(repoCuentas.buscar("bartolo")).thenReturn(null);
        gestorLogin.acceder("bartolo", "1234");
    }

    //7
    @Test
    public void testAccederTrasUnIntento() {
        Mockito.when(repoCuentas.buscar("pepe")).thenReturn(cuenta);
        when(cuenta.claveCorrecta("1234")).thenReturn(true);
        gestorLogin.acceder("pepe", "1234");
    }

    //8
    @Test
    public void testBloquearTrasCuatroIntentos() {
        Mockito.when(repoCuentas.buscar("pepe")).thenReturn(cuenta);
        when(cuenta.claveCorrecta("1234")).thenReturn(false);
        gestorLogin.acceder("pepe", "1234");
        gestorLogin.acceder("pepe", "1234");
        gestorLogin.acceder("pepe", "1234");
        gestorLogin.acceder("pepe", "1234");
    }

    //9
    @Test
    public void testAccesoDenegadoCuentaBloqueada() {
        Mockito.when(repoCuentas.buscar("pepe")).thenReturn(cuenta);
        when(cuenta.estaBloqueada()).thenReturn(false);
        gestorLogin.acceder("pepe", "1234");
    }

    //10
    @Test(expected = ExcepcionCuentaEnUso.class)
    public void testCuentaEnUso() {
        Mockito.when(repoCuentas.buscar("pepe")).thenReturn(cuenta);
        when(cuenta.estaEnUso()).thenReturn(true);
        gestorLogin.acceder("pepe", "1234");

    }
}
