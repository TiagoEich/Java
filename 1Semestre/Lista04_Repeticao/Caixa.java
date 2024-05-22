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
public class Caixa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0.0, valor;
        int i = 1;
        do {
            System.out.print("Informe o valor do "+i+"° produto: ");
            valor = scanner.nextDouble();
            resultado = valor + resultado;
              i++;
        } while (valor > 0);
        System.out.println("O valor final será de: R%" + resultado);
    }
}

/*Desenvolva um algoritmo para automatizar uma rotina de caixa simples. Primeiro, 
receba o valor dos produtos comprados, e realize a soma. A soma deve ser feita 
tantas vezes quantas forem necessárias, até que o usuário digite o número 0. 
Após, deve ser apresentada uma mensagem com o valor total da compra (a soma dos 
valores digitados).*/
