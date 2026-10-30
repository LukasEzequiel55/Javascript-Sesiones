import java.util.Scanner;

public class CalculadoraPedido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double descuento = 0.10;

        System.out.println("Ingresa el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.println("Ingresa la cantidad del producto: ");
        double cantidad = sc.nextDouble();

        //tengo que llamarlos
        double subtotal = subTotal(precio, cantidad);
        double total = calcularTotal(subtotal, descuento);

        System.out.println("El total de su compra fue: $" + total + "MXN");

        sc.close();
    }//main

    static double subTotal(double precio, double cantidad) {
        return precio * cantidad;
    }//subtotal

    static double calcularTotal(double subtotal,double descuento) {
        double totalFinal; //declararla vacia
        if (subtotal >= 1000) {
            double aplicaDescuento = subtotal * descuento;
            totalFinal = subtotal - aplicaDescuento;
            System.out.println("El subtotal de su compra fue de: $" + subtotal);
            System.out.println("Felicidades por esta compra usted obtuvo un descuento de: $" + aplicaDescuento);
        } else {
            totalFinal = subtotal;
        }//IF
        return totalFinal;
    }//calcularTotal
}//class
