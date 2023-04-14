/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7Ex.E3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Juego {

    public int nadivinar;
    public int nintentos;
    public int wins = 0;
    public int lose = 0;
    public int npifiadas;
    private Scanner leer = new Scanner(System.in);

    public Juego() {
    }
    
    

    public void iniciar_juego(int nadivinar, int nintentos) {
           npifiadas=0;
        for (int i = 1; i <= nintentos; i++) {
            System.out.println("Ingrese un numero del 1 al 20");
            int n=leer.nextInt();
            if (n == nadivinar) {
                System.out.println("Bien ahiii!!! ganaste!!!");
                wins++;
                System.out.println("------------------------");
                npifiadas+= 1;
                break;
            } else {
                if(nadivinar<n){
                    System.out.println("Mas bajo");
                }else{
                    System.out.println("Mas alto");
                }
                
                if (i == nintentos) {
                    lose+= 1;
                    npifiadas++;
                    System.out.println("Te quedaste sin intentos... gg izi");
                    
                    System.out.println("-------------------------------");
                    
                } else {
                    System.out.println("MUERTO!!! vuelva a intentarlo");
                    System.out.println("-------------------------------");
                    npifiadas+=1;
                }
                
            }
        }

    }
}
