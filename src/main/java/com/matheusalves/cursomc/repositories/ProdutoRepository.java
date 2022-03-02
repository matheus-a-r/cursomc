package com.matheusalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.matheusalves.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Integer>{

}
