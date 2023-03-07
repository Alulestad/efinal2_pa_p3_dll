package com.example.demo.repo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Column(name = "prod_nombre")
	private String nombre;
	@Id
	@Column(name = "prod_codigo_barras_maestro")
	private String codigoBarrasMaestro;
	@Column(name = "prod_categoria")
	private String categoria;
	@Column(name = "prod_stok")
	private Integer stok;
	
	@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
	private List<Inventario> inventarios;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoBarrasMaestro() {
		return codigoBarrasMaestro;
	}

	public void setCodigoBarrasMaestro(String codigoBarrasMaestro) {
		this.codigoBarrasMaestro = codigoBarrasMaestro;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getStok() {
		return stok;
	}

	public void setStok(Integer stok) {
		this.stok = stok;
	}

	public List<Inventario> getInventarios() {
		return inventarios;
	}

	public void setInventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigoBarrasMaestro=" + codigoBarrasMaestro + ", categoria="
				+ categoria + ", stok=" + stok + "]";
	}
	
	

}
