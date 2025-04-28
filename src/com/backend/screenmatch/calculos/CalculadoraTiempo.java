package com.backend.screenmatch.calculos;

import com.backend.screenmatch.modelos.Pelicula;
import com.backend.screenmatch.modelos.Titulo;

public class CalculadoraTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye (Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
