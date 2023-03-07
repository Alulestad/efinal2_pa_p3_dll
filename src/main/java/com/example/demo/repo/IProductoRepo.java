package com.example.demo.repo;

import com.example.demo.repo.modelo.Producto;

public interface IProductoRepo {

	public void insertarProducto(Producto producto);
	public Producto buscarProducto(String codigoMaestro);
	
	public void actualizarProducto(Producto producto);
	
}
