/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import archivos.ContarLOC;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author calidad
 */
public class TestContarLOC {

    public TestContarLOC() {
    }

    @Test
    public void getLineasDeArchivo1() throws IOException {
        ContarLOC contarLOC = new ContarLOC();
        List<String> lineas = new LinkedList<>();
        lineas.add("import java.io.BufferedReader;");
        lineas.add("import java.io.File;");
        lineas.add("import java.io.FileReader;");
        lineas.add("import java.io.IOException;");
        lineas.add("import java.util.ArrayList;");
        lineas.add("import java.util.LinkedList;");
        lineas.add("import java.util.List;");
        assertEquals(lineas, contarLOC.getLineasDeArchivo("Prueba1.java"));
    }

    @Test
    public void getLineasDeArchivo2() throws IOException {
        ContarLOC contarLOC = new ContarLOC();
        List<String> lineas = new LinkedList<>();
        lineas.add("import java.io.BufferedReader;");
        lineas.add("import java.io.File;");
        lineas.add("import java.io.FileReader;");
        lineas.add("import java.io.IOException;");
        lineas.add("import java.util.ArrayList;");
        lineas.add("import java.util.LinkedList;");
        lineas.add("import java.util.List;");
        assertEquals(lineas, contarLOC.getLineasDeArchivo("Prueba1.java"));
    }

    @Test
    public void tamanoClases() throws IOException {
        ContarLOC contarLOC = new ContarLOC();
        List<String> lineas = contarLOC.getLineasDeArchivo("CargarArchivo.java");
        assertEquals(32, contarLOC.tamanoClases(lineas));
    }

    @Test
    public void contarPrograma2() throws IOException {
        ContarLOC contarLOC = new ContarLOC();
        List<String> lineas = new LinkedList<>();
        contarLOC.contarPrograma("programa");
        assertEquals(11, contarLOC.getTotalPrograma());
    }

    @Test
    public void tamanoClases2() throws IOException {
        ContarLOC contarLOC = new ContarLOC();
        List<String> lineas = contarLOC.getLineasDeArchivo("CalculoEstadistico.java");
        assertEquals(21, contarLOC.tamanoClases(lineas));
    }     

    @Test
    public void tamanoMetodos() throws IOException {
        ContarLOC contarLOC = new ContarLOC();
        List<String> lineas = contarLOC.getLineasDeArchivo("CargarArchivo.java");
        assertEquals(1, contarLOC.tamanoMetodos(lineas));
    }

    @Test
    public void tamanometodos2() throws IOException {
        ContarLOC contarLOC = new ContarLOC();
        List<String> lineas = contarLOC.getLineasDeArchivo("CalculoEstadistico.java");
        assertEquals(3, contarLOC.tamanoMetodos(lineas));
    }
}
