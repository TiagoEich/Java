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
public class ÁreaRetângulo {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);
        System.out.print("Informe o valor da base do retângulo:");
        float base = area.nextFloat();
        System.out.print("Agora informe o valor da altura do retângulo:");
        float altura = area.nextFloat();
        System.out.println("Se a base é de "+base+" e altura de" +altura+" o resultado é "+(base*altura)+"\n");
    }
}
