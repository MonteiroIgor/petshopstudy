package com.example.petshopstudy.repositories;

import com.example.petshopstudy.domain.Categoria;
import com.example.petshopstudy.domain.Raca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RacaRepository extends JpaRepository<Raca, Integer> {

}
