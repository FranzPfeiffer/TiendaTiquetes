package com.practica.dao;

import com.practica.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EstadoDao extends JpaRepository<Estado, Long>{
    
}
