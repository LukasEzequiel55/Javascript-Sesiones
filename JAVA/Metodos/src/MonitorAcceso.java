import java.util.Scanner;

public class MonitorAcceso {

    final static String USUARIO_PRUEBA = "ulises";
    final static String CONTRASENA_PRUEBA = "ulises123";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validarCredenciales(sc);
        sc.close();
    }// main

    static void validarCredenciales(Scanner sc) {
        int intento = 0;
        int maxintentos = 3;

        do {
            System.out.println("Ingresa el nombre: ");
            String usuario = sc.nextLine();

            System.out.println("Ingresa tu contraseña: ");
            String contrasena = sc.nextLine();

            if (usuario.equals(USUARIO_PRUEBA) && contrasena.equals(CONTRASENA_PRUEBA)) {
                System.out.println("Acceso permitido");
                break; // Sale del bucle inmediatamente
            } else {
                intento++;
                if (intento < maxintentos) {
                    System.out.println("Las credenciales no coinciden. Te quedan " + (maxintentos - intento) + " intentos\n");
                }
            }
        } while (intento < maxintentos);

        if (intento >= maxintentos) {
            System.out.println("Se ha excedido el número de intentos permitidos. " +
                    "Intentelo de nuevo otro día con más calma");
        }
    }// validarCredenciales
}// clase
