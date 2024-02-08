package com.fdcend.autores.service;

import com.fdcend.autores.model.Autor;
import java.util.List;

public interface IAutorService {

    public List<Autor> getAutores();

    public Autor getAutor(int id);

    public String addAutor(Autor autor);

    public String deleteAutor(int id);

}
