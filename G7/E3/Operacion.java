/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7.E3;

/**
 *
 * @author Usuario
 */
public class Operacion {
    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Operacion() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public void crearOperacion(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public double sumar(double num1, double num2) {
        double suma = num1 + num2;
        return suma;
    }
    public double resta(double num1, double num2) {
        double resta = num1 - num2;
        return resta;
    }
    public double multiplicar(double num1, double num2) {
        double multp;
        if (num1 == 0 || num2 == 0) {
            multp = 0;
            System.out.print("Error no se debe multiplicar por ");
        }else {
        multp = num1 * num2;
        System.out.print("El resultado de la multiplcacion es: ");
    }
        return multp;
    }
    public double division(double num1, double num2) {
        double division;
        if (num1 == 0 || num2 == 0) {
            division = 0;
            System.out.print("Error no se puede dividir por: ");
        }else {
        division = num1 / num2;
            System.out.print("El resultado de la division es: ");
    }
        return division;
    }
}
