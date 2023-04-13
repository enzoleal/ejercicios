/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7;

import G7.E3.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class G7E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        Operacion op = new Operacion();
        op.setNum1(leer.nextDouble());
        op.setNum2(leer.nextDouble());

        System.out.println("El resultado de la suma es: " + op.sumar(op.getNum1(), op.getNum2()));
        System.out.println("El resultado de la resta es: " + op.resta(op.getNum1(), op.getNum2()));
        System.out.println(op.multiplicar(op.getNum1(), op.getNum2()));
        System.out.println(op.division(op.getNum1(), op.getNum2()));

    }

}
