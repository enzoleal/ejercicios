/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7;

import G7.E2.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class G7E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia circulo= new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia");
        circulo.crearCircunferencia(leer.nextDouble());
        System.out.println("El area del circulo es: " +circulo.area());
        System.out.println("El perimetro del circulo es: " +circulo.perimetro(circulo.getRad()));
    }
    
}
