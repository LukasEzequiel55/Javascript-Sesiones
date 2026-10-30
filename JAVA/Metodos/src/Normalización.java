import java.util.Locale;
import java.util.Scanner;

public class Normalización {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre: ");
        String usuario = sc.nextLine();

        System.out.println("Valor ingresado: " + usuario);
        System.out.println("Usuario normalizado: " + normalizarUsuario(usuario));

        sc.close();
    }//main

    static String normalizarUsuario(String usuario) {
        String usuarioNormalizado = usuario.trim().toLowerCase();
        return usuarioNormalizado;
    }//normalizarUsuario
}//class
