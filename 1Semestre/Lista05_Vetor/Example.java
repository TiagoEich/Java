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
public class Example {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int[] listaNum = new int[20];
        for (int i = 0; i < 20; i++){
            System.out.print("Digite um numero ["+(i+1) +"]: ");
            listaNum[i]=leitura.nextInt();
            }
        System.out.println("\nVocê digitou os Seguintes Numeros");
        for (int i = 0; i < listaNum.length; i++) {
            System.out.println(listaNum[i]);
        }   }
}
