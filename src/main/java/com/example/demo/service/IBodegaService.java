package com.example.demo.service;

import com.example.demo.repo.modelo.Bodega;

public interface IBodegaService {

	public void insertarBodega(Bodega bodega);

	public Bodega buscarBodegaPorNumero(String numero);
	


}
