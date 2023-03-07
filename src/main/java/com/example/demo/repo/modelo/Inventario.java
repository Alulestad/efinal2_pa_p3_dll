package com.example.demo.repo.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {

	/*
	 numeroBodega
	 • Código de Barras Maestro
	 • cantidad
	 codigoBarrasIndividual*/
	
	@Column(name = "inve_numero_bodega")
	private String numeroBodega;
	@Column(name = "inve_codigo_barras_maestro")
	private String codigoBarrasMaestro;
	@Id
	@Column(name = "inve_codigo_barras_individual")
	private String codigoBarrasIndividual;
	
	@ManyToOne
	@JoinColumn(name = "inve_id_bodega")
	private Bodega bodega;
	
	@ManyToOne
	@JoinColumn(name = "inve_id_producto")
	private Producto producto;

	public String getNumeroBodega() {
		return numeroBodega;
	}

	public void setNumeroBodega(String numeroBodega) {
		this.numeroBodega = numeroBodega;
	}

	public String getCodigoBarrasMaestro() {
		return codigoBarrasMaestro;
	}

	public void setCodigoBarrasMaestro(String codigoBarrasMaestro) {
		this.codigoBarrasMaestro = codigoBarrasMaestro;
	}

	public String getCodigoBarrasIndividual() {
		return codigoBarrasIndividual;
	}

	public void setCodigoBarrasIndividual(String codigoBarrasIndividual) {
		this.codigoBarrasIndividual = codigoBarrasIndividual;
	}

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Inventario [numeroBodega=" + numeroBodega + ", codigoBarrasMaestro=" + codigoBarrasMaestro
				+ ", codigoBarrasIndividual=" + codigoBarrasIndividual + "]";
	}
	
	
	
}
