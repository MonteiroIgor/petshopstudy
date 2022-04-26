package com.example.petshopstudy.service;

import com.example.petshopstudy.domain.Categoria;
import com.example.petshopstudy.repositories.CategoriaRepository;
import com.example.petshopstudy.service.exceptions.ObjetoNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjetoNaoEncontradoException("Objeto não Encontrado. ID: " + id +", Tipo: " + Categoria.class.getName() ));
    }
}
