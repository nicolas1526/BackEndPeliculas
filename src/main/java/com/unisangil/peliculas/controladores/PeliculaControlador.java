package com.unisangil.peliculas.controladores;

import com.unisangil.peliculas.modelos.PeliculaModelo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pelicula")
public class PeliculaControlador {

    @GetMapping("/todos")
    public List<PeliculaModelo> findAll(){
        return null;
    }

    @GetMapping("/id/{id}")
    public PeliculaModelo findAllById(@PathVariable Integer id){
        return null;
    }

    @GetMapping("/filtros")
    public List<PeliculaModelo> findAllByFilter(
            @RequestParam(required = false) Boolean estado,
            @RequestParam(required = false) String genero,
            @RequestParam(required = false) Integer anio,
            @RequestParam(required = false) Float duracion
            ){
        return null;
    }

    @PostMapping("/crear")
    public PeliculaModelo create(@RequestBody PeliculaModelo pelicula){
        return null;
    }

    @PutMapping("/actualizar/{id}")
    public PeliculaModelo update(@PathVariable Integer id, @RequestBody PeliculaModelo pelicula){
        return null;
    }

    @DeleteMapping("/eliminar/{id}")
    public PeliculaModelo delete(@PathVariable Integer id){
        return null;
    }

}
