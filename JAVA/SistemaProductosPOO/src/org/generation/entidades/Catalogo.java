package org.generation.entidades;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Producto> productos;

    public Catalogo(){
        this.productos = new ArrayList<>();
    }//constructor Se crea hasta que se usa en este constructor

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void mostrarProductos() {
        for(Producto producto: this.productos){
        producto.mostrarInfo();
        }//forEach
    }//mostrarProductos
        @Override
    public String toString() {
        return "Catalogo{" +
                "productos=" + productos +
                '}';
    }
}//Catalogo
