package com.ec2.herrera.paredes.dto;

public class BodegaDTOResponse {
	private Integer id;
	private String nombreBodega;
	private String direccionBodega;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreBodega() {
		return nombreBodega;
	}
	public void setNombreBodega(String nombreBodega) {
		this.nombreBodega = nombreBodega;
	}
	public String getDireccionBodega() {
		return direccionBodega;
	}
	public void setDireccionBodega(String direccionBodega) {
		this.direccionBodega = direccionBodega;
	}
	
}
