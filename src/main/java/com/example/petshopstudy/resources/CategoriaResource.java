package com.example.petshopstudy.resources;

import com.example.petshopstudy.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value= "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> mostrar() {
        Categoria cat1 = new Categoria(1, "Alimento");
        Categoria cat2 = new Categoria(2, "Cosmético");
        Categoria cat3 = new Categoria(3, "Remédio");

        List<Categoria> listCategorias = new ArrayList<>();
        listCategorias.add(cat1);
        listCategorias.add(cat2);
        listCategorias.add(cat3);

        return listCategorias;
    }
}
