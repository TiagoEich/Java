/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_0803;

/**
 *
 * @author 23200041
 */
public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;
    public void sacar (double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
}
