package com.visansi.CRUD.model;

import java.util.Objects;

public class User {
    private int id;
    private String nombre;
    private String email;
    private String rol;

    // Constructor
    public User(int id, String nombre, String email, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }

    // Métodos públicos
    public boolean login() {
        // Lógica para iniciar sesión
        System.out.println(nombre + " ha iniciado sesión.");
        return true;
    }

    public void logout() {
        // Lógica para cerrar sesión
        System.out.println(nombre + " ha cerrado sesión.");
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Sobrescribir equals y hashCode para comparar usuarios por ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}