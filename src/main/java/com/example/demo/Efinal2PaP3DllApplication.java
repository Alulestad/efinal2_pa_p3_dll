package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Bodega;
import com.example.demo.repo.modelo.Inventario;
import com.example.demo.repo.modelo.Producto;
import com.example.demo.service.IInventarioService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class Efinal2PaP3DllApplication implements CommandLineRunner {

	@Autowired
	private IProductoService iProductoService;
	
	@Autowired
	private IInventarioService iInventarioService;
	
	private static final Logger LOG=LoggerFactory.getLogger(Efinal2PaP3DllApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal2PaP3DllApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Producto producto=this.iProductoService.buscarProducto("456");
		
		LOG.warn("PRODUCTO: "+producto);
		
		
		//iInventarioService.insertarInventarioSimple("B1", "456", 3);
		
		
		
		
	}

}
