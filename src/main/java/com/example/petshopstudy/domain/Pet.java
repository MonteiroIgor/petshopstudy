package com.example.petshopstudy.domain;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Pet implements Serializable {

    @Serial
    private static final long serialVersionUID = -2508754052693562889L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer idade;

    @ManyToOne
    @JoinColumn(name = "id_especie")
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "id_raca")
    private Raca raca;

    public Pet(){

    }

    public Pet(Integer id, String nome, Integer idade, Especie especie, Raca raca) {
        super();
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return id.equals(pet.id);
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }
}
