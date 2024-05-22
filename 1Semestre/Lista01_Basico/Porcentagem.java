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
public class Porcentagem {
    public static void main(String[] args) {
        Scanner desconto = new Scanner(System.in);
        System.out.print("Informe o preço de seu produto: ");
        double preco = desconto.nextDouble();
        System.out.print("Informe o valor de desconto: ");
        double porcentagem = desconto.nextDouble();
        System.out.println("Se o produto custava "+preco+" e agora está em "+porcentagem+"% de desconto, então agora o valor é de "+(preco - preco*porcentagem/100));
    }
}
