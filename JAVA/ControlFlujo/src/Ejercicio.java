import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Maquina procesadora de registros==");
        System.out.println("Inserta el número de registros a procesar");
        int registros = sc.nextByte();
        int contador = 0;

        do {
            System.out.println("Proceso registrado " + (contador + 1));
            contador++;
        } while (contador < registros); //
        System.out.println("Todos los procesos han sido procesados con éxito");
        sc.close(); //Cerrar siempre al final
    }
}
