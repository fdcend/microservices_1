package com.fdcend.libros.service;

import com.fdcend.libros.dto.autorDTO;
import com.fdcend.libros.model.Libro;
import com.fdcend.libros.repository.ILibroRepository;
import com.fdcend.libros.repository.IautorDTOrepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private ILibroRepository libroRepo;

    @Autowired
    private IautorDTOrepository autorRepository;

    @Override
    public List<Libro> getLibros() {
        return libroRepo.findAll();
    }

    @Override
    public Libro getLibroByIsbn(Long isbn) {
        return libroRepo.findById(isbn).orElse(null);
    }

    //get Author by ID via API
    @Override
    public autorDTO getAutorInfo(int id) {
        return autorRepository.getAutorInfo(id);
    }

    @Override
    public String addLibro(int idAutor, Libro libro) {

        autorDTO autorDTO = this.getAutorInfo(idAutor);
        String nombreYNacionalidad = autorDTO.getFullName() + " " + autorDTO.getNationality();
        List<String> listaAutores = new ArrayList<>();
        listaAutores.add(nombreYNacionalidad);
        libro.setAuthorsNameAndNationality(listaAutores);

        libroRepo.save(libro);
        return "libro creado correctamente";
    }

    @Override
    public String deleteLibro(Long isbn) {
        libroRepo.deleteById(isbn);
        return "libro borrado correctamente";
    }
}
