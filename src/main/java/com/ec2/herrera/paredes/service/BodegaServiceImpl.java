package com.ec2.herrera.paredes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec2.herrera.paredes.dto.BodegaDTORequest;
import com.ec2.herrera.paredes.dto.BodegaDTOResponse;
import com.ec2.herrera.paredes.model.Bodega;
import com.ec2.herrera.paredes.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService{

	@Autowired
	private BodegaRepository repository;
	
	@Override
	public void guardarBodega(BodegaDTORequest Bodega) {
		Bodega b = new Bodega();
		b.setNombre(Bodega.getNombreBodega());
		b.setDireccion(b.getDireccion());
		repository.save(b);
	}

	@Override
	public void actualizarBodega(BodegaDTORequest Bodega) {
		Bodega b = new Bodega();
		b.setIdBodega(Bodega.getId());
		b.setNombre(Bodega.getNombreBodega());
		b.setDireccion(b.getDireccion());

		repository.saveAndFlush(b);
	}

	@Override
	public void eliminarBodega(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<BodegaDTOResponse> listarBodegas() {
		List<BodegaDTOResponse> listar = new ArrayList<>();
		
		BodegaDTOResponse dto = null;
		
		List<Bodega> b = repository.findAll();
		
		for (Bodega bodega : b) {
			
			dto = new BodegaDTOResponse();
			
			dto.setNombreBodega(bodega.getNombre());
			dto.setDireccionBodega(bodega.getDireccion());
			dto.setId(bodega.getIdBodega());
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public BodegaDTOResponse obtenerBodegaId(Integer id) {
		
		Bodega bodega = repository.findById(id).orElse(null);
		BodegaDTOResponse dto = new BodegaDTOResponse();
		
		dto.setNombreBodega(bodega.getNombre());
		dto.setDireccionBodega(bodega.getDireccion());
		dto.setId(bodega.getIdBodega());
		
		return dto;
	}

}
