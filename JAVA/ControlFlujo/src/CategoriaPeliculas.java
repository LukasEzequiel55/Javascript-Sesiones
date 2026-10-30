import java.util.Locale;
import java.util.Scanner;

public class CategoriaPeliculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Programa de recomendación de pelis por categoria ===");
        System.out.println("Ingresa una categoria valida de la que quisieras una recomendación");
        System.out.print("(drama, comedia, romance, suspenso, terror):");
        String categoria = sc.nextLine();

        switch (categoria.toLowerCase()){
            
            case "drama":
                System.out.println("Te recomendamos: 'The Drama', 'La persona más mala del mundo'");
                break;
            case "comedia":
                System.out.println("Te recomendamos: 'Son como niños', 'Qué pasó ayer?");
                break;
            case "romance":
                System.out.println("Te recomendamos: 'Hipotesis de amor', 'Orgullo y prejuicio'");
                break;
            case "suspenso":
                System.out.println("Te recomendamos: 'Obsession', 'El silencio de los inocentes' ");
                break;
            case "terror":
                System.out.println("Te recomendamos: 'Insaciable', 'El exorcista'");
                break;
            default:
                System.out.println("Categoria no valida, Ingresa una categoría disponible: " + categoria);
        }
        System.out.println("Gracias por usar el sistema de recomendación");
        System.out.println("Vuelve pronto");
        sc.close();
    }//main
}//class
