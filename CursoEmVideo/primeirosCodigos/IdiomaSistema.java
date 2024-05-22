/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirosCodigos;

import java.util.Locale;


/**
 *
 * @author Tiago
 */
public class IdiomaSistema {
    public static void main(String[] args) {
    Locale idioma = Locale.getDefault();
        System.out.println(idioma.getDisplayLanguage());
    }
}