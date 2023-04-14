package G7Ex.E2;


import java.util.Scanner;


public class Puntos {
    public int x1;
    public int x2;
    public int y1;
    public int y2;

    public Puntos() {
    }

    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
        int cont = 0;
    public void crearPuntos(int x, int y){
        
        System.out.println("Ingrese 2 numeros (x,y)");
        Scanner n = new Scanner(System.in);
        if (cont == 0) {
            x1 = n.nextInt();
            y1 = n.nextInt();
        }else{
            x2 = n.nextInt();
            y2 = n.nextInt();
        }
        cont ++ ;
    }
    
    public double Calcula(){
        
        double distancia = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        
    return distancia;
    }

    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + '}';
    }
    
    
}
    
