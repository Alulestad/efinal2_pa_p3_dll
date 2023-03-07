package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IBodegaRepo;
import com.example.demo.repo.modelo.Bodega;

@Service
public class BodegaServiceImpl implements IBodegaService {

	@Autowired
	private IBodegaRepo bodegaRepo;
	
	@Override
	public void insertarBodega(Bodega bodega) {
		// TODO Auto-generated method stub
		this.bodegaRepo.insertarBodega(bodega);
	}

	@Override
	public Bodega buscarBodegaPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.bodegaRepo.buscarBodegaPorNumero(numero);
	}



	
}
