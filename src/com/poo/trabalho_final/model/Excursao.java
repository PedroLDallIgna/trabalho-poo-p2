package com.poo.trabalho_final.model;

import java.io.Serializable;

public class Excursao implements Serializable {
    private Submarino submarino;
    private Tripulante tripulantes[];
    private String partida;
    private Destino destino;

    public Excursao(Submarino submarino, Tripulante[] tripulantes, String partida, Destino destino) {
        this.submarino = submarino;
        this.tripulantes = tripulantes;
        this.partida = partida;
        this.destino = destino;
    }
    
    public Excursao() {}

    public Submarino getSubmarino() {
        return submarino;
    }

    public void setSubmarino(Submarino submarino) {
        this.submarino = submarino;
    }

    public Tripulante[] getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(Tripulante[] tripulantes) {
        this.tripulantes = tripulantes;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
    
    
}
