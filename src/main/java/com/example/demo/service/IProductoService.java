package com.example.demo.service;

import com.example.demo.repo.modelo.Producto;

public interface IProductoService {

	public void insertarProducto(Producto producto);
	public void insertarProductoStok(Producto producto);
	public Producto buscarProducto(String codigoMaestro);
}
