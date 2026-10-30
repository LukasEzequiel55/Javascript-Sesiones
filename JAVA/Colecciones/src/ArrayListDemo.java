import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        //Scanner sc = new(Scanner(System.in);
        ArrayList<Integer> numerosPares = new ArrayList();

        //ArrayList vacio
        System.out.println(numerosPares);

        //.add() -> Agrega un nuevo elemento al Arraylist
        numerosPares.add(2);
        numerosPares.add(4);
        numerosPares.add(6);
        numerosPares.add(8);
        numerosPares.add(10);
        numerosPares.add(2);

        //Imprime los números que agregamos
        System.out.println(numerosPares);

        //.remove() -> Elimina un elemento dentro del ArrayList
        //numerosPares.remove((Integer) 4); //Elimina el elemento en la posición 4

        //.size() -> Indica el total de elementos que existen dentro del arreglo
        System.out.println("Total de elementos en numerosPares: " + numerosPares.size());

        // .get() -> Recupera o accede a un elemento dentro de ArrayList
        System.out.println(numerosPares.get(0)); // número 2

        //for tradicional para recorrer el ArrayList
        for(int i = 0; i < numerosPares.size(); i++){
            System.out.println("For original" + numerosPares.get(i));
        }

        //forEach para recorrer el ArrayList
        for (Integer numero: numerosPares){
            System.out.println("forEach" + numero);
        }//forEach

    }//main
}//class
