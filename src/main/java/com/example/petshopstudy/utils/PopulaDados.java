package com.example.petshopstudy.utils;

import com.example.petshopstudy.domain.Categoria;
import com.example.petshopstudy.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class PopulaDados {

    @Autowired
    CategoriaRepository categoriaRepository;

    @PostConstruct
    public void cadastrar() {

        Categoria cat1 = new Categoria(null, "Alimento");
        Categoria cat2 = new Categoria(null, "Cosmético");
        Categoria cat3 = new Categoria(null, "Remédio");

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
