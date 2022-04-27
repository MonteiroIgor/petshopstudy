package com.example.petshopstudy.repositories;

import com.example.petshopstudy.domain.Categoria;
import com.example.petshopstudy.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

}
