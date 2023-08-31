package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ProductoEntity;

public interface ProductoService{
	ProductoEntity create(ProductoEntity prod);
	List<ProductoEntity> readAll();

}
