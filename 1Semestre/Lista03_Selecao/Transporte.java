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
public class Transporte {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.print("Informe quantos quilômetros você planeja andar:");
        float km = info.nextFloat();
        
        if (km  <5) {
            System.out.println("Você pode optar em ir a pé ou de bicicleta!");
        }else if (km >=5 && km <20) {
            System.out.println("Você pode optar por ir de carro ou ônibus!");
        }else   System.out.println("Você pode optar por ir de ônibus, carro ou aviâo.");
    }
}
