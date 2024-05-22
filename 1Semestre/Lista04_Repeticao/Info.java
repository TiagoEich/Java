/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04_Repeticao;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
     int quantidade = 0, mulheres = 0;
        double altura = 0, maior = 0, menor = 0, media = 0, soma = 0, somaMulheres = 0, mediaMulheres = 0;
        String sexo = "";

        for (int i = 0; i < 50; i++) {
            System.out.print("Informe a altura da pessoa: ");
            altura = Double.parseDouble(scanner.nextLine());
            System.out.print("Informe o sexo da pessoa: ");
            sexo = scanner.nextLine();
            System.out.println("");
            soma += altura;
            quantidade++;

            if (i == 0 || altura > maior) {
                maior = altura;
            }

            if (i == 0 || altura < menor) {
                menor = altura;
            }

            if (sexo.equalsIgnoreCase("feminino")) {
                somaMulheres += altura;
                mulheres++;
            }
        }

        media = soma / quantidade;
        mediaMulheres = somaMulheres/mulheres;
        System.out.println("\n\nA maior altura é: " + maior);
        System.out.println("A menor altura é: " + menor);
        System.out.println("A média da altura das mulheres é: " + mediaMulheres);
        System.out.println("A média da altura da turma é: " + media);
    }
}


 /*Escrever um algoritmo que leia um conjunto de 50 informações contendo, 
cada uma delas, a altura e o sexo de uma pessoa (código=1, masculino código=2, 
feminino), calcule e mostre o seguinte:  
a maior e a menor altura da turma;
a média da altura das mulheres;
a média da altura da turma. */
