package com.example.demo.service;

import com.example.demo.repo.modelo.Inventario;

public interface IInventarioService {
	public void insertarInventario(Inventario inventario);
	public void insertarInventarioSimple(String numeroBodega, String codigoMaestro, Integer cantidad);
}
