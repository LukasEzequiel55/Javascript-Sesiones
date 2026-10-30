package com.generation.ecommerce.controllers;

import com.generation.ecommerce.models.Producto;
import com.generation.ecommerce.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ecommerce/productos/")
public class ProductoController {

    private final ProductoService service;

    @Autowired // Gestiona la inyección de dependencias de forma automatica
    public ProductoController(ProductoService service) {
        this.service = service; // new ProductService Al parecer es gestionado por SpringBoot con Autowired
    }//Constructor

    @GetMapping
    public List<Producto> getProductos(){ // lista de productos
        return service.getProductos();
    }//getProductos

    @GetMapping("{id}") //Lista de producto singular
    public Producto getProducto(@PathVariable Integer id){
        return service.getProducto(id);
    }//getProducto

    @DeleteMapping("{id}")
    public Producto deleteProducto(@PathVariable Integer id){
        return service.deleteProducto(id);

    }//deleteProducto

    @PostMapping
    public Producto addProducto(@RequestBody Producto producto){
        return service.add(producto);
    }//addProduct
    @PutMapping("{id}")
    public Producto updateProducto(@PathVariable Integer id,
                                   @RequestParam(required = false) String nombre,
                                   @RequestParam(required = false) String descripcion,
                                   @RequestParam(required = false) String imagen,
                                   @RequestParam(required = false) Double precio,
                                   @RequestParam(required = false) Integer existencias){ //Solicita los datos por actualizar en la URL de la solicitud.
        return service.updateProducto(id, nombre, descripcion, imagen, precio, existencias);
    }//updateProducto
}//Class ProductoController

