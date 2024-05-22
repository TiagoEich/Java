/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Tiago
 */
public class Exemplo02 {
    public static void main(String[] args) {
        String mes []= {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i <mes.length; i++) {
            System.out.println(mes[i]+" tem "+tot[i]+" dias.");
        }
    }
}
