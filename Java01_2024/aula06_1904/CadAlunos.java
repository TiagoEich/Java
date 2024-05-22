/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_1904;

import static aula06_1904.CadTimes.scanner;
import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class CadAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.print("*** CADASTRO DE ALUNOS ***\n\n1- Cadastrar alunos\n2- Lista dos alunos\n3- Sair\nOpção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1) {
               cadastro();
            } else if (opcao == 2) {
                listagem();
            }else if (opcao==3) {
                System.out.println("\nObrigado por acessar nosso serviço!\n\n\n\n");
            }
        } while (opcao != 3);
        
    }public static void cadastro (){
         Alunos novo = new Alunos();
                System.out.print("Número de matrícula: ");
                novo.numMatricula = Integer.parseInt(scanner.nextLine());
                System.out.print("Nome do aluno: ");
                novo.nomeAluno = scanner.nextLine();
                System.out.print("Valor da mensalidade: R$");
                novo.vlrMensalidade = Double.parseDouble(scanner.nextLine().replace(",", "."));
                Alunos.cadastro.add(novo);
                System.out.println("\n");
    }public static void listagem (){
        if (Alunos.cadastro.isEmpty()) {
                    System.out.print("\nInforme primeiramente o cadastro!\n\n");
                } else {
                    System.out.print("\n*** Listagem dos dados ***\n");
                }
                for (Alunos cadastro : Alunos.cadastro) {
                    System.out.println("\nNúmero matrícula: "+cadastro.numMatricula);
                    System.out.println("Nome do aluno: "+cadastro.nomeAluno);
                    System.out.println("Valor da mensalidade: R$"+cadastro.vlrMensalidade+"\n");
                }
    }
}