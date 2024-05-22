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
        if (num < 0) {
            System.out.println("Informe um número válido!");
        } else {
            System.out.print("Informe um número positivo: ");
            num = Integer.parseInt(scanner.nextLine());
            System.out.println("\n\n*** Listagem dos números até o seu valor digitado ***\n");
        }
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}


/*Desenvolva um algoritmo que leia um número inteiro e positivo. Em seguida, deve
usar estruturas de repetição para calcular e apresentar uma lista com todos os 
números de 1 até o número lido.*/
