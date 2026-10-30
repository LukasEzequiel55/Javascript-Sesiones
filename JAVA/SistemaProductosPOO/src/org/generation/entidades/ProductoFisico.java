package org.generation.entidades;

import org.generation.excepciones.OutOfStockException;
import org.generation.interfaces.Vendible;

//ProductoFisico es UN producto
public class ProductoFisico extends Producto implements Vendible {

    private int cantidad;
    private double peso;

    public ProductoFisico(String nombre, double precio, int cantidad, double peso){
        super(nombre, precio);
        this.cantidad = (cantidad < 0) ? 1 : cantidad;
        this.peso = (peso < 0 ? 1.0 : peso);
    }//constructor

    public double getPeso() {
        return peso;
    }//get peso

    public void setPeso(double peso) {
        this.peso = (peso < 0 ? 1.0 : peso);
    }// setter peso

    public int getCantidad() {
        return cantidad;
    }// get cantidad

    public void setCantidad(int cantidad) {
        this.cantidad = (cantidad < 0) ? 1 : cantidad;
    }// set cantidad

    @Override
    public String toString() {
        return "ProductoFisico{" +
                "cantidad=" + cantidad +
                ", peso=" + peso +
                "} " + super.toString();
    }// to string

    @Override
    public void mostrarInfo() {
        System.out.println("=====Detalles del producto FISICO =====");
        System.out.println("Id: " + this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Existencias: " + this.getCantidad());
        System.out.println("Peso (kg): " + this.getPeso());
        System.out.println("====================================");
    }

    @Override
    public void vender() throws OutOfStockException{

        if (this.getCantidad() > 0){
            this.cantidad -= 1; // cantidad = cantidad -1 Si hay stock lo quito de inventario
            System.out.println("Tu compra fue exitosa."); // Mostrar confirmación
            System.out.println(this.cantidad); // Sirve para depurar
        } else {
            //System.out.println("ERROR: Producto Agotado"); // si es 0 muestro mensaje
            throw new OutOfStockException("ERROR: Producto Agotado");
        }
    }//vender
}//class ProductoFisico
