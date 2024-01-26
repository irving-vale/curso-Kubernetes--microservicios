package com.joirv.springcloud.msvc.usuarios.models.entity;

import jakarta.persistence.*;

/*
- Se usa la anotacion @Entity para decir que es una tabla
- Se usa la anotacion @Table si es que queremos agregarle el nombre a la tabla o por defecto se queda con el nombre de la
clase
- es necesario poner un ID con anotacion @Id
- @GenerateValue es necesario para ponerle una estrategia en este caso IDENTITY para que se autoincremente
- @Column sirve para poder agregar instrucciones como en este caso que el email sea unico
- para saber mas opciones en cada anotacion usa control + espacio
* */
@Entity
@Table (name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(unique = true)
    private String email;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

