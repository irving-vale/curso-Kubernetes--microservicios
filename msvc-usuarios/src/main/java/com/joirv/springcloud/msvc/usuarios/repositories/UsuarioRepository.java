package com.joirv.springcloud.msvc.usuarios.repositories;

import com.joirv.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

/*
se usa la interface CrudRepository como extencion en la interface que vamos a crear en este caso UsuarioRepository
esto sirve para que tengamos metodos ya creados del crud, podemos revisar la pagina de spring en documentacion para revisar JPA Repository
y revisemos

usa datos genericos entonces agregamos <clase,tipo>
- jpa repository nos da metodos como save, findById, findAll, delete, deleteById, entre otros
- CrudRepository es una interfaz que nos da metodos para poder hacer el crud
-la diferencia entre CrudRepository y JpaRepository es que JpaRepository nos da mas metodos para poder hacer consultas mas complejas
- como por ejemplo paginacion, ordenamiento, entre otros
-Pero CrudRepository nos da metodos basicos para poder hacer el crud
*/
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
}
