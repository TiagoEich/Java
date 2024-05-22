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
public class CalculoInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao, quantia = 0, pares = 0, impares = 0;
        double soma = 0, media = 0, num = 0, mediapar = 0, par = 0, nothing = 0;
        do {
            System.out.print("1: Informe um número\n0: Sair\nOpção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1) {
                System.out.print("Informe um número positivo: ");
                num = Double.parseDouble(scanner.nextLine());
                quantia++;
                soma = num + soma;
                if (num % 2 == 0) {
                    par = num + par;
                }
                if (num % 2 == 0) {
                    pares++;

                } else {
                    impares++;

                }
                if (num == (double) num) {
                    nothing++;
                }

            }
            if (opcao == 0) {

                mediapar = par / pares;
                int Intpar = (int) mediapar;
                media = soma / quantia;
                System.out.println("Quantidade de números pares: " + pares);
                System.out.println("Quantidade de números ímpares: " + impares);
                System.out.println("Média par: " + Intpar);
                System.out.println("A média geral dos números é :" + media);
            }
        } while (opcao != 0);

    }
}

/*Faça um algoritmo que leia uma quantidade não determinada de números positivos. 
O número que encerrará a leitura será zero. A partir dos valores lidos:
Calcule e mostre a quantidade de números pares e ímpares xxx ; 
Calcule e mostre a média dos valores pares 
Calcule e mostre a média geral dos números lidos. xxx */
