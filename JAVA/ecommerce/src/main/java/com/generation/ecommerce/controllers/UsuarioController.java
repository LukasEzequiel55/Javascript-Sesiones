package com.generation.ecommerce.controllers;

import com.generation.ecommerce.dtos.PasswordDto;
import com.generation.ecommerce.models.Usuario;
import com.generation.ecommerce.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/ecommerce/usuarios/")
public class UsuarioController {
    private final UsuarioService service;
    @Autowired// -> Gestiona la inyección de dependencias de forma automatica
    // -> INICIO CONSTRUCTOR PARA  UsuarioController
    public UsuarioController(UsuarioService service){
        this.service = service;
    }// fin constructor

    @GetMapping
    public List<Usuario> getUsuarios(){
        return service.getUsuarios();
    }// getUsuarios

    @GetMapping("{id}")
    public Usuario getUsuario(@PathVariable Integer id){
        return service.getUsuario(id);
    }// getUsuario

    // borrar un usuario con metodo delete
    @DeleteMapping("{id}")
    public Usuario deleteUsuario(@PathVariable Integer id){
        return service.deleteUsuario(id);
    }// deleteUsuario

    // agregar un usuario
    @PostMapping
    public  Usuario addUsuario(@RequestBody Usuario usuario){ // -> Solicita los datos del usuario en el cuerpo de la solicitud en formato JSON
        return  service.addUsuario(usuario);
    }// fin addUsuario

    // editar un usuario
    @PutMapping("{id}")
    public Usuario updateUsuario(@PathVariable Integer id,
                                 @RequestBody PasswordDto dto){
        return service.updateUsuario(id, dto);
    }// updateUsuario
}// fin class UsuarioController;

