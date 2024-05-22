/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class MonitorCalorias {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Double IMC = 0.0, total = 0.0;

        int opcao;

        do {
            System.out.print("Menu de opções\n1- Calcular IMC\n2- Mo"
                    + "nitorar calorias\n3- Encerrar programa\nopção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1) {

                System.out.print("Informe seu peso: ");
                Double peso = Double.parseDouble(scanner.nextLine().replace(",", "."));
                System.out.print("Informe sua altura: ");
                Double altura = Double.parseDouble(scanner.nextLine().replace(",", "."));
                IMC = peso / (altura * altura);
                System.out.println("\n");

            } else if (opcao == 2) {

                System.out.print("Informe a quantidade de refeições no dia: ");
                int refeicoes = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < refeicoes; i++) {
                    System.out.print("Informe a quantia de calorias na " + (i + 1) + " refeição: ");
                    Double quantia = Double.parseDouble(scanner.nextLine().replace(",", "."));
                    total = quantia * refeicoes;
                }
                System.out.println("\n\n");
            } else if (opcao < 1 || opcao > 3) {
                System.out.println("\nInforme uma opção válida!\n\n");
            }

        } while (opcao != 3);
        System.out.println("\nObrigado por usar nosso programa!\n\n");
        if (IMC == 0) {
            System.out.println("");
        } else {

            System.out.println("Seu IMC: " + IMC);
            if (IMC < 18.5) {
                System.out.println("Seu estado de saúde: abaixo do peso");
            } else if (IMC >= 18.5 && IMC < 25) {
                System.out.println("Seu estado de saúde: peso saudável");
            } else if (IMC >= 25 && IMC < 30) {
                System.out.println("Seu estado de saúde: sobrepeso");
            } else if (IMC >= 30) {
                System.out.println("Seu estado de saúde: obeso");
            }

        }
        if (total == 0) {
            System.out.println("");
        } else {
            System.out.println("Total de calorias consumidas: " + total);
        }
        System.out.println("Até mais!");

    }
}
