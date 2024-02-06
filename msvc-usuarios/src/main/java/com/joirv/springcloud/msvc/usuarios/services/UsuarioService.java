package com.joirv.springcloud.msvc.usuarios.services;

import com.joirv.springcloud.msvc.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;
// es una interface que nos da metodos para poder hacer el crud, se crea una interface para poder implementarla en una clase implementacion
// no hacemos la logica en service lo dividimos en interface y una clase que implemente esa interface por si queremos cambiar la logica  en el futuro
// tambien es una buena practica para poder hacer pruebas unitarias en el futuro  y poder hacer mock de la interface y poder hacer pruebas unitarias
// si hacemos la logica directamente en el service no podriamos hacer pruebas unitarias por que no podriamos hacer mock de la clase service
//
public interface UsuarioService {

    List<Usuario> listar();
    Optional<Usuario> porId(Long id); // Optional es una clase que nos ayuda a evitar los null pointer exception
    Usuario guardar(Usuario usuario);
    void eliminar(Long id);

}
