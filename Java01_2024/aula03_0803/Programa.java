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
public class Programa {

    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.dono = "Tiago Backes";
        minhaConta.numero = 1512;
        minhaConta.saldo = 1532.34;
        minhaConta.limite = 5000;
        System.out.println("A conta de " + minhaConta.dono + " - numero: " + minhaConta.numero + " tem saldo R$" + minhaConta.saldo);
    minhaConta.sacar(15.25);
    System.out.println("A conta de " + minhaConta.dono + " - numero: " + minhaConta.numero + " tem saldo R$" + minhaConta.saldo);
    }
}
