/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @Jose Guerrero
 */
public class Problema06 {

    public static void main(String[] args) {

        String[][] Alumnos = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };

        int caracteresPer;
        int limCaracter = 11;
        String cadenaFinal = "";
        for (int fila = 0; fila < Alumnos.length; fila++) {

            for (int columnas = 0; columnas < Alumnos[0].length; columnas++) {

                caracteresPer = Alumnos[fila][columnas].length();

                if (caracteresPer == limCaracter) {

                    cadenaFinal = String.format("%s\n%s", cadenaFinal,
                           Alumnos[fila][columnas]);
                }
            }
        }
        System.out.println(cadenaFinal);

    }
}

