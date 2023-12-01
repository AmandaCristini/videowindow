package com.example.videowindowproj.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.videowindowproj.model.entities.Produto;

public interface ProdutoRepository 
	extends CrudRepository<Produto, Integer> {

}
