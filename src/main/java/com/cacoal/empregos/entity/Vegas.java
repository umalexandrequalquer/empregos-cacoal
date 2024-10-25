package com.cacoal.empregos.entity;

import jakarta.persistence.Id;
import java.io.Serializable;

public class Vegas implements Serializable {

    private static final long serialVersionUID = 1L; // Identificador de versão da classe

    private String titulo;
    private String descricao;
    private Double valor;

    public Vegas() {}

    public Vegas(String titulo, String descricao, Double valor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
