import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Double> listaCompras = new HashMap<>();

        //put(clave, valor) -> Agrega un nuevo elemento al HasjMap
        listaCompras.put("Libreta", 35.1);
        listaCompras.put("Lapices", 20.2);
        listaCompras.put("Almohada", 119.5);
        listaCompras.put("Agua", 50.0);

        System.out.println(listaCompras);
        System.out.println(listaCompras.keySet()); //Libreta, Lapices, Almohada, Agua
        System.out.println(listaCompras.values()); // 35, 20, 119.5, 50

        //Recorrer cada elemento key(claves) del array
        for(String key: listaCompras.keySet()) {
            System.out.println(key.toUpperCase());
        }//forEach key

        //Recorrer cada elemento valor(value) del array
        for (Double valor: listaCompras.values()) {
            System.out.println(valor);
        }//forEach value
    }//main
}//class HashMapDemo
