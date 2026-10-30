import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        byte[] lecturas = {5, 12, -3, 8, 0, -1, 14};
        byte contador = 0;
        //Registros sin errores
        System.out.println("Registros sin errores");
        for (byte lectura : lecturas) {
         if (lectura >= 0) {
                System.out.println(lectura);
            } else {
             contador++;
         }
        } System.out.println("Total de errores: " + contador);

        Scanner sc = new Scanner(System.in);
    }//main
}//class
