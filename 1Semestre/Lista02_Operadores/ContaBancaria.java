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
public class ContaBancaria {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);
        System.out.print("Informe seu saldo bancário: R$");
        double saldo = conta.nextDouble();
        System.out.print("Informe agora o valor de sua compra: ");
        double valor = conta.nextDouble();
        System.out.println("**Lembrando que você ainda tem um saldo de R$500,00 disponível.\n\n");
        double total = 500 + saldo - valor;
               if (total >=0) {
                   System.out.println("Compra efetuada.");
        }else   System.out.println("Compra não realizada.");
 
    }
}
