/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglos_bidimensinales;

import java.util.Scanner;

public class Metodo {

    Scanner entrada;

    public Metodo() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Ingrese los elementos para el arreglo [1]");
        System.out.println("Ordenar arreglo                       [2]");
        System.out.println("Presentar arreglo                     [3]");

        return entrada.nextInt();
    }

    public int llenarArreglo(int[][] b) {
        int f = b.length;
        int c = b[0].length;
        System.out.println("Inserte valores para el arreglo:\n");

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Ingrese elemento para la posicion:"
                        + "[" + i + "]" + "[" + j + "]");
                b[i][j] = entrada.nextInt();
            }
        }
        return b.length;
    }

    public void ordenarArreglo(int[][] a) {
        int f = a.length;
        int c = a[0].length;

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c - 1; j++) {
                for (int k = 0; k < c - j - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int t = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = t;
                    }
                }
            }
        }
    }

    public void presentarArreglo(int[][] r) {
        int fi = r.length;
        int co = r[0].length;

        System.out.println("El arreglo es: ");

        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < co; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }

}
