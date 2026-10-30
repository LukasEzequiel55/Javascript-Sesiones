package org.generation.entidades;

import org.generation.interfaces.Vendible;

public class ProductoDigital extends Producto implements Vendible {
    private String tipoArchivo;
    private double tamanoArchivo;

    public ProductoDigital(String nombre, double precio, String tipoArchivo, double tamanoArchivo) {
        super(nombre, precio);
        this.tipoArchivo = (tipoArchivo.isBlank()) ? "PDF" : tipoArchivo;
        this.tamanoArchivo = (tamanoArchivo <= 0.0) ? 1.0 : tamanoArchivo;
    }//constructor autogenerado del foquito rojo

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = (tipoArchivo.isBlank()) ? "PDF" : tipoArchivo;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(double tamanoArchivo) {
        this.tamanoArchivo = (tamanoArchivo <= 0.0) ? 1.0 : tamanoArchivo;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("=====Detalles del producto DIGITAL =====");
        System.out.println("Id: " + this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Tipo archivo: " + this.getTipoArchivo());
        System.out.println("Tamaño (mb): " + this.getTamanoArchivo());
        System.out.println("====================================");
    }//override

    @Override
    public void vender() {
        System.out.println("Tu compra fue exitosa. Puedes descargar tu producto");
    }// vender

    @Override
    public String toString() {
        return "ProductoDigital{" +
                "tipoArchivo='" + tipoArchivo + '\'' +
                ", tamanoArchivo=" + tamanoArchivo +
                "} " + super.toString();
    }//to string
}//class
