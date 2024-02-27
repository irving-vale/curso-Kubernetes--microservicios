package com.joirv.springcloud.msvc.usuarios.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/*
- Se usa la anotacion @Entity para decir que es una tabla
- Se usa la anotacion @Table si es que queremos agregarle el nombre a la tabla o por defecto se queda con el nombre de la
clase
- es necesario poner un ID con anotacion @Id
- @GenerateValue es necesario para ponerle una estrategia en este caso IDENTITY para que se autoincremente
- @Column sirve para poder agregar instrucciones como en este caso que el email sea unico
- para saber mas opciones en cada anotacion usa control + espacio
- @Data es una anotacion de lombok que nos genera los metodos get, set, equals, hashcode, toString
- @NoArgsConstructor es una anotacion de lombok que nos genera un constructor vacio
- @AllArgsConstructor es una anotacion de lombok que nos genera un constructor con todos los atributos
- @EqualsAndHashCode es una anotacion de lombok que nos genera los metodos equals y hashcode

* */
@Entity
@Table (name = "usuarios")// si queremos cambiar el nombre de la tabla por defecto se queda con el nombre de la clase
// pero si queremos cambiarlo se usa la anotacion @Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para que se autoincremente
    private Long id;

    @NotEmpty  // son solo para tipos de datos String
    private String nombre;

    @Column(unique = true)
    @Email
    private String email;

    @NotEmpty
    private String password;


}

