/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista05_Vetor;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double [] notas = new double[10];
        double soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe a nota do "+(i+1)+"° aluno: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma/10;
        System.out.println("A média das notas é de "+media);
    }
}
