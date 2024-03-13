package com.cine.cartelera_cine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculaController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController(){
        peliculas.add(new Pelicula(1, "Pelicula 1", 2024, "Director 1", "Genero 1", "Descripción 1"));
        peliculas.add(new Pelicula(2, "Pelicula 2", 2024, "Director 2", "Genero 2", "Descripción 2"));
        peliculas.add(new Pelicula(3, "Pelicula 3", 2024, "Director 3", "Genero 3", "Descripción 3"));
        peliculas.add(new Pelicula(4, "Pelicula 4", 2024, "Director 4", "Genero 4", "Descripción 4"));
        peliculas.add(new Pelicula(5, "Pelicula 5", 2024, "Director 5", "Genero 5", "Descripción 5"));
    }
    @GetMapping("/peliculas")
    public List<Pelicula> getStudents(){
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getStudentById(@PathVariable int id){
        for (Pelicula pelicula : peliculas){
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }

        return null;
    }
}
