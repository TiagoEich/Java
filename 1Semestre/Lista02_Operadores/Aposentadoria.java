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
public class Aposentadoria {
    public static void main(String[] args) {
        Scanner aposentadoria = new Scanner (System.in);
        System.out.println("***DESCUBRA SE VOCÊ TEM IDADE PARA SE APOSENTAR***\n");
        System.out.print("Informe o seu ano de nascimento:");
        int ano = aposentadoria.nextInt();
        int total = 2024 - ano;
                System.out.println("Você tem "+ total+ " anos de idade.");
                if (total >=65) {
                    System.out.println("Você já tem idade para se aposentar");
        }else   System.out.println("Você ainda não tem idade para se aposentar");
    }
}
