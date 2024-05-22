/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_2203;

import java.util.Scanner;

/**
 *
 * @author 23200041
 */
public class Atividade06 {
public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[][] agenda = new String[10][5];
        int opcao;
        int linha = 0, coluna = 0;
        do {
            System.out.println("\n      Agenda");
            System.out.println("1 - Cadastrar contato:");
            System.out.println("2 - Registrar agenda:");
            System.out.println("3 - Sair\n");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(ler.nextLine());
                if (opcao == 1) {
if (linha > 1) {
                System.out.println("Agenda lotada");
            } else {
                    System.out.print("Digite  nome: ");
                    agenda[linha][coluna] = ler.nextLine();
                    coluna++;
                    System.out.print("Digite o endereço: ");
                    agenda[linha][coluna] = ler.nextLine();
                    coluna++;
                    System.out.print("Digite a cidade: ");
                    agenda[linha][coluna] = ler.nextLine();
                    coluna++;
                    System.out.print("Digite o telefone: ");
                    agenda[linha][coluna] = ler.nextLine();
                    coluna++;
                    System.out.print("Digite o e-mail: ");
                    agenda[linha][coluna] = ler.nextLine();
                    linha++;
                    coluna = 0;
                }
            }
            if (opcao == 2) {
                System.out.println("    \nLista da agenda");
                if (linha == 0) {
                    System.out.println("Não existem contatos cadastrados.");
                } else {
                    for (int i = 0; i < linha; i++) {
                        System.out.println("Nome: " + agenda[i][0]);
                        System.out.println("Endereço: " + agenda[i][1]);
                        System.out.println("Cidade: " + agenda[i][2]);
                        System.out.println("Telefone:" + agenda[i][3]);
                        System.out.println("e=mail: " + agenda[i][4]);
                    }
                }
            }
        } while (opcao != 3);
    }
}
