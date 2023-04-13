/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7;


import G7.E1.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class G7E1 {

    /**
     * @param args the command line arguments
     * Crear una clase llamada Libro que contenga los siguientes atributos: 
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
     * atributos pasados por parámetro y un constructor vacío. Crear un método
     * para cargar un libro pidiendo los datos al usuario y luego informar
     * mediante otro método el número de ISBN, el título, el autor del libro y
     * el número de páginas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo, su autor, el isbn y el num. de paginas respectivamente");
        Libro l1=new Libro( leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextInt() );
        
        System.out.println(l1);
         System.out.println("pero mas mejor libro es:  \n");
         l1.titulo="el rey limon";
         l1.autor="el escribidor";
         l1.isbn=00000001;
         l1.numpag= 3;
         System.out.println(l1);
         
    }
    
}
