/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7Ex.E5;

/**
 *
 * @author Usuario
 */
public class Empleado {

    public String nombre;
    public int edad;
    public double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    public double calcular_aumento() {
        double aumento = 0;
        if (edad != 30) {
            if (edad < 30) {
                aumento = salario * 0.05;
            } else {
                aumento = salario * 0.1;
            }
        } else {
            System.out.println("Estas despedido");
        }
        return aumento;
    }

}
