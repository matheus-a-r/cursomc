package com.matheusalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusalves.cursomc.domain.Categoria;
import com.matheusalves.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Integer>{

}
