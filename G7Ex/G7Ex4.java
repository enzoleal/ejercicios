/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7Ex;

import G7Ex.E4.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class G7Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titular y el saldo");
        Cuenta c1 = new Cuenta(leer.nextLine(), leer.nextDouble());
        System.out.println("Cuanto desea retirar?");
        c1.retirar_dinero(leer.nextDouble());
    }

}
