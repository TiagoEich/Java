/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04_Repeticao;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class ListagemNum {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {

            System.out.print("Informe um número positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.print("\nInforme um número inteiro válido: ");
                scanner.next();
            }
            num = scanner.nextInt();
            {
                System.out.println("\n\n*** Listagem dos números até o seu valor digitado ***\n");
                for (int i = 1; i <= num; i++) {
                    System.out.println(i);
                }
            }
        } while (num < 0);
       
    }
}

/*Desenvolva um algoritmo que leia um número inteiro e positivo. Em seguida, deve
usar estruturas de repetição para calcular e apresentar uma lista com todos os 
números de 1 até o número lido.*/
