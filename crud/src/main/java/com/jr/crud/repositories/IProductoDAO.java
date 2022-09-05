package com.jr.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jr.crud.models.ProductDTO;

@Repository
public interface IProductoDAO extends MongoRepository<ProductDTO, String>{

}
