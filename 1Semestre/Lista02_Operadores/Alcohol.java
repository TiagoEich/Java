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
public class Alcohol {
    public static void main(String[] args) {
     Scanner funcione = new Scanner(System.in);
        System.out.print("Informe seu ano de nascimento: ");
        int nasc = funcione.nextInt();
        int idade = 2024 - nasc;
        System.out.println("Você tem "+idade+" anos de idade!");
          
        if (idade >=18) {
            System.out.println("Venda de bebidas alcóolicas liberada!");
        }else   System.out.println("Proibido a venda de bebidas alcóolicas para menores de idade!");
    }
}
