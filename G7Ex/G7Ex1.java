/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7Ex;

import G7Ex.E1.Cancion;
import java.util.Scanner;

/**Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá definir además dos constructores: uno vacío que inicializa el 
 * título y el autor a cadenas vacías y otro que reciba como parámetros el 
 * título y el autor de la canción. Se deberán además definir los métodos 
 * getters y setters correspondientes.
 *
 * @author Usuario
 */
public class G7Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion musiquita= new Cancion();
        System.out.println(musiquita);
        System.out.println("Ingrese el titulo de la cancion");
        musiquita.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la cancion");
        musiquita.setAutor(leer.nextLine());
        System.out.println(musiquita);
    }
    
}
