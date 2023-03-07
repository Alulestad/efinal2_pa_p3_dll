package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IBodegaRepo;
import com.example.demo.repo.IInventarioRepo;
import com.example.demo.repo.IProductoRepo;
import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.modelo.Inventario;
import com.example.demo.repo.modelo.Producto;


@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepo iInventarioRepo;
	
	@Autowired
	private IBodegaService bodegaService;
	
	@Autowired
	private IProductoService iProductoService;
	
	@Autowired
	private IProductoRepo iProductoRepo;
	
	@Override
	public void insertarInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		this.iInventarioRepo.insertarInventario(inventario);
	}

	@Override
	public void insertarInventarioSimple(String numeroBodega, String codigoMaestro, Integer cantidad) {
		Bodega bodegaEncontradaBodega=new Bodega();
		bodegaEncontradaBodega=this.bodegaService.buscarBodegaPorNumero(numeroBodega);
		
		Producto productoEncontrado=new Producto();
		productoEncontrado=this.iProductoService.buscarProducto(codigoMaestro);
		
		
		for (int i=1;i<=cantidad.intValue();i++) {
			Inventario myInventario =new Inventario();
			myInventario.setNumeroBodega(numeroBodega);
			myInventario.setCodigoBarrasMaestro(codigoMaestro);
			myInventario.setBodega(bodegaEncontradaBodega);
			myInventario.setProducto(productoEncontrado);
			
			//Incio generacion de codigo individual
			
			Integer genI=(int) (Math.random()*1000);
			String genS=genI.toString();
			String codigoIndividual=codigoMaestro.concat(genS);
			//FIN GENERACION
			myInventario.setCodigoBarrasIndividual(codigoIndividual);
			
			this.iInventarioRepo.insertarInventario(myInventario);
		}
		
		Integer stokNuevo=productoEncontrado.getStok()+cantidad;
		productoEncontrado.setStok(stokNuevo);
		this.iProductoRepo.actualizarProducto(productoEncontrado);
		
		
		
		
		
	}
	

}
