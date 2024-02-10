package com.joirv.springcloud.msvc.usuarios.services;

import com.joirv.springcloud.msvc.usuarios.models.entity.Usuario;
import com.joirv.springcloud.msvc.usuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service // componente de spring de tipo servicio, estás indicando a Spring que la clase debe ser tratada como un componente de
        // servicio y que debe ser administrada por el contenedor de Spring
        //Un componente de servicio es una clase que proporciona lógica de negocio y servicios específicos a otras partes de la aplicación
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired //auto inyeccion
    private UsuarioRepository repository;
    @Override
    @Transactional(readOnly = true) // es una anotacion para decir como queremos que haga la transaccion, en este caso es solo lectura
    public List<Usuario> listar() {
        return (List<Usuario>) repository.findAll();
    }
    @Transactional(readOnly = true)// anotacion que sirve  para decir como queremos que haga la transaccion, en este caso es solo lectura
    @Override
    public Optional<Usuario> porId(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario) ;
    }

    @Override
    @Transactional// la transaccion es importante para que si hay un error en la base de datos no se haga el cambio
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
