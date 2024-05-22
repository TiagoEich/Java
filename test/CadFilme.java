
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago
 */
public class CadFilme {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
               System.setProperty("console.encoding", "UTF-8");
        do {
            System.out.print("GERENCIADOR DE FILMES\n1- Cadastrar filmes\n2- Listar Filmes\n3 - Sair\nOpção:");
            opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1) {
                Filme cadastro = new Filme();
                System.out.print("Informe título do filme: ");
                cadastro.nome = scanner.nextLine();
                System.out.print("Informe o ano de lançamento do filme: ");
                cadastro.release = Integer.parseInt(scanner.nextLine());
                System.out.print("Insira o gênero do filme: ");

                cadastro.genre = scanner.nextLine();
                Filme.filme.add(cadastro);
                System.out.println("\n");
            } else if (opcao == 2) {
                if (Filme.filme.isEmpty()) {
                    System.out.println("Faça o cadastro de ao menos um filme!");
                }
                for (Filme lista : Filme.filme) {
                    System.out.println("Nome do filme: " + lista.nome);
                    System.out.println("Ano de lançamento: " + lista.release);
                    System.out.println("Gênero: " + lista.genre + "\n");
                }
            }
        } while (opcao != 3);

    }
}
