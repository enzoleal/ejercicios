/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7Ex;

import G7Ex.E3.Juego;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class G7Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea que adivinen y el numero de intentos");
        Juego adivinador=new Juego();
        adivinador.iniciar_juego(leer.nextInt(),leer.nextInt());
        System.out.println("El numero de intentos fue de: "+adivinador.npifiadas);
        System.out.println("El numero de  veces que gano el adivinador es: "+adivinador.wins);
        System.out.println("Y las veces que perdio es de: "+adivinador.lose);
    }
    
}
