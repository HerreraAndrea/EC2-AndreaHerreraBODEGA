package com.ec2.herrera.paredes.service;

import java.util.List;

import com.ec2.herrera.paredes.dto.BodegaDTORequest;
import com.ec2.herrera.paredes.dto.BodegaDTOResponse;

public interface BodegaService {
	
	void guardarBodega(BodegaDTORequest Bodega);
	void actualizarBodega(BodegaDTORequest Bodega);
	void eliminarBodega(Integer id);
	List<BodegaDTOResponse> listarBodegas();
	BodegaDTOResponse obtenerBodegaId(Integer id);
}
