/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7.E4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo {

    private int base;
    private int altura;

    private Scanner leer = new Scanner(System.in);

    public Rectangulo() {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        this.base = leer.nextInt();
        this.altura = leer.nextInt();
    }

    public int superficie() {
        int sup = base * altura;
        return sup;
    }

    public int perimetro() {
        int per = (base + altura) * 2;
        return per;
    }

    public String dibujarRectangulo() {
        String nulll="";
        for (int i = 0; i < altura; i++) {
            System.out.print("* ");
            for (int j = 1; j < base; j++) {
                if (i == 0 || i == altura - 1) {
                    System.out.print(" * ");
                } else {
                    if (j != base - 1) {
                        System.out.print("   ");
                    } else {
                        System.out.print(" *");
                    }
                }
            }
            System.out.println("");
        }
        return nulll;
    }
}
