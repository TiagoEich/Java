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
public class ExemploArray {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int [] listaNum = new int[20];
        for (int i = 0; i < 20; i++) {
            //Atribuindo os valores ao Array
            System.out.print("Digite um número: ");
            listaNum[i] = leitura.nextInt();
        }
        System.out.println("\nVocê digitou os seguintes números: ");
        for (int i = 0; i <listaNum.length; i++) {
            //Mostrando os valores da Array
            System.out.println(listaNum[i]);
        }
    }
}
