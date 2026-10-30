import java.util.Scanner;

public class Descuento {
    static void main(String[] args) {
        //Creamos Scanner para leer los inputs
        Scanner sc = new Scanner(System.in);
        //precio del producto

        System.out.print("Ingresa el precio del producto");
        double precio = sc.nextDouble(); // Recibe el dato (solo guarda el número)

        sc.nextLine();// Hace un enter o salto de linea

        //Segundo dato: Código
        System.out.print("Ingresa el código de descuento: ");
        String codigo = sc.nextLine();
        //El metodo "next" solo toma un string de la linea

        double precioFinal;
        boolean codigoValido;
        double descuento =0.10;
        //Lógica del programa
        System.out.println("=== Detalle de compra ===");
        //Validación: No pasa si el precio es negativo o mayor igual a 0
        if(precio < 0 || codigo.isBlank()){
            System.out.println("ERROR: Los datos que ingresaste tienen un formato incorrecto. Intentalo de nuevo");
        } else {
            if( codigo.equals("DESCUENTO10")){
                precioFinal = precio - (precio * descuento);
                codigoValido = true;
            } else {
                precioFinal = precio;
                codigoValido = false;
            }//Código equals("DESCUENTO10")
            System.out.println("Precio original: " + precio);
            System.out.println("Código ingresado: " + codigo);
            System.out.println("Es válido: " + codigoValido);
            System.out.println("Precio final: $" + precioFinal + " mxn");
            System.out.println("Gracias por tu compra. Buen día");
        }// else

    }//main
}//class
