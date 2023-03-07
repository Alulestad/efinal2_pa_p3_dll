package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IProductoRepo;
import com.example.demo.repo.modelo.Producto;

 @Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepo iProductoRepo;
	
	@Override
	public void insertarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepo.insertarProducto(producto);
	}

	@Override
	public Producto buscarProducto(String codigoMaestro) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscarProducto(codigoMaestro);
	}

	@Override
	public void insertarProductoStok(Producto producto) {

		producto.setStok(0);
		
		this.insertarProducto(producto);
		
	}

	
}
