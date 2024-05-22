/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista01_Basico;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class Soma {
    public static void main(String[] args) {
        Scanner resultado = new Scanner(System.in);
        System.out.print("Informe o valor do primeiro valor: ");
        int valor = resultado.nextInt();
        System.out.print("Digite o valor do segundo número:");
        int valor2 = resultado.nextInt();
        System.out.println("A soma entre "+valor+" e "+valor2+" resulta em "+(valor+valor2));
    }
}
