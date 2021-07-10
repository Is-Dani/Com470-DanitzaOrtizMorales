/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author DANI
 */
public class CalculatorSpringBootNGTest {

    private WebDriver driver;

    public CalculatorSpringBootNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://localhost:8080/calculadora");
        pausa(4);
    }

    @AfterMethod
    public void setDowMethod() throws Exception {
        driver.quit();
    }

//  TEST DE SUMA
    @Test
    public void testSuma() {

        driver.findElement(By.id("a")).sendKeys("2");
        driver.findElement(By.id("b")).sendKeys("2");

        driver.findElement(By.xpath("/html/body/form/p[1]/input[1]")).click();
        pausa(3);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("4"));
    }
    
//  TEST DE RESTA
    @Test
    public void testResta() {
        driver.findElement(By.id("a")).clear();
        driver.findElement(By.id("b")).clear();

        driver.findElement(By.id("a")).sendKeys("100");
        driver.findElement(By.id("b")).sendKeys("20");

        driver.findElement(By.xpath("/html/body/form/p[1]/input[2]")).click();
        pausa(3);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("80"));
        pausa(3);
    }

//  TEST MULTIPLICACION
    @Test
    public void testMultiplicacion() {
        driver.findElement(By.id("a")).clear();
        driver.findElement(By.id("b")).clear();

        driver.findElement(By.id("a")).sendKeys("2");
        driver.findElement(By.id("b")).sendKeys("5");

        driver.findElement(By.name("multiply")).click();
        pausa(3);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("10"));
        pausa(3);
    }

//  TEST DIVISION
    @Test
    public void testDivision() {
        driver.findElement(By.id("a")).clear();
        driver.findElement(By.id("b")).clear();

        driver.findElement(By.id("a")).sendKeys("15");
        driver.findElement(By.id("b")).sendKeys("5");

        driver.findElement(By.name("divide")).click();
        pausa(3);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("3.0"));
        pausa(3);
    }

//  TEST LIPIAR CALCULADORA SIMPLE
    @Test
    public void testLimpiarCalculadoraSimple() {
        driver.findElement(By.id("a")).clear();
        driver.findElement(By.id("b")).clear();

        driver.findElement(By.id("a")).sendKeys("0");
        driver.findElement(By.id("b")).sendKeys("0");

        driver.findElement(By.name("clearSimple")).click();
        pausa(3);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("0"));
        pausa(3);
    }
    
//  TEST DE FIBONACCI 
    @Test
    public void testfibonacci() {
        driver.findElement(By.name("c")).clear();

        driver.findElement(By.id("c")).sendKeys("5");

        driver.findElement(By.name("fibonacci")).click();
        pausa(3);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("5"));
        pausa(3);
    }

//  TEST DE FACTORIAL
    @Test
    public void testFactorial() {
        driver.findElement(By.name("c")).clear();

        driver.findElement(By.id("c")).sendKeys("5");

        driver.findElement(By.name("factorial")).click();
        pausa(3);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("120"));
        pausa(3);
    }

//  TEST RAIZ
    @Test
    public void testRaiz() {
        driver.findElement(By.name("c")).clear();

        driver.findElement(By.id("c")).sendKeys("16");

        driver.findElement(By.name("sqrt")).click();
        pausa(3);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("4.0"));
        pausa(3);
    }

//  POTENCIA AL CUADRADO
    @Test
    public void testPotenciaAlCuadrado() {
        driver.findElement(By.name("c")).clear();

        driver.findElement(By.id("c")).sendKeys("3");

        driver.findElement(By.name("power")).click();
        pausa(3);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("9"));
        pausa(3);
    }

//  TEST LIMPIAR CALCULADORA COMPLEJA
    @Test
    public void testLimpiarCalculadoraCompleja() {
        driver.findElement(By.name("c")).clear();

        driver.findElement(By.id("c")).sendKeys("0");

        driver.findElement(By.name("clearAdvanced")).click();
        pausa(3);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("0"));
        pausa(3);
    }

// FUNCION SEGUNDOS DE PAUSA 
    public static void pausa(long sleep) {
        try {
            Thread.sleep(sleep * 1000);
        } catch (InterruptedException e) {
        }
    }
}
