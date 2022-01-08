/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @Jose Guerrero
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] proveedora = {"Jessica Cole", "Robert Wallace"};
        int[][] ventasDiarias = new int[2][5];
        String cadenaFinal = " ";
        int dia;
        int sumaVentas = 0;

        for (int fila = 0; fila < proveedora.length; fila++) {
            dia = 1;
            for (int col = 0; col < ventasDiarias[0].length; col++) {
                System.out.printf("Coloque las ventas de %s el día %d: ",
                       proveedora[fila],
                        dia);
                ventasDiarias [fila][col]= entrada.nextInt();
                sumaVentas = sumaVentas + ventasDiarias[fila][col];
                dia = dia+1;
            }
            cadenaFinal = String.format("%s\n Vendedor(a) %s", cadenaFinal,
                    proveedora[fila]);

        }
        System.out.printf("%s\n Ha realizado un total de %d en ventas.", 
                cadenaFinal, 
                sumaVentas);
    }
}