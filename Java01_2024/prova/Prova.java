/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class Prova {

    public static void main(String[] args) {
        String[][] vetor1 = new String[3][5];
        String[][] vetor2 = new String[3][5];
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int linha1 = 0, coluna1 = 0;
        int linha2 = 0, coluna2 = 0;
        do {
            System.out.print("\n***CADASTRO DE JOGADORES***\n\n1- Lista time do Internacional\n2- Lista time do Grêmio\n3- Lista de todos os jogadores\n4- Sair\nOpção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1) {
                if (linha1 > 2) {
                    System.out.println("\nNúmero máximo de jogadores do Internacional atingido!");
                } else {
                    System.out.print("\n***TIME DO INTERNACIONAL***\n");
                    System.out.print("\nNome do " + (linha1 + 1) + "° jogador: ");
                    vetor1[linha1][coluna1] = scanner.nextLine();
                    coluna1++;
                    System.out.print("Idade do " + (linha1 + 1) + "° jogador: ");
                    vetor1[linha1][coluna1] = scanner.nextLine();
                    coluna1++;
                    System.out.print("Peso do " + (linha1 + 1) + "° jogador: ");
                    vetor1[linha1][coluna1] = scanner.nextLine();
                    coluna1++;
                    System.out.print("Altura do " + (linha1 + 1) + "° jogador: ");
                    vetor1[linha1][coluna1] = scanner.nextLine();
                    coluna1++;
                    System.out.print("Posição do " + (linha1 + 1) + "° jogador: ");
                    vetor1[linha1][coluna1] = scanner.nextLine();
                    linha1++;
                    coluna1 = 0;
                }
            }
            if (opcao == 2) {
                if (linha2 > 2) {
                    System.out.println("\nNúmero máximo de jogadores do Grêmio atingido! ");
                } else {
                    System.out.println("\n***Time do Grêmio***");
                    System.out.print("\nNome do " + (linha2 + 1) + "° jogador: ");
                    vetor2[linha2][coluna2] = scanner.nextLine();
                    coluna2++;
                    System.out.print("Idade do " + (linha2 + 1) + "° jogador: ");
                    vetor2[linha2][coluna2] = scanner.nextLine();
                    coluna2++;
                    System.out.print("Peso do " + (linha2 + 1) + "° jogador: ");
                    vetor2[linha2][coluna2] = scanner.nextLine();
                    coluna2++;
                    System.out.print("Altura do " + (linha2 + 1) + "° jogador: ");
                    vetor2[linha2][coluna2] = scanner.nextLine();
                    coluna2++;
                    System.out.print("Posição do " + (linha2 + 1) + "° jogador: ");
                    vetor2[linha2][coluna2] = scanner.nextLine();
                    linha2++;
                    coluna2 = 0;
                }
            }
            if (opcao == 3) {
                if (linha1 == 0 && linha2 == 0) {
                    System.out.println("Informe os jogadores primeiramente!");
                } else {
                    System.out.println("\n***LISTA TODOS JOGADORES***");
                    System.out.println("\nTime do Internacional: \n");
                    for (int i = 0; i < vetor1.length; i++) {
                        System.out.println("Nome do " + (i + 1) + "° jogador: " + vetor1[i][0]);
                        System.out.println("Idade do " + (i + 1) + "° jogador: " + vetor1[i][1]);
                        System.out.println("Peso do " + (i + 1) + "° jogador: " + vetor1[i][2]);
                        System.out.println("Altura do " + (i + 1) + "° jogador: " + vetor1[i][3]);
                        System.out.println("Posição do " + (i + 1) + "° jogador: " + vetor1[i][4] + "\n");
                    }
                    System.out.println("\nTime do Grêmio: \n");
                    for (int i = 0; i < vetor2.length; i++) {
                        System.out.println("Nome do " + (i + 1) + "° jogador: " + vetor2[i][0]);
                        System.out.println("Idade do " + (i + 1) + "° jogador: " + vetor2[i][1]);
                        System.out.println("Peso do " + (i + 1) + "° jogador: " + vetor2[i][2]);
                        System.out.println("Altura do " + (i + 1) + "° jogador: " + vetor2[i][3]);
                        System.out.println("Posição do " + (i + 1) + "° jogador: " + vetor2[i][4] + "\n");
                    }
                }
            }
            if (opcao == 4) {
                System.out.println("\nObrigado por usar nosso serviço!\n\n");
            }
        } while (opcao != 4);
    }
}