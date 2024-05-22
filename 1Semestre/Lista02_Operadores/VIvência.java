/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista02_Operadores;

import java.util.Scanner;

/**
 *
 * @author Tiago
 */
public class VIvência {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("Informe o ano atual: ");
        int ano = a.nextInt();
        System.out.print("Informe o seu ano de nascimento: ");
        int nasc = a.nextInt();
        int total = ano - nasc;
        System.out.println("Idade em anos: " + total);
        System.out.println("Idade em mêses: " + total * 12);
        System.out.println("Idade em semanas: " + total * 52);
        System.out.println("Idade em dias: " + total * 365);
    }
}
