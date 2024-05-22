/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista05_Vetor;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] elemento = new int [10];
        System.out.println("Informe os 10 elementos: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1+"° elemento:");
            elemento[i] = scanner.nextInt();
        }for (int i = 0; i < elemento.length - 1; i++) {
            for (int j = 0; j <elemento.length - 1 - i; j++) {
                if (elemento[j] > elemento [j+1]) {
                    int temp = elemento [j];
                    elemento[j] = elemento [j] + 1;
                    elemento [j + 1] = temp;
                }
        }
        }System.out.println("Valores em ordem crescente: ");
        for (int i = 0; i < elemento.length; i++) {
            System.out.println(elemento[i]);
        }
}
}
