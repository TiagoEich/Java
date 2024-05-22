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
public class BoasVindas {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = oi.nextLine();
        System.out.print("Informe seu sobrenome: ");
        String sobrenome = oi.nextLine();
        System.out.println("Seja bem-vindo ao Java,"+nome+" "+sobrenome+"!");
    }
}
