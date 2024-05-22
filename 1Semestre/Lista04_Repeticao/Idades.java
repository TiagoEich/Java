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
public class Idades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0, soma = 0;
        int age = 0, kid = 0, maior = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe a idade da " + (i + 1) + "° pessoa: ");
            int idade = Integer.parseInt(scanner.nextLine());
            soma = idade + soma;
            if (idade > maior) {
                maior = idade;
            }
            if (idade > 18) {
                age++;
            } else if (idade < 5) {
                kid++;
            }
        }
        media = soma / 10;
        System.out.println("\nA média é de: " + media);
        System.out.println(age + " pessoas tem mais de 18 anos!");
        System.out.println(kid + " pessoas tem menos de 5 anos!");
        System.out.println("A maior idade é: " + maior);
    }
}

/*Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo xxx
b) Quantas pessoas tem mais de 18 anos xxx
c) Quantas pessoas tem menos de 5 anos xxx
d) Qual foi a maior idade lida*/
