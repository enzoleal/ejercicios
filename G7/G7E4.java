/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7;

import G7.E4.Rectangulo;

/**
 *
 * @author Usuario
 */
public class G7E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec= new Rectangulo();
        System.out.println("Ingrese la base y la altura del rectangulo");
        rec.crearRectangulo();
        System.out.println("LA superficie del rectangulo es: "+rec.superficie());
        System.out.println("El perimetro del rectangulo es: " +rec.perimetro());
        System.out.println("y se ve asi: " );
        System.out.println(rec.dibujarRectangulo());
    }
    
}
