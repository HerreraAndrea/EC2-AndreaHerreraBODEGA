package com.ec2.herrera.paredes.dto;

public class ProductosDTOResponse {
	private Integer id;
	private String productoProducto;
	private String descripcionProducto;
	private Double precioProducto;
	private Integer stockProducto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductoProducto() {
		return productoProducto;
	}
	public void setProductoProducto(String productoProducto) {
		this.productoProducto = productoProducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public Double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public Integer getStockProducto() {
		return stockProducto;
	}
	public void setStockProducto(Integer stockProducto) {
		this.stockProducto = stockProducto;
	}
	
	
}
