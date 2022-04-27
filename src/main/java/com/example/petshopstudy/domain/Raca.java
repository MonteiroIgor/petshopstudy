package com.example.petshopstudy.domain;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Raca implements Serializable {

    @Serial
    private static final long serialVersionUID = -2508754052693562889L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;

    @OneToMany(mappedBy = "raca")
    private List<Pet> pets = new ArrayList<>();

    public Raca(){

    }

    public Raca(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Raca)) return false;
        Raca raca = (Raca) o;
        return id.equals(raca.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
