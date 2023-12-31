package com.demo.api.model.dao;

import org.springframework.data.repository.CrudRepository;
// Otras formas de utilizar los métodos de JPA
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;

import com.demo.api.model.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer>{
    
}
