/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7Ex;
import G7Ex.E2.Puntos;
import java.util.Scanner;

/*
    Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
    sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
    objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
    números y los ingresa en los atributos del objeto. Después, a través de otro
    método calcular y devolver la distancia que existe entre los dos puntos que 
    existen en la clase Puntos. 
*/
public class G7Ex2 {
    public static void main(String[] args) {
        Puntos p1 = new Puntos();
        p1.crearPuntos(2,3);
        p1.crearPuntos(6,1);
        System.out.println("La distancia es: "+p1.Calcula());
        System.out.println(p1);
    }
    
}
