package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Inventario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class InventarioRepoImpl implements IInventarioRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarInventario(Inventario inventario) {
		this.entityManager.persist(inventario);

	}

}
