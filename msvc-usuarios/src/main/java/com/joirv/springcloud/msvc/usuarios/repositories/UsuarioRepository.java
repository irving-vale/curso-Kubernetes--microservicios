package com.joirv.springcloud.msvc.usuarios.repositories;

import com.joirv.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

/*
se usa la interface CrudRepository como extencion en la interface que vamos a crear en este caso UsuarioRepository
esto sirve para que tengamos metodos ya creados del crud, podemos revisar la pagina de spring en documentacion para revisar JPA Repository
y revisemos

usa datos genericos entonces agregamos <clase,tipo>
*/
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
}
