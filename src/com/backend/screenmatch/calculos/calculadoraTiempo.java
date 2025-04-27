package com.backend.screenmatch.calculos;

import com.backend.screenmatch.modelos.Pelicula;

public class calculadoraTiempo {
    private int tiempoTotal;

    public void incluye (Pelicula pelicula){
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }
}
