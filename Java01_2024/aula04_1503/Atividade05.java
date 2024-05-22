/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04_1503;

import java.util.Scanner;

/**
 *
 * @author 23200041
 */
public class Atividade05 {
    public static void main(String[] args) {
        Classe novo = new Classe();
       Scanner ler = new Scanner (System.in);
        System.out.print("Digite o número da matrícula: ");
       novo.numMatricula = Integer.parseInt(ler.nextLine());
        System.out.print("Digite o nome do aluno: ");
        novo.nomeAluno = ler.nextLine();
        System.out.print("Digite o valor da mensalidade: R$");
        novo.vlrMensalidade = Double.parseDouble(ler.nextLine());
        System.out.println("Número da matrícula: " + novo.numMatricula + "\nNome do aluno: " + novo.nomeAluno + "\nValor da mensalidade: R$" + novo.vlrMensalidade);       
    }
}
