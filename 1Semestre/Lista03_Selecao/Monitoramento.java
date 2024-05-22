/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03_Selecao;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class Monitoramento {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int opcao;
        float imc = 0, totalcalorias = 0;
        do {
            System.out.println("1- Calcular o Imc\n2- Monitorar calorias\n3- Encerrar o programa");
            opcao = valor.nextInt();
            switch (opcao) {
                case 1:
                    if (opcao == 1) {
                        System.out.print("\nInforme seu peso: ");
                        float peso = valor.nextFloat();
                        System.out.print("Informe sua altura: ");
                        float altura = valor.nextFloat();
                        imc = peso / (altura * altura);
                        System.out.println("\nSeu IMC é " + imc + "\n");

                        break;

                    }
                case 2:
                    if (opcao == 2) {
                        System.out.print("\nInforme o número de refeições no dia: ");
                        int refeicoes = valor.nextInt();
                        for (int i = 1; i <= refeicoes; i++) {
                            System.out.print("Informe o valor de calorias na " + i + "° refeição: ");
                            float calorias = valor.nextFloat();
                            totalcalorias = refeicoes + calorias;
                        }                            System.out.println("\nCalorias consumidas: "+totalcalorias+"\n");
                        break;
                    }
                case 3:
                    if (opcao == 3) {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\nObrigado por usar nosso programa!\n\nSeu IMC: " + imc+"!");
                        if (imc < 18.5) {
                            System.out.println("Seu estado de saúde: Abaixo do peso!");
                        } else if (imc >= 18.5 && imc < 25) {
                            System.out.println("Seu estado de saúde: Peso saudável!");
                        } else if (imc >= 25 && imc < 30) {
                            System.out.println("Seu estado de saúde: Sobrepeso!");
                        } else if (imc >= 30) {
                            System.out.println("Seu estado de saúde: Obeso!");
                        }
                        System.out.println("Calorias consumidas hoje: " + totalcalorias + "\n\nAté logo!\n\n");
                    }
            }
        } while (opcao != 3);
    }
}
