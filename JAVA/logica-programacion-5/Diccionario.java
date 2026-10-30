package practicasjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {
	public static void main(String[] args) {

	    //Diccionario español - ingles
	    Map<String, String> diccionario = new HashMap<>();
	    //1
	    diccionario.put("calabaza", "pumpkin");
	    //2
	    diccionario.put("calavera", "skull");
	    //3
	    diccionario.put("flores", "flowers");
	    //4
	    diccionario.put("fotos", "photos");
	    //5
	    diccionario.put("comida", "food");
	    //6
	    diccionario.put("papel picado", "perforated paper");
	    //7
	    diccionario.put("mandarina", "tangerine");
	    //8
	    diccionario.put("pan de muerto", "bread of the dead");
	    //9
	    diccionario.put("cempasúchil", "marigold");
	    //10
	    diccionario.put("ofrenda", "offering");
	    //11
	    diccionario.put("calaverita de azúcar", "sugar skull");
	    //12
	    diccionario.put("velas", "candles");
	    //13
	    diccionario.put("altar", "altar");
	    //14
	    diccionario.put("familia", "family");
	    //15
	    diccionario.put("recuerdos", "memories");
	    //16
	    diccionario.put("tradición", "tradition");
	    //17
	    diccionario.put("celebración", "celebration");
	    //18
	    diccionario.put("espíritus", "spirits");
	    //19
	    diccionario.put("panteon", "cemetery");
	    //20
	    diccionario.put("cultura", "culture");

	    List<String> palabras = new ArrayList<>(diccionario.keySet());
	    Collections.shuffle(palabras);

	    // Al azar, 5 palabras
	    List<String> palabrasSeleccionadas = palabras.subList(0, 5);

	    Scanner scanner = new Scanner(System.in);
	    int correctos = 0;
	    int incorrectos = 0;

	    System.out.println("Diccionario Español - Inglés");
	    System.out.println("Traduce las siguientes palabras al inglés:");

	    for (int i = 0; i < palabrasSeleccionadas.size(); i++) {
	        String palabra = palabrasSeleccionadas.get(i);
	        System.out.print((i + 1) + ". " + palabra + ": ");
	        String respuesta = scanner.nextLine();

	        if (respuesta.equalsIgnoreCase(diccionario.get(palabra))) {
	            System.out.println("¡Correcto!");
	            correctos++;
	        } else {
	            System.out.println("Incorrecto. La traducción correcta es: " + diccionario.get(palabra));
	            incorrectos++;
	        }
	    }
	    System.out.println("Resultados:");
	    System.out.println("Correctos: " + correctos);
	    System.out.println("Incorrectos: " + incorrectos);
	}
}