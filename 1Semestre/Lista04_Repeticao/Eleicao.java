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
public class Eleicao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int wz = 0, sd = 0, ck = 0, migos = 0, nulo = 0, branco = 0;
        System.out.println("*** ELEIÇÃO PRESIDENCIAL ***\n");
        do {
            System.out.print("1: Wiz Khalifa\n2: Snoop Dogg\n3: Chief Keef\n4: "
                    + "Migos\n5: Voto nulo\n6: Voto em branco\n0: Sair\nOpção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            if (opcao > 6 || opcao < 0) {
                System.out.println("\nInforme uma opção válida!\n\n");
            } else if (opcao == 1) {
                wz++;
                System.out.println("\n\n");
            } else if (opcao == 2) {
                sd++;
                  System.out.println("\n\n");
            } else if (opcao == 3) {
                ck++;
                  System.out.println("\n\n");
            } else if (opcao == 4) {
                migos++;
                  System.out.println("\n\n");
            } else if (opcao == 5) {
                nulo++;
                  System.out.println("\n\n");
            } else if (opcao == 6) {
                branco++;
                  System.out.println("\n\n");
            } else if (opcao == 0) {
                System.out.println("Votos em Wiz Khalifa: " + wz);
                System.out.println("Votos em Snoop Dogg: " + sd);
                System.out.println("Votos em Chief keef: " + ck);
                System.out.println("Votos em Migos: " + migos);
                System.out.println("Votos nulos: " + nulo);
                System.out.println("Votos em branco: " + branco);
            }
        } while (opcao != 0);

    }
}


/*Em uma eleição presidencial existem quatro candidatos. Os votos são informados
através de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:  
- 1,2,3,4 = voto para os respectivos candidatos;
- 5 = voto nulo;
- 6 = voto em branco;

Elabore um algoritmo que leia o código do candidato em um voto. Calcule e apresente na tela:
O total de votos para cada candidato;
O total de votos nulos;
total de votos em branco;
Como finalizador do conjunto de votos, tem-se o valor 0.*/
