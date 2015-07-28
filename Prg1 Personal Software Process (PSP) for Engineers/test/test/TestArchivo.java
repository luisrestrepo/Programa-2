/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import archivos.CargarArchivo;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author calidad
 */
public class TestArchivo {

    public TestArchivo() {
    }

    @Test
    public void numerosDeArchivo1() throws IOException {
        CargarArchivo cargarArchivo = new CargarArchivo();
        List<Double> numeros = new LinkedList<>();
        assertEquals(numeros, cargarArchivo.getNumerosDeArchivo("archivo1.txt"));
    }

    @Test
    public void numerosDeArchivo2() throws IOException {
        CargarArchivo cargarArchivo = new CargarArchivo();
        List<Double> numeros = new LinkedList<>();
        assertEquals(numeros, cargarArchivo.getNumerosDeArchivo("archivo2.txt"));
    }

    @Test
    public void numerosDeArchivo3() throws IOException {
        CargarArchivo cargarArchivo = new CargarArchivo();
        List<Double> numeros = new LinkedList<>();
        numeros.add(2.0);
        numeros.add(3.0);
        numeros.add(4.0);
        assertEquals(numeros, cargarArchivo.getNumerosDeArchivo("archivo3.txt"));
    }

    @Test
    public void numerosDeArchivo4() throws IOException {
        CargarArchivo cargarArchivo = new CargarArchivo();
        List<Double> numeros = new LinkedList<>();
        numeros.add(5.0);
        numeros.add(6.0);
        numeros.add(7.0);
        assertEquals(numeros, cargarArchivo.getNumerosDeArchivo("archivo4.txt"));
    }

}