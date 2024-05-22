/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_1904;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class CadTimes {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("*** CADASTROS DE JOGADORES***\n");
            System.out.println("1 - Cadastrar jogadores do Internacional");
            System.out.println("2 - Cadastrar jogadores do Grêmio");
            System.out.println("3 - Listar time do Internacional");
            System.out.println("4 - Listar time do Grêmio");
            System.out.println("5 - Listar times ");
            System.out.println("6 - Sair ");
            System.out.print("\nOpção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1) {
                cadastrarInter();
            } else if (opcao == 2) {
                cadastrarGremio();
            } else if (opcao == 3) {
                listarInter();
            } else if (opcao == 4) {
                listarGremio();
            } else if (opcao == 5) {
                listarInter();
                listarGremio();
            }
        } while (opcao != 6);
    }

    public static void cadastrarInter() {
        System.out.println("\n*** Cadastro de Jogadores do Internacional ***\n");
        Jogador novo = new Jogador(); // criei um objeto chamado novo da classe jogador
        System.out.print("Digite o nome: ");
        novo.nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        novo.idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite a posição: ");
        novo.posicao = scanner.nextLine();
        System.out.print("Digite a altura: ");
        novo.altura = Double.parseDouble(scanner.nextLine().replace(",", "."));
        System.out.print("Digite o peso: ");
        novo.peso = Double.parseDouble(scanner.nextLine().replace(",", "."));
        Jogador.inter.add(novo);
        System.out.println("\n--------------------\n");
    }

    public static void cadastrarGremio() {
        System.out.println("\n*** Cadastro de Jogadores do Grêmio ***\n");
        Jogador novo = new Jogador();
        System.out.print("Digite o nome: ");
        novo.nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        novo.idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite a posição: ");
        novo.posicao = scanner.nextLine();
        System.out.print("Digite a altura: ");
        novo.altura = Double.parseDouble(scanner.nextLine().replace(",", "."));
        System.out.print("Digite o peso: ");
        novo.peso = Double.parseDouble(scanner.nextLine().replace(",", "."));
        Jogador.gremio.add(novo);
        System.out.println("\n--------------------\n");
    }

    public static void listarInter() {
        if (Jogador.inter.isEmpty()) {
            System.out.println("\nSem jogadores cadastrados!\n");
                    System.out.println("\n--------------------\n");

        } else {
            System.out.println("\n*** LISTA DO TIME DO INTERNACIONAL ***\n");
            for (Jogador internacional : Jogador.inter) {
                System.out.println("Nome: " + internacional.nome);
                System.out.println("Idade: " + internacional.idade);
                System.out.println("Posição: " + internacional.posicao);
                System.out.println("Altura:" + internacional.altura);
                System.out.println("Peso: " + internacional.peso + "\n");
                        System.out.println("\n--------------------\n");

            }
        }
    }

    public static void listarGremio() {
        if (Jogador.gremio.isEmpty()) {
            System.out.println("\nSem jogadores cadastrados!\n");
        System.out.println("\n--------------------\n");
        } else {
            System.out.println("\n*** LISTA DO TIME DO GRÊMIO ***\n");

            for (Jogador time : Jogador.gremio) {
                System.out.println("Nome: " + time.nome);
                System.out.println("Idade: " + time.idade);
                System.out.println("Posição: " + time.posicao);
                System.out.println("Altura:" + time.altura);
                System.out.println("Peso: " + time.peso + "\n");
                        System.out.println("\n--------------------\n");

            }
        }
    }
    }

/*Para fazer com que um valor Double que irá ler um número real com um .
é preciso colocar entre o nextLine().replace(",",".")).
Para anular o erro do usuário escolher a opção de listagem dos jogadores sem
antes ter cadastrado, leia a linha 80 e 99*/
