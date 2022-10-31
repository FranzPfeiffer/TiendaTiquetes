
package com.practica.server;

import com.practica.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.practica.dao.EstadoDao;

@Service
public class EstadoServiceImpl implements EstadoService {
    //Se implementan los 4 metodos de un CRUD: CREATE READ UPDATE DELETE
    //mediante EstadoDao
    
    //Se utiliza una anotacion Autowired para que el objeto clienteDao, si ya existe se use, si no se cree (singleton)
    @Autowired
    private EstadoDao estadoDao;
    
    //Retorna la lista de Clientes
    
    @Override
    @Transactional(readOnly = true)
    public List<Estado> getEstado() {
        return(List<Estado>)estadoDao.findAll();
    }
    
    //Dado un cliente.id se busca en la tabla y se retorna todo el objeto cliente
    @Override
    @Transactional(readOnly = true)
    public Estado getEstado(Estado estado){
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }
    //Si el cliente.id tiene un valor se busca y se actualiza
    //Si el cliente.id No tiene valor, se inserta el objeto en la tabla
    @Override
    @Transactional
    public void save(Estado estado){
        estadoDao.save(estado);
    }
    //Elimina el registro que tiene el id igual al cliente.id
    @Override
    @Transactional
    public void delete(Estado estado){
        estadoDao.delete(estado);
    }
}
