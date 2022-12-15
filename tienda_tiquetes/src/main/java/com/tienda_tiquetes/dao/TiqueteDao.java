package com.tienda_tiquetes.dao;

import com.tienda_tiquetes.domain.Tiquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TiqueteDao extends JpaRepository<Tiquete, Long>{
    
}
