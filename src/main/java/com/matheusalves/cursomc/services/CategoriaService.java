package com.matheusalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusalves.cursomc.domain.Categoria;
import com.matheusalves.cursomc.repositories.CategoriaRepository;
import com.matheusalves.cursomc.services.exceptions.ObjNotFoundsException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) { 
		Optional<Categoria> obj = repo.findById(id); 
		return obj.orElseThrow(()-> new ObjNotFoundsException(
				"Objeto não encontrado! Id: " + id + ",Tipo: " + Categoria.class.getName()));
	} 
	
}
