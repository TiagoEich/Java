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
public class negativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        do {
            System.out.print("Informe um número: ");
            numero = scanner.nextDouble();
            if (numero < 0) {
                System.out.println("\nAtenção, número negativo digitado!\n ");
            } else if (numero % 2 == 0) {
                System.out.println("Número par informado!");
            } else {
                System.out.println("\nNúmero ímpar informado!");
            }
        } while (numero < 0);
    }
}
/*Desenvolva um algoritmo que faz a leitura de um número inteiro. Enquanto o 
número for negativo, o programa deve retornar a mensagem: “Atenção! número 
negativo digitado.”. Quando o número digitado for positivo, calcule se ele é 
par ou ímpar e apresente a mensagem “Número par” ou “número ímpar”.*/
