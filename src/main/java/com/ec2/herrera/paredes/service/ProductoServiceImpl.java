package com.ec2.herrera.paredes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec2.herrera.paredes.dto.ProductosDTORequest;
import com.ec2.herrera.paredes.dto.ProductosDTOResponse;
import com.ec2.herrera.paredes.model.Productos;
import com.ec2.herrera.paredes.repository.ProductosRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductosRepository repository;

	@Override
	public void guardarProducto(ProductosDTORequest producto) {
		Productos p = new Productos();
		p.setProducto(producto.getProductoProducto());
		p.setDescripcion(p.getDescripcion()); //
		p.setPrecio(producto.getPrecioProducto());
		p.setStock(producto.getStockProducto());
		repository.save(p);
	}

	@Override
	public void actualizarProducto(ProductosDTORequest producto) {
		Productos p = new Productos();
		p.setIdProducto(producto.getId());
		p.setProducto(producto.getProductoProducto());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(producto.getPrecioProducto());
		p.setStock(producto.getStockProducto());

		repository.saveAndFlush(p);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<ProductosDTOResponse> listarProductos() {
		List<ProductosDTOResponse> listar = new ArrayList<>();
		
		ProductosDTOResponse dto = null;
		
		List<Productos> p = repository.findAll();
		
		for (Productos productos : p) {
			
			dto = new ProductosDTOResponse();
			
			dto.setDescripcionProducto(productos.getDescripcion());
			dto.setProductoProducto(productos.getProducto());
			dto.setPrecioProducto(productos.getPrecio());
			dto.setStockProducto(productos.getStock());
			dto.setId(productos.getIdProducto());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public ProductosDTOResponse obtenerProductoId(Integer id) {
		Productos productos = repository.findById(id).orElse(null);
		ProductosDTOResponse dto = new ProductosDTOResponse();
		
		dto.setDescripcionProducto(productos.getDescripcion());
		dto.setProductoProducto(productos.getProducto());
		dto.setPrecioProducto(productos.getPrecio());
		dto.setStockProducto(productos.getStock());
		dto.setId(productos.getIdProducto());
		
		return dto;
	}
}
