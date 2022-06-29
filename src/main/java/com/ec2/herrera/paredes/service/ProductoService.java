package com.ec2.herrera.paredes.service;

import java.util.List;

import com.ec2.herrera.paredes.dto.ProductosDTORequest;
import com.ec2.herrera.paredes.dto.ProductosDTOResponse;

public interface ProductoService {
	void guardarProducto(ProductosDTORequest producto);
	void actualizarProducto(ProductosDTORequest producto);
	void eliminarProducto(Integer id);
	List<ProductosDTOResponse> listarProductos();
	ProductosDTOResponse obtenerProductoId(Integer id);
}
