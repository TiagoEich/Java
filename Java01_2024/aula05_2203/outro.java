/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_2203;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class outro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] inter = new String[3][5];
        String[][] gremio = new String[3][5];
        int linha1 = 0, coluna1 = 0;
        int linha2 = 0, coluna2 = 0;
        int opcao;
        System.out.println("CADASTRO DE JOGADORES DO INTERNACIONAL E GRÊMIO\n\n");
        do {
            System.out.print("1- Lista do time do Internacional\n2- Lista do "
                    + "time do Grêmio\n3- Lista de todos os jogadores\n4- Sair\nOpção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1) {
                System.out.print("\nInforme o nome do jogador:");
                inter[linha1][coluna1] = scanner.nextLine();
                coluna1++;
                System.out.print("Informe a idade do jogador: ");
                inter[linha1][coluna1] = scanner.nextLine();
                coluna1++;
                System.out.print("Informe o peso do jogador: ");
                inter[linha1][coluna1] = scanner.nextLine();
                coluna1++;
                System.out.print("Informe a altura do jogador: ");
                inter[linha1][coluna1] = scanner.nextLine();
                coluna1++;
                System.out.print("Informe a posição do jogador: ");
                inter[linha1][coluna1] = scanner.nextLine();
                coluna1 = 0;
                linha1++;
            } else if (opcao == 2) {
                System.out.print("\nInforme o nome do jogador:");
                gremio[linha2][coluna2] = scanner.nextLine();
                coluna2++;
                System.out.print("Informe a idade do jogador: ");
                gremio[linha2][coluna2] = scanner.nextLine();
                coluna2++;
                System.out.print("Informe o peso do jogador: ");
                gremio[linha2][coluna2] = scanner.nextLine();
                coluna2++;
                System.out.print("Informe a altura do jogador: ");
                gremio[linha2][coluna2] = scanner.nextLine();
                coluna2++;
                System.out.print("Informe a posição do jogador: ");
                gremio[linha2][coluna2] = scanner.nextLine();
                coluna2 = 0;
                linha2++;

            } else if (opcao == 3) {
                    for (int i = 0; i < linha1; i++) { 
                        System.out.println("\nNome do " + (i + 1) + "° jogador: " + inter[i][0]);
                        System.out.println("Idade do " + (i + 1) + "° jogador: " + inter[i][1]);
                        System.out.println("Peso do " + (i + 1) + "° jogador: " + inter[i][2]);
                        System.out.println("Altura do " + (i + 1) + "° jogador: " + inter[i][3]);
                        System.out.println("Posição do " + (i + 1) + "° jogador: " + inter[i][4] + "\n");
                    }System.out.println("TIME DO GRÊMIO");
                    for (int i = 0; i < linha2; i++) {
                            System.out.println("\nNome do " + (i + 1) + "° jogador: " + gremio[i][0]);
                            System.out.println("Idade do " + (i + 1) + "° jogador: " + gremio[i][1]);
                            System.out.println("Peso do " + (i + 1) + "° jogador: " + gremio[i][2]);
                            System.out.println("Altura do " + (i + 1) + "° jogador: " + gremio[i][3]);
                            System.out.println("Posição do " + (i + 1) + "° jogador: " + gremio[i][4] + "\n");
                        }
                }
        } while (opcao != 4);
    }
}