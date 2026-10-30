package org.generation.interfaces;

import org.generation.entidades.Catalogo;
import org.generation.entidades.Producto;
import org.generation.entidades.ProductoFisico;
import org.generation.entidades.ProductoDigital;
import org.generation.excepciones.OutOfStockException;

public class ProductoApp {

    public static void main(String[] args) {
        //Producto prod1 = new Producto("", 0.0);
        //Producto prod2 = new Producto("toalla", 0.0);
        //Producto prod3 = new Producto("disco", 0.0);

        /*ProductoFisico prod1 = new ProductoFisico("", 0, 0, 0.0);
        ProductoFisico prod2 = new ProductoFisico("Toalla", 50.77, 1, 1);
        ProductoFisico prod3 = new ProductoFisico("Disco", 14.90,20, 0.100);

        ProductoDigital prod4 = new ProductoDigital("", 0.0, "", 0.0);
        ProductoDigital prod5 = new ProductoDigital("Juego", 70.8, "exe", 5.0);
        ProductoDigital prod6 = new ProductoDigital("Album música", 120.33, "mp3", 1.0);*/

        //Esto es polimorfismo
        //REFERENCIA al padre: PRODUCTOS y se crea un hijo (ProductoFisico)
        Producto prod1 = new ProductoFisico("", 0, 0, 0.0);
        Producto prod2 = new ProductoFisico("Toalla", 50.77, 1, 1);
        Producto prod3 = new ProductoFisico("Disco", 14.90,2, 0.100);

        //REFERENCIA al padre: PRODUCTOS y se crea un hijo (ProductoDigital)
        Producto prod4 = new ProductoDigital("", 0.0, "", 0.0);
        Producto prod5 = new ProductoDigital("Juego", 70.8, "exe", 5.0);
        Producto prod6 = new ProductoDigital("Album música", 120.33, "mp3", 1.0);


        prod1.setNombre("");
        prod1.setPrecio(0.0);

        System.out.println("Nombre prod1: " + prod1.getNombre());
        System.out.println("Precio prod1: " + prod1.getPrecio());
        System.out.println("Nombre prod2: " + prod2.getNombre());
        System.out.println("Nombre prod3: " + prod3.getNombre());
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);

        //Probamos el nuevo metodo para mostrar la info de la clase producto
        /*prod1.mostrarInfo();
        prod2.mostrarInfo();
        prod3.mostrarInfo();
        prod4.mostrarInfo();
        prod5.mostrarInfo();
        prod6.mostrarInfo();*/

        //Catalogo
        Catalogo c1 = new Catalogo();

        System.out.println(c1); //Antes de agregar productos

        try {
            ((ProductoFisico) prod3).vender();//1
            ((ProductoFisico) prod3).vender();//0
            ((ProductoDigital) prod5).vender();// Imprime el mensaje de aprobado
            ((ProductoFisico) prod3).vender(); // Manda la excepción: No hay stock
        } catch (OutOfStockException e) { // normalmente es "e" en nombre
            System.out.println(e.getMessage());
        }//cach

        c1.agregarProducto(prod1);
        c1.agregarProducto(prod2);
        c1.agregarProducto(prod3);
        c1.agregarProducto(prod4);
        c1.agregarProducto(prod5);

        //System.out.println(c1); //Despues de agregar productos

        c1.mostrarProductos();

        //Probamos el metodo vendible conviriendolo de Producto -> a productoFisico
        ((ProductoFisico) prod3).vender();//19
        ((ProductoFisico) prod3).vender();//18
        ((ProductoFisico) prod3).vender();//17
        ((ProductoFisico) prod3).vender();//16

        //Probamos el metodo vendible conviriendolo de Producto -> a productoDigital
        ((ProductoDigital) prod5).vender();//
        ((ProductoDigital) prod5).vender();
        ((ProductoDigital) prod5).vender();
        ((ProductoDigital) prod5).vender();

        prod3.mostrarInfo();
        prod5.mostrarInfo();
    }//main
}//class