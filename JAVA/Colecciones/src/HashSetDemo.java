import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> marcas = new HashSet<>();

        //.add() -> agregar nuevos elementos
        marcas.add("Xiaomi");
        marcas.add("LG");
        marcas.add("Sony");
        marcas.add("Apple");
        marcas.add("Asus");
        marcas.add("Sony"); // No da error, pero lo ignora
        marcas.add("Microsoft");

        //.remove()
        marcas.remove("LG");

        //Buscaremos el objeto para saber si existe
        //Ya que no hay posiciones
        if(marcas.contains("Apple")) {
            System.out.println("Si existe");
        } else {
            System.out.println("No existe");
        } // else
        System.out.println(marcas);

        //Imprime los elementos del arreglo sin ordenar no permite duplicados
        System.out.println(marcas);

        //Imprimirlos atraves de un forEach con uppercase
        for (String marca:marcas){
            System.out.println(marca.toUpperCase());
        }//forEach
    }//main
}//class HashSetDemo
