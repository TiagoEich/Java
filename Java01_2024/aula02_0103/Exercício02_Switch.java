/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02_0103;

/**
 *
 * @author Tiago
 */
public class Exercício02_Switch {
    public static void main(String[] args) {
        int nota =6;
        String texto = "O seu conceito é ";
        switch (nota) {
            case 10:
                texto += "Excelente";
                break;
            case 9:
                texto = texto + "Otimo";
                break;
            case 8:
                texto = texto + "Bom";
                break;
            case 7:
                texto = texto + "Satisfatorio";
                break;
            default:
                texto = texto + "Regular";
                break;
        }
        System.out.println(texto);
    }
}
