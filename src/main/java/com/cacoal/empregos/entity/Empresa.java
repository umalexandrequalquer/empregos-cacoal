package com.cacoal.empregos.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import javax.swing.text.html.ListView;
import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(unique = true)
    private String nome;
    @Column(unique = true)
    private String cnpj;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String telefone;
    @Column(unique = true)
    private String endereco;
    private String cidade = "Cacoal";
    private String password;

    private ArrayList<Vegas> ListaVagas = new ArrayList<>();


    public Empresa(String nome, String email, String password, String cnpj, String telefone, String endereco ,Vegas vegas) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.endereco = endereco;
        this.ListaVagas.add(vegas);
    }

    public Empresa() {

    }

    public void addVaga(Vegas vaga) {
        ListaVagas.add(vaga);
    }
    public void removeVaga(Vegas vaga) {
        ListaVagas.remove(vaga);
    }
    public void isEmpty (Vegas vaga) {
        ListaVagas.isEmpty();
    }
    public List<Vegas> getListaVagas() {
        return ListaVagas;
    }
    @JsonIgnore
    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {return email;}


    public void setEmail(String email) {this.email = email;}

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
