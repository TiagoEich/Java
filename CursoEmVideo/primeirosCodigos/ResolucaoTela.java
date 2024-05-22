/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirosCodigos;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Tiago
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension dimensao = tool.getScreenSize();
        System.out.println("A resolução da tela é " + dimensao.width + "x" + dimensao.height);
    }
}
