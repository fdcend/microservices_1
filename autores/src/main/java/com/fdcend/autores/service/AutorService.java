package com.fdcend.autores.service;

import com.fdcend.autores.model.Autor;
import com.fdcend.autores.repository.IAutorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AutorService implements IAutorService{

    @Autowired
    private IAutorRepository autorRepo;
        
    @Override
    public List<Autor> getAutores() {
        return autorRepo.findAll();
    }

    @Override
    public Autor getAutor(int id) {
        return autorRepo.findById(id).orElse(null);
    }

    @Override
    public String addAutor(Autor autor) {
        autorRepo.save(autor);
        return "autor creado correctamente";
    }

    @Override
    public String deleteAutor(int id) {
        autorRepo.deleteById(id);
        return "autor borrado correctamente";
    }

}
