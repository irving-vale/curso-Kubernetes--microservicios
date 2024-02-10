package com.irving.springcloud.msvc.cursos.services;

import com.irving.springcloud.msvc.cursos.entity.Curso;
import com.irving.springcloud.msvc.cursos.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    private CursoRepository repository;
    @Override
    @Transactional(readOnly = true)
    public List<Curso> findAll() {
        return (List<Curso>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Curso> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Curso save(Curso curso) {
        return repository.save(curso);
    }

    @Override
    @Transactional //Una transacción es una unidad lógica de trabajo que,
    // en el contexto de bases de datos, implica una serie de operaciones que deben realizarse en conjunto,
    // y si alguna de ellas falla, todas las operaciones se revierten (rollback) para mantener la consistencia de los datos
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
