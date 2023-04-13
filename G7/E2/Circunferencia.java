/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7.E2;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
    private double rad;

    public Circunferencia() {
    }

    public Circunferencia(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }
    
    public void crearCircunferencia(double rad){
        this.rad=rad;
    }
    
    public double area(){
        double ar=Math.pow((rad*Math.PI), 2);
    return ar;}
    
    public double perimetro(double rad){
        double per=2*Math.PI*rad;
    return per;}
}
