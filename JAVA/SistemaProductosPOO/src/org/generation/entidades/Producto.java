package org.generation.entidades;

public abstract class Producto {
        //Cambiaron a privado porque la clase podia acceder a ella y las sobreescribia
        //No habia control de lo que puede y no puede hacer esa clase
        private long id;
        private static long total;
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio){
            Producto.total++;
            this.id = Producto.total; // 1
            this.nombre = nombre.isBlank() ? "GENERICO" : nombre.toUpperCase();
            this.precio = (precio <= 0) ? 1.0 : precio;
        }//Constructor Producto

    public long getId() {
        return id;
    }// get ID

    public static long getTotal() {
        return total;
    }// get Total

    public String getNombre() {
        return nombre;
    }//get nombre recupera el nombre de mi objeto

    public void setNombre(String nombre) {
            if (nombre.isBlank()){
                System.out.println("> ERROR: El nombre no puede ir vacio");
            } else {
                this.nombre = nombre.toUpperCase();
            }//else
    }// set nombre guarda el nombre de mi objeto

    public double getPrecio() {
        return precio;
    }// get precio recupera el valor del precio

    public void setPrecio(double precio) {

        if (precio <=0) {
            System.out.println("> ERROR: El precio no puede ser 0 o negativo");
        } else {
            this.precio = precio;
        }//else
    }// set precio definir un nuevo valor de precio con ahora una validación

    /*public void mostrarInfo(){
            System.out.println("=====Detalles del producto =====");
        System.out.println("Id: " + this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("====================================");
    }//mostrar info*/

    //abstracto
    public abstract void mostrarInfo();
        //mostrar info

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }//main
}//class
