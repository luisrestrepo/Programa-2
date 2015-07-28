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

/**
 *
 * @author calidad
 */
public class CargarArchivo {

    public List<Double> getNumerosDeArchivo(String nombreArchivo) throws IOException{
        List numeros = new ArrayList();
        BufferedReader bufferedReader = abrirArchivo(nombreArchivo);
        if (bufferedReader == null) {
            throw new IOException();
        }
        String numero;
        try {
            while ((numero = bufferedReader.readLine()) != null) {
                numeros.add(Double.parseDouble(numero));
            }
        } catch (Exception e) {
           throw new IOException();
        }
        return numeros;
    }

    private BufferedReader abrirArchivo(String nombreArchivo) {
        File archivo;
        FileReader fr = null;
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

}
