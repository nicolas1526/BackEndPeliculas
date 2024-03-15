package com.unisangil.peliculas.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PeliculaModelo {
    private int id;
    private String nombre;
    private String genero;
    private float duracion;
    private boolean estado;
    private int anio;
}
