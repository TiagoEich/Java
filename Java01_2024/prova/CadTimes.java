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
public class CadTimes {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.print("*** CADASTRO DE JOGADORES***\n\n1- Cadastrar time"
                    + " do Inter\n2- Cadastrar time do Grêmio\n3- Listar time"
                    + " do Internacional\n4- Listar time do Grêmio\n5- Listar"
                    + " times\n6- Sair\n\nOpção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            
            switch (opcao) {
                case 1:
                    timeInter();
                    break;
                    
                case 2:
                    timeGremio();
                    break;
                    
                case 3:
                    listaInter();
                    break;
                    
                case 4:
                    listaGremio();
                    break;
                    
                case 5:
                    listaInter();
                    listaGremio();
                    break;
                    
                default:
                    System.out.println("Obrigado por acessar nosso serviço!");
                    break;
                    
            }
        } while (opcao != 6);
    }

    public static void timeInter() {
        System.out.print("\nCADASTRO DO TIME INTERNACIONAL\n\n");
        Jogadores inter = new Jogadores();
        System.out.print("Informe o nome do jogador: ");
        inter.nome = scanner.nextLine();
        System.out.print("Informe a idade do jogador: ");
        inter.idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe o peso do jogador: ");
        inter.peso = Double.parseDouble(scanner.nextLine().replace(",", "."));
        System.out.print("Informe a altura do jogador: ");
        inter.altura = Double.parseDouble(scanner.nextLine().replace(",", "."));
        System.out.print("Informe a posição do jogador:");
        inter.posicao = scanner.nextLine();
        Jogadores.internacional.add(inter);
        System.out.println("\n");
    }

    public static void timeGremio() {
        System.out.print("\nCADASTRO DO TIME DO GRÊMIO\n");
        Jogadores gremio = new Jogadores();
        System.out.print("Informe o nome do jogador: ");
        gremio.nome = scanner.nextLine();
        System.out.print("Informe a idade do jogador: ");
        gremio.idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe o peso do jogador: ");
        gremio.peso = Double.parseDouble(scanner.nextLine().replace(",", "."));
        System.out.print("Informe a altura do jogador: ");
        gremio.altura = Double.parseDouble(scanner.nextLine().replace(",","."));
        System.out.print("Informe a posição do jogador: ");
        gremio.posicao = scanner.nextLine();
        Jogadores.gremio.add(gremio);
        System.out.println("\n");
    }

    public static void listaInter() {
        if (Jogadores.internacional.isEmpty()) {
            System.out.println("\nCadastre pelo menos um jogador do Internacional!\n");
        } else {
            System.out.println("\n*** LISTA DO TIME INTERNACIONAL ***\n");
            for (Jogadores internacional : Jogadores.internacional) {
                System.out.println("Nome do jogador: " + internacional.nome);
                System.out.println("Idade do jogador: " + internacional.idade);
                System.out.println("Peso do jogador: " + internacional.peso);
                System.out.println("Altura do jogador: " + internacional.altura);
                System.out.println("Posição do jogador: " + internacional.posicao + "\n");
            }
        }
    }

    public static void listaGremio() {
        if (Jogadores.gremio.isEmpty()) {
            System.out.println("\nCadastre pelo menos um jogador do Grêmio!\n");
        } else {
            System.out.println("\n*** lISTA DO TIME GRÊMIO ***\n");
            for (Jogadores gremio : Jogadores.gremio) {
                System.out.println("Nome do jogador: " + gremio.nome);
                System.out.println("Idade do jogador: " + gremio.idade);
                System.out.println("Peso do jogador: " + gremio.peso);
                System.out.println("Altura do jogador: " + gremio.altura);
                System.out.println("Posição do jogador: " + gremio.posicao + "\n");
            }
        }
    }
}