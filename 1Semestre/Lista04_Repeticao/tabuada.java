/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04_Repeticao;

/**
 *
 * @author Tiago
 */
public class tabuada {

    public static void main(String[] args) {
        int contador1 = 1, contador2 = 1;
        while (contador1 <= 10) {
            System.out.println("TABUADA DO NÚMERO " + contador1);
            while (contador2 <= 10) {
                System.out.println("\n" + contador1 + " x " + contador2 + " = " + (contador1 * contador2));
                contador2++;
            }
            System.out.println("");
            contador1++;
            contador2 = 1;
        }
    }
}
