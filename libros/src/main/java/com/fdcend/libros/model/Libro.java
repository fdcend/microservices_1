package com.fdcend.libros.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Libro {

    @Id
    private Long isbn;
    private String title;
    private int year;
    private String description;
    @ElementCollection
    private List<String> authorsNameAndNationality;
}
