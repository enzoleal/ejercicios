/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7Ex;

import G7Ex.E5.Empleado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class G7Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos del empleado");
        Empleado emp=new Empleado();
        System.out.print("Nombre: ");
        emp.nombre=leer.nextLine();
        System.out.print("Edad: ");
        emp.edad=leer.nextInt();
        System.out.print("Salario: ");
        emp.salario=leer.nextDouble();
        
        System.out.println("A continuacion se calculara el aumento: ");
        emp.calcular_aumento()  ;
        System.out.println("El aumento es de " +emp.calcular_aumento() +"$"  );
    }
    
}
