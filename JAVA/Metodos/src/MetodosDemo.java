import java.awt.desktop.SystemSleepEvent;

public class MetodosDemo {
   /* public static void main(String[] args) {
        System.out.println(saludarUsuario("Fer"));
        saludar();
    }//main*/

    //No podemos crar un metodo dentro de otro metodo
    // en este caso el metodo MAIN

    //Metodo no estatico
    String saludarUsuario(String nombre){
        String saludo = "Hola," + nombre + "!";
        return saludo;
    }//SaludarUsuario

    //Metodo no devuelve ningún valor (void)
    //No reciba parámetros
    //Metodo estatico
    static void saludar() {
        System.out.println("Buenos días/tardes/noches");
    }//saludar

}// clase
