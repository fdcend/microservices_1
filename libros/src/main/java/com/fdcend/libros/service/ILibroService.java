package com.fdcend.libros.service;

import com.fdcend.libros.dto.autorDTO;
import com.fdcend.libros.model.Libro;
import java.util.List;

public interface ILibroService {

    public List<Libro> getLibros();
    
    public Libro getLibroByIsbn(Long isbn);
    
    public String addLibro(int idAutor, Libro libro);
    
    public String deleteLibro(Long isbn);
    
    public autorDTO getAutorInfo(int id);
}
