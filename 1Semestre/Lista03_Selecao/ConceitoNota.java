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
public class ConceitoNota {
    public static void main(String[] args) {
        Scanner nota = new Scanner (System.in);
        System.out.print("Informe a sua primeira nota: ");
        float nota1 = nota.nextFloat();
        System.out.print("Informe a sua segunda nota:");
        float nota2 = nota.nextFloat();
        System.out.print("Informe a sua terceira nota: ");
        float nota3 = nota.nextFloat();
        float total = (nota1+nota2+nota3)/3;
        System.out.println("Sua média final é "+total);
        
        if (total <3) {
            System.out.println("Conceito E");
        }else if (total >=3 && total <6) {
            System.out.println("Conceito D");
        }else if (total >=6 && total <8) {
            System.out.println("Conceito C");
        }else if (total >= 8 && total <10) {
            System.out.println("Conceito B");
        }else   System.out.println("Conceito A");
    }
}
