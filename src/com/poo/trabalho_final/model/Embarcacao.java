package com.poo.trabalho_final.model;

public abstract class Embarcacao {
    private String nome;
    private int ano;
    private int capacidade;
    private Capitao capitao;

    public Embarcacao(String nome, int ano, int capacidade, Capitao capitao) {
        this.nome = nome;
        this.ano = ano;
        this.capacidade = capacidade;
        this.capitao = capitao;
    }

    public Embarcacao() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Capitao getCapitao() {
        return capitao;
    }

    public void setCapitao(Capitao capitao) {
        this.capitao = capitao;
    }
    
    
}
