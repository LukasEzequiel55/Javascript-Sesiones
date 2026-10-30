import java.util.Locale;
import java.util.Scanner;

public class ValidadorAcceso {

    final static String USUARIO_PRUEBA = "@recky59";
    final static String CONTRASENA_PRUEBA = "SuperSafe123";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre: ");
        String usuario = sc.nextLine();

        System.out.println("Ingresa tu contraseña: ");
        String contrasena = sc.nextLine();

        System.out.println("Valor ingresado: " + usuario);
        System.out.println("Usuario normalizado: " + normalizarUsuario(usuario));
        System.out.println("Datos validos?: " + validarAcceso(usuario, contrasena));

        sc.close();
    }//main

    static String normalizarUsuario(String usuario) {
        String usuarioNormalizado = usuario.trim().toLowerCase();
        return usuarioNormalizado;
    }//normalizarUsuario

    //para validar la contraseña y usuarios
    static Boolean validarAcceso(String usuario, String contrasena){
        String usuarioNormalizado = normalizarUsuario(usuario);

        if(usuarioNormalizado.equals(USUARIO_PRUEBA) || !contrasena.equals(CONTRASENA_PRUEBA)) {
            return false;
        }//if
        return true;
    }//validarAcceso
}//class
