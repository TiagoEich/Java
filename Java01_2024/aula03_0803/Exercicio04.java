/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_0803;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite a tabuada que você deseja: ");
        int valor = Integer.parseInt(scanner.nextLine());
        System.out.println("\nTabuada do "+valor+": ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n"+valor+" x "+i+" = "+(valor*i));
        }System.out.println("");
    }
}
    

