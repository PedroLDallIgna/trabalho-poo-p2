package com.poo.trabalho_final.model;

public class Excursao {
    private Submarino submarino;
    private Passageiro passageiros[];
    private String partida;
    private Destino destino;

    public Excursao(Submarino submarino, Passageiro[] passageiros, String partida, Destino destino) {
        this.submarino = submarino;
        this.passageiros = passageiros;
        this.partida = partida;
        this.destino = destino;
    }

    public Submarino getSubmarino() {
        return submarino;
    }

    public void setSubmarino(Submarino submarino) {
        this.submarino = submarino;
    }

    public Passageiro[] getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Passageiro[] passageiros) {
        this.passageiros = passageiros;
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
