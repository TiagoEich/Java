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
public class ÁreaCirculo {
    public static void main(String[] args) {
        double pi = 3.141592;
       Scanner circulo = new Scanner(System.in);
        System.out.print("Informe o valor do raio do seu circulo: ");
       double raio = circulo.nextDouble();
        System.out.println("Se o raio do circulo é de"+raio+"então a área é "+(raio*pi));
    }
}
