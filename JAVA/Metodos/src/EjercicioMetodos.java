import java.util.Scanner;

public class EjercicioMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //llamar a los metodos
        velocidad(5, 3);
        volumen(5);
    }//main
    public static double velocidad(double distancia, double tiemposeg) {
        double vel = distancia / tiemposeg;
        System.out.println("La velocidad del objeto es: " + vel);
        return vel;
    }//velocidad
    public static double volumen(double diametro) {
        double pi = 3.14;
        double radio = diametro / 2;
        double vol = (4.0 / 3.0) * pi * (radio * radio * radio);
        System.out.println("El volumen de la esfera es: " + vol);
        return vol;
    }//volumen
}//class
