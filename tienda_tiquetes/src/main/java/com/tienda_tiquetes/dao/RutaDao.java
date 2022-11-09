package com.tienda_tiquetes.dao;

import com.tienda_tiquetes.domain.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RutaDao extends JpaRepository<Ruta, Long>{
    
}
