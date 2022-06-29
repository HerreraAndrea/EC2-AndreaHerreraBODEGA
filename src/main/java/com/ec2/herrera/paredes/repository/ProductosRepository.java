package com.ec2.herrera.paredes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec2.herrera.paredes.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos,Integer>{

}
