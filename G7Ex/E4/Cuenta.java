/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7Ex.E4;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular , double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public double retirar_dinero(double dinero){
       // System.out.println(dinero);
       // System.out.println(saldo);
        if (dinero<=saldo) {
            saldo-= dinero;
            System.out.println("usted ha retdado dinero");
        }else{
            System.out.println("su saldo es insuficiente para realizar este retiro");
        }
        System.out.println("su saldo es de " +saldo +"$");
    return this.saldo;}
    
}
