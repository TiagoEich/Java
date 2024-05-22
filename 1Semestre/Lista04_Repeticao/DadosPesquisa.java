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
public class DadosPesquisa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao, idade = 0, quantia = 0, maior = 0, menor = 0, mulheres = 0;
        double soma = 0, sal = 0, media = 0;
        String sexo = "";
        System.out.println("*** PESQUISA ENTRE OS HABITANTES DA REGIÃO***");
        do {
            System.out.print("\n1: Cadastrar os dados\n2: Sair\nOpção: ");
                   
            opcao = Integer.parseInt(scanner.nextLine());
            if (opcao == 1) {
                System.out.print("Informe a idade: ");
                idade = Integer.parseInt(scanner.nextLine());
                System.out.print("Informe o sexo: ");
                sexo = scanner.nextLine();
                System.out.print("Informe o salário: R$");
                sal = Double.parseDouble(scanner.nextLine());
                quantia++;
                soma = sal + soma;
            }if (maior == 0 || idade > maior) {
                maior = idade;

            } if (menor == 0 || idade < menor) {
                menor = idade;
            }else if (sexo.equals("feminino") || sexo.equals("Feminino") & sal<=1000) {
                mulheres++;
            }
            media = soma / quantia;
        } while (opcao != 2);
            System.out.println("A média do salário é de: R$ "+media);
            System.out.println("A maior idade é: "+maior);
            System.out.println("A menor idade é: "+menor);
            System.out.println("Mulheres com salário abaixo de R$1000,00: "+mulheres);
    }
}

/* Crie um algoritmo que receba os dados de uma pesquisa entre os habitantes de uma
região. Devem ser coletados os dados de idade, sexo (M/F) e salário. 
O algoritmo deve calcular e informar:  
A média de salário do grupo; xxx
A maior e a menor idade do grupo; xxx
A quantidade de mulheres com salário até R$1.000,00. */
