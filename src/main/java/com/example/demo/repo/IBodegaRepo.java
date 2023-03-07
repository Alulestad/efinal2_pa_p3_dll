package com.example.demo.repo;

import com.example.demo.repo.modelo.Bodega;

public interface IBodegaRepo {
	
	//CRUD
	
	public void insertarBodega(Bodega bodega);
	
	public Bodega buscarBodegaPorNumero(String numero);
	
	
}
