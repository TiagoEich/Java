/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author Tiago
 */
public class Exemplo05 {
    public static void main(String[] args) {
            int num [] = new int[20];
            Arrays.fill(num,10);
            for (int valor: num){
                System.out.print(valor+" ");
            }
    }
}
