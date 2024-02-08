package com.fdcend.autores.controller;

import com.fdcend.autores.model.Autor;
import com.fdcend.autores.service.IAutorService;
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
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private IAutorService autorService;

    @GetMapping("/all")
    public List<Autor> getAutores() {
        return autorService.getAutores();
    }

    @GetMapping("/{id}")
    public Autor getAutor(@PathVariable int id) {
        return autorService.getAutor(id);
    }

    @PostMapping("/add")
    public String newAutor(@RequestBody Autor autor) {
        return autorService.addAutor(autor);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public String deleteAutor(@PathVariable int id) {
        return autorService.deleteAutor(id);
    }
    
}
