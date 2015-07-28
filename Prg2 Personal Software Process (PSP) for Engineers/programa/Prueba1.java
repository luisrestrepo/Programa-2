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