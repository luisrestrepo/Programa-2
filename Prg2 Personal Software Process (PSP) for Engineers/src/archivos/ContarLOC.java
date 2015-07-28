/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author calidad
 */
public class ContarLOC {

    private int totalPrograma;

    public Object[][] contarPrograma(String nombreCarpeta) throws IOException {
        totalPrograma = 0;
        List<String> nombresArchivos = buscarArchivos(nombreCarpeta);
        Object[][] resultados = new Object[nombresArchivos.size()][4];
        resultados[0][0] = new File(nombreCarpeta).getName();
        for (int i = 0; i < nombresArchivos.size(); i++) {
            String nombreArchivo = nombresArchivos.get(i);
            List<String> lineas = getLineasDeArchivo(nombreArchivo);
            resultados[i][1] = new File(nombreArchivo).getName();
            resultados[i][2] = tamanoMetodos(lineas);
            resultados[i][3] = tamanoClases(lineas);
            totalPrograma = totalPrograma + (Integer) resultados[i][3];
        }
        return resultados;
    }

    public int tamanoMetodos(List<String> lineasArchivo) {
        int cantidadMetodos = 0;
        for (String linea : lineasArchivo) {
            String expresionRegular = ".*?((?:[a-z][a-z]+)).*?(\\s+)((?:[a-z][a-z0-9_]*))(\\().*?(\\))(\\s+)(\\{)";
            Pattern pattern = Pattern.compile(expresionRegular, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
            Matcher matcher = pattern.matcher(linea);
            if (matcher.matches()) {
                cantidadMetodos = cantidadMetodos + 1;
            }
        }
        return cantidadMetodos;
    }

    public int tamanoClases(List<String> lineasArchivo) {
        int cantidadLineas = 0;
        for (String linea : lineasArchivo) {
            String expresionRegular = ".*?[(\\{)(\\;)]";
            Pattern pattern = Pattern.compile(expresionRegular, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
            Matcher matcher = pattern.matcher(linea);
            if (matcher.matches()) {
                cantidadLineas = cantidadLineas + 1;
            }
        }
        return cantidadLineas;
    }

    public List<String> getLineasDeArchivo(String nombreArchivo) throws IOException {
        List lineasArchivo = new LinkedList();
        BufferedReader bufferedReader = abrirArchivo(nombreArchivo);
        if (bufferedReader == null) {
            throw new IOException();
        }
        String linea;
        try {
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
                lineasArchivo.add(linea);
            }
        } catch (IOException | NumberFormatException e) {
            throw new IOException();
        }
        return lineasArchivo;
    }

    private BufferedReader abrirArchivo(String nombreArchivo) {
        File archivo;
        FileReader fr;
        BufferedReader br;
        try {
            archivo = new File(nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
        } catch (Exception ignored) {
            return null;
        }
        return br;
    }

    public List<String> buscarArchivos(String nombreCarpeta) {
        List archivos = new LinkedList();
        File carpeta = new File(nombreCarpeta);
        filtrarArchivosDeCarpetas(archivos, carpeta);
        return archivos;
    }

    private void filtrarArchivosDeCarpetas(List<String> archivos, File carpeta) {
        for (File archivo : carpeta.listFiles()) {
            if (archivo.isDirectory()) {
                filtrarArchivosDeCarpetas(archivos, archivo);
            } else {
                String re1 = ".*?(\\.)(java)";
                Pattern p = Pattern.compile(re1, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
                Matcher m = p.matcher(archivo.getName());
                if (m.matches()) {
                    archivos.add(archivo.getAbsolutePath());
                }
            }
        }
    }

    public int getTotalPrograma() {
        return totalPrograma;
    }

    public void setTotalPrograma(int totalPrograma) {
        this.totalPrograma = totalPrograma;
    }
}
