package com.ec2.herrera.paredes.service;

import java.util.List;

import com.ec2.herrera.paredes.dto.ClienteDTORequest;
import com.ec2.herrera.paredes.dto.ClienteDTOResponse;

public interface ClienteService {
	void guardarCliente(ClienteDTORequest Cliente);
	void actualizarCliente(ClienteDTORequest Cliente);
	void eliminarCliente(Integer id);
	List<ClienteDTOResponse> listarClientes();
	ClienteDTOResponse obtenerClienteId(Integer id);
}
