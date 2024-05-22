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
public class DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0, menor = 0, quantia = 0, pares = 0;
        double soma = 0;
        double media = 0;
        String ye;
        if (num < 0) {
            System.out.println("Informe um número positivo!");
        } else {
            do {
                System.out.print("Informe um número inteiro: ");
                num = Integer.parseInt(scanner.nextLine());
                soma = num + soma;
                System.out.print("Deseja continuar? ");
                ye = scanner.nextLine();
                quantia++;
                if (menor == 0 || num < menor) {
                    menor = num;
                }
                if (num % 2 == 0) {
                    pares++;
                }
            } while (ye.equals("s") || ye.equals("sim"));
            media = soma / quantia;
            System.out.println("O somatório é de: " + soma);
            System.out.println("O menor número digitado foi: " + menor);
            System.out.println("A média é de: " + media);
            System.out.println("Têm " + pares + " valores pares.");
        }
    }
}
/*Crie um programa usando a estrutura “faça enquanto” que leia vários números inteiros.
A cada leitura, pergunte se o usuário quer continuar ou não. No final, mostre na
tela:
a) O somatório entre todos os valores xxx
b) Qual foi o menor valor digitado xxx
c) A média entre todos os valores xxx
d) Quantos valores são pares xxx */
