package com.generation.ecommerce.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, unique = true)
    private Integer id;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name="password", nullable = false, length = 60)
    private String password;

    // CONSTRUCTOR
    public Usuario(String email, String password) {
        this.email = email.toLowerCase();
        this.password = password;
    }// constructor

    public Usuario(){}// CONSTRUCTOR VACÍO

// MÉTODOS GET Y SET

    public Integer getId() {
        return id;
    }// getId

    public String getEmail() {
        return email;
    }// getEmail

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }// setEmail

    public String getPassword() {
        return password;
    }// getPassword

    public void setPassword(String password) {
        this.password = password;
    }// setPassword

    // METODO TO STRING
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id+
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    } // FIN TO STRING
} // fin Usuario



