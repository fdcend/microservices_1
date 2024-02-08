package com.fdcend.libros.controller;

import com.fdcend.libros.dto.autorDTO;
import com.fdcend.libros.model.Libro;
import com.fdcend.libros.repository.IautorDTOrepository;
import com.fdcend.libros.service.ILibroService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private ILibroService libroService;
    

    
    //get Author by ID via API
    @GetMapping("/autor/{id}")
    public autorDTO getAutorInfo(@PathVariable("id") int id) {
        return libroService.getAutorInfo(id);
    }

    @GetMapping("/all")
    public List getBooks() {
        return libroService.getLibros();
    }

    @GetMapping("/{isbn}")
    public Libro getBook(@PathVariable Long isbn) {
        return libroService.getLibroByIsbn(isbn);
    }

    @PostMapping("/add/{idAutor}")
    public String newBook(@PathVariable int idAutor, @RequestBody Libro libro) {
        return libroService.addLibro(idAutor, libro);
    }

    @DeleteMapping("/delete/{isbn}")
    public String deleteBook(@PathVariable Long isbn) {
        return libroService.deleteLibro(isbn);
    }
    
}
