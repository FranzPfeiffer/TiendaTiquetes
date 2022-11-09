
package com.tienda_tiquetes.server;

import com.tienda_tiquetes.domain.Ruta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tienda_tiquetes.dao.RutaDao;

@Service
public class RutaServiceImpl implements RutaService {
    //Se implementan los 4 metodos de un CRUD: CREATE READ UPDATE DELETE
    //mediante RutaDao
    
    //Se utiliza una anotacion Autowired para que el objeto clienteDao, si ya existe se use, si no se cree (singleton)
    @Autowired
    private RutaDao rutaDao;
    
    //Retorna la lista de Clientes
    
    @Override
    @Transactional(readOnly = true)
    public List<Ruta> getRuta() {
        return(List<Ruta>)rutaDao.findAll();
    }
    
    //Dado un Ruta.id se busca en la tabla y se retorna todo el objeto cliente
    @Override
    @Transactional(readOnly = true)
    public Ruta getRuta(Ruta ruta){
        return rutaDao.findById(ruta.getIdRuta()).orElse(null);
    }
    //Si el Ruta.id tiene un valor se busca y se actualiza
    //Si el Ruta.id No tiene valor, se inserta el objeto en la tabla
    @Override
    @Transactional
    public void save(Ruta ruta){
        rutaDao.save(ruta);
    }
    //Elimina el registro que tiene el id igual al Ruta.id
    @Override
    @Transactional
    public void delete(Ruta ruta){
        rutaDao.delete(ruta);
    }
}
