package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Bodega;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class BodegaRepoImpl implements IBodegaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarBodega(Bodega bodega) {
		
		entityManager.persist(bodega);

	}

	@Override
	public Bodega buscarBodegaPorNumero(String numero) {
		TypedQuery<Bodega> myQuery=this.entityManager.createQuery(""
				+ "select b from Bodega b where b.numero=:datoNumero",Bodega.class);
		myQuery.setParameter("datoNumero", numero);
		
		
		return myQuery.getSingleResult();
	}

}
