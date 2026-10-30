package com.generation.ecommerce.models;

//POJO - Plan Old Java Object

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto { // siempre deben ir privadas las propiedades
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    //private static Integer total = 0; //total = 0 debe ser statica

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "imagen", nullable = false)
    private String imagen;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "existencias", nullable = false)
    private Integer existencias;

    public Producto(String nombre, String descripcion, String imagen, Double precio, Integer existencias) {
        //Producto.total++; //Incrementamos en 1 el valor actual del total
        //this.id = Producto.total; //guardamos ese valor en el id
        //Se comentan porque ya lo hace sql
        this.nombre = nombre.toUpperCase();
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = (precio < 0) ? 1 :precio;
        this.existencias = (existencias < 0) ? 1 : existencias;
    }//constructor

    public Producto(){}//constructor vacio

    public Integer getId() {
        return id;
    }//get id

    //public static Integer getTotal() {
        //return total;
   // }//getTotal

    public String getNombre() {
        return nombre;
    }//GetNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//SetNombre

    public String getDescripcion() {
        return descripcion;
    }//getDescripcion

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }// setDescripcion

    public String getImagen() {
        return imagen;
    }// getImagen

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }// setImagen

    public Double getPrecio() {
        return precio;
    }// getPrecio

    public void setPrecio(Double precio) {
        this.precio = (precio < 0) ? 1 :precio;
    }// setPrecio

    public Integer getExistencias() {
        return existencias;
    }// getExistencias

    public void setExistencias(Integer existencias) {
        this.existencias = (existencias < 0) ? 1 : existencias;
    }// setExistencias

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", precio=" + precio +
                ", existencias=" + existencias +
                '}';
    }
}//class Producto
