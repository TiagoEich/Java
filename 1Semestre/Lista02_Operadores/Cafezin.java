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
public class Cafezin {
    public static void main(String[] args) {
        Scanner cafe = new Scanner(System.in);
        System.out.print("Informe a temperatura do seu café: ");
        float temperatura = cafe.nextFloat();
        if (temperatura >=60) {
            System.out.println("Está pronto para ser consumido! ");
          
            
        }else  System.out.println("A temperatura do café ainda está muito baixa para ser consumida!");
    }
}
