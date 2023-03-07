package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.IInventarioRepo;
import com.example.demo.repo.IProductoRepo;
import com.example.demo.repo.modelo.Inventario;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IInventarioService;
import com.example.demo.service.IProductoService;

@Controller
@RequestMapping("/general")
public class ControllerGeneral {
	@Autowired
	private IInventarioService iInventarioService;
	
	@Autowired
	private IBodegaService bodegaService;
	
	@Autowired
	private IProductoService iProductoService;
	

	@GetMapping("/nuevaPersona")
	public String paginaNuevaPersona(Inventario inventario) {
	return "vistaNuevoInventario";
	}
	
	@PostMapping("/insertar")
	public String insertarPersona(Inventario inventario) {
		
		
		//this.iInventarioService.insertarInventarioSimple(inventario.getCodigoBarrasIndividual(), inventario.getNumeroBodega(),2);
		
		return "guardado";
	}
	
}
