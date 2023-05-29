/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arreglos_bidimensinales;

public class ArreglosBidimensinales {

    public static void main(String[] args) {
        int opcion;
        int lim;

        Metodo obj = new Metodo();
        System.out.println("Ingrese el limite para el arreglo ");
        lim = obj.entrada.nextInt();
        int[][] arreglo = new int[lim][lim];

        do {
            opcion = obj.menu();
            switch (opcion) {
                case 1 -> obj.llenarArreglo(arreglo);
                case 2 -> obj.ordenarArreglo(arreglo);
                case 3 -> obj.presentarArreglo(arreglo);
                default -> throw new AssertionError();
            }
        } while (opcion != 0);
    }
}
