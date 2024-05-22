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
public class Média {
    public static void main(String[] args) {
        Scanner resultado = new Scanner(System.in);
        System.out.print("Informe o valor do primeiro número:");
        float valor1 = resultado.nextFloat();
        System.out.print("Informe o segundo valor:");
        float valor2 = resultado.nextFloat();
        System.out.print("Informe o valor do terceiro número:");
        float valor3 = resultado.nextFloat();   
        System.out.print("A média entre os valores "+valor1+","+valor2+" e "+valor3+" é de "+((valor1+valor2+valor3)/3));
    }
}
