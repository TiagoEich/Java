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
public class IdadeVotar {
    public static void main(String[] args) {
        Scanner idade = new Scanner (System.in);
        System.out.print("Informe o ano atual: ");
        int atual = idade.nextInt();
        System.out.print("informe o seu ano de nascimento: ");
        int nasc = idade.nextInt();
        int total = atual - nasc;
        System.out.println("Você tem " +total+ " anos de idade.\n");
        if (total >= 16) {
            System.out.println("Você já pode votar!");
        }else   System.out.println("Faltam "+(16-(atual-nasc))+" anos para você poder votar.");
    }
}
