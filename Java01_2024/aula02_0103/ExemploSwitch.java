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
public class ExemploSwitch {
    public static void main(String[] args) {
        char opcao ='c';
        String selecao = "Você selecionou ";
        switch (opcao){
            case 'a':
                selecao += 'a'; //selecao=selecao+'a'
                break;
            case 'b':
                selecao += 'b';
                break;
            case 'c':
                selecao += 'c';
                break;
            default:
                selecao += "uma opção inválida";
        }
        System.out.println(selecao);
    }
}
