public class Ejercicio2 {
    public static void main(String[] args) {
    //cuenta de restaurante
        double hamburguesa = 80.50;
        double papas = 25.50;
        double refresco = 20.0;

        double subtotal = hamburguesa + papas + refresco;
        double descuento = 0.15;
        double propina = .10;

        double montoDescuento = subtotal * descuento;
        double subtotalConDescuento = subtotal - montoDescuento;
        double montoPropina = subtotalConDescuento * propina;
        double totalFinal = subtotalConDescuento + montoPropina;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Usted ahorró: -" + montoDescuento);
        System.out.println("Subtotal con descuento: " + subtotalConDescuento);
        System.out.println("Gracias por su Propina (10%): " + montoPropina);
        System.out.println("Total final: " + totalFinal);
    }//class
} // main