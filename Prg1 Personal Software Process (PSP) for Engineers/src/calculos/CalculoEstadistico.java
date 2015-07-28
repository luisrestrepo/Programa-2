/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

import java.util.List;

/**
 *
 * @author calidad
 */
public class CalculoEstadistico {

    public double calcularPromedio(List numeros) {
        if (numeros == null || numeros.size() == 0) {
            return 0;
        }
        return sumar(numeros) / numeros.size();
    }

    public double sumar(List numeros) {
        double suma = 0.0;
        if (numeros != null) {
            for (Object numero : numeros) {
                suma = suma + (Double) numero;
            }
        }
        return suma;
    }

    public double desviacionEstandar(List numeros) {
        if (numeros == null || numeros.size() == 0) {
            return 0;
        }
        double media = calcularPromedio(numeros);
        double suma = 0.0;
        for (Object numero :numeros) {
            suma = suma + Math.pow((Double)numero - media, 2);
        }
        return Math.sqrt(suma / (numeros.size() - 1));
    }
}