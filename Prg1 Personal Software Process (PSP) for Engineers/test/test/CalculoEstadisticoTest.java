/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import calculos.CalculoEstadistico;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author calidad
 */
public class CalculoEstadisticoTest {

    public CalculoEstadisticoTest() {
    }

    @Test
    public void sumar() {
        List numeros = new LinkedList<Double>();
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double suma = calculoEstadistico.sumar(numeros);
        assertEquals(0, suma, 0.01);
    }

    @Test
    public void sumarCorrectamente() {
        List numeros = new LinkedList<Double>();
        numeros.add(2.0);
        numeros.add(3.0);
        numeros.add(4.0);
        numeros.add(5.0);
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double suma = calculoEstadistico.sumar(numeros);
        assertEquals(14, suma, 0.01);
    }

    @Test
    public void sumaNula() {
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double suma = calculoEstadistico.sumar(null);
        assertEquals(0, suma, 0.01);
    }

    @Test
    public void calcularPromedio1() {
        List numeros = new LinkedList<Double>();
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double promedio = calculoEstadistico.calcularPromedio(numeros);
        assertEquals(0, promedio, 0.01);
    }

    @Test
    public void calcularPromedio2() {
        List numeros = new LinkedList<Double>();
        numeros.add(2.0);
        numeros.add(3.0);
        numeros.add(4.0);
        numeros.add(5.0);
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double promedio = calculoEstadistico.calcularPromedio(numeros);
        assertEquals(3.5, promedio, 0.01);
    }

    @Test
    public void calcularPromedio3() {
        List numeros = new LinkedList<Double>();
        numeros.add(1.0);
        numeros.add(2.0);
        numeros.add(3.0);
        numeros.add(4.0);
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double promedio = calculoEstadistico.calcularPromedio(numeros);
        assertEquals(2.5, promedio, 0.01);
    }

    @Test
    public void calcularPromedio4() {
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double promedio = calculoEstadistico.calcularPromedio(null);
        assertEquals(0.0, promedio, 0.01);
    }

    @Test
    public void desviacionEstandar1() {
        List numeros = new LinkedList<Double>();
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double desviacionEstandar = calculoEstadistico.desviacionEstandar(numeros);
        assertEquals(0, desviacionEstandar, 0.01);
    }

    @Test
    public void desviacionEstandar2() {
        List numeros = new LinkedList<Double>();
        numeros.add(2.0);
        numeros.add(3.0);
        numeros.add(4.0);
        numeros.add(5.0);
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double desviacionEstandar = calculoEstadistico.desviacionEstandar(numeros);
        assertEquals(1.29, desviacionEstandar, 0.01);
    }

    @Test
    public void desviacionEstandar3() {
        List numeros = new LinkedList<Double>();
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double desviacionEstandar = calculoEstadistico.desviacionEstandar(null);
        assertEquals(0, desviacionEstandar, 0.01);
    }

    @Test
    public void desviacionEstandar4() {
        List numeros = new LinkedList<Double>();
        CalculoEstadistico calculoEstadistico = new CalculoEstadistico();
        double desviacionEstandar = calculoEstadistico.desviacionEstandar(numeros);
        assertEquals(0, desviacionEstandar, 0.01);
    }
}
