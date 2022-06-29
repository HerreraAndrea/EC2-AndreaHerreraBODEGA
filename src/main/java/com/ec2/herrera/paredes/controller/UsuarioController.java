package com.ec2.herrera.paredes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ec2.herrera.paredes.dto.UsuarioDTORequest;
import com.ec2.herrera.paredes.dto.UsuarioDTOResponse;
import com.ec2.herrera.paredes.security.JWTUtil;
import com.ec2.herrera.paredes.security.UserDetailService;

@RestController
public class UsuarioController {
	
	@Autowired
	private JWTUtil util;
	
	@Autowired
	private UserDetailService service;
	
	
	@RequestMapping(path = "/crearToken", method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsuarioDTORequest request){
		UserDetails user = service.loadUserByUsername(request.getUsuario());
		return ResponseEntity.ok(new UsuarioDTOResponse(util.generateToken(user.getUsername())));
	}
	
}
