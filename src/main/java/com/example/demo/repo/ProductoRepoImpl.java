package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ProductoRepoImpl implements IProductoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);

	}

	@Override
	public Producto buscarProducto(String codigoMaestro) {
		Producto producto = this.entityManager.find(Producto.class, codigoMaestro);
		return producto;
	}

	@Override
	public void actualizarProducto(Producto producto) {
		entityManager.merge(producto);
		
	}
	
	
	
}
