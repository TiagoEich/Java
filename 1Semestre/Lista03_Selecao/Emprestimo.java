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
public class Emprestimo {
    public static void main(String[] args) {
        Scanner emprestimo = new Scanner (System.in);
        System.out.print("Informe o seu salário: ");
        float sal = emprestimo.nextFloat();
        System.out.print("Informe o valor do empréstimo: ");
        float emprest = emprestimo.nextFloat();
        System.out.print("Informe o número de parcelas: ");
        int parcelas = emprestimo.nextInt();
        
        float valorparcelas = emprest/parcelas;
        double valorsalario = sal*0.30;
        if (valorsalario >= valorparcelas) {
            System.out.println("O empréstimo pode ser concedido.");
        }else   System.out.println("O empréstimo não pode ser concedido.");
    }
}
