package com.example.petshopstudy.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Produto implements Serializable {

    @Serial
    private static final long serialVersionUID = -2508754052693562889L;

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preço;

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    @ManyToMany
    @JoinTable(name = "PRODUTO_CATEGORIA",
            joinColumns =  @JoinColumn(name = "id_produto"),
            inverseJoinColumns =  @JoinColumn(name = "id_categoria"))
    private List<Categoria> categorias = new ArrayList<>();

    public Produto() {

    }

    public Produto(Integer id, String nome, Double preço) {
        this.id = id;
        this.nome = nome;
        this.preço = preço;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return id.equals(produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }
}
