package com.tienda_tiquetes.server;

import com.tienda_tiquetes.domain.Tiquete;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tienda_tiquetes.dao.TiqueteDao;

@Service
public class TiqueteServiceImpl implements TiqueteService {
    //Se implementan los 4 metodos de un CRUD: CREATE READ UPDATE DELETE
    //mediante TiqueteDao

    //Se utiliza una anotacion Autowired para que el objeto clienteDao, si ya existe se use, si no se cree (singleton)
    @Autowired
    private TiqueteDao tiqueteDao;

    //Retorna la lista de Clientes
    @Override
    @Transactional(readOnly = true)
    public List<Tiquete> getTiquete() {
        return (List<Tiquete>) tiqueteDao.findAll();
    }

    //Dado un Tiquete.id se busca en la tabla y se retorna todo el objeto cliente
    @Override
    @Transactional(readOnly = true)
    public Tiquete getTiquete(Tiquete tiquete) {
        return tiqueteDao.findById(tiquete.getIdTicket()).orElse(null);
    }

    //Si el Tiquete.id tiene un valor se busca y se actualiza
    //Si el Tiquete.id No tiene valor, se inserta el objeto en la tabla
    @Override
    @Transactional
    public void save(Tiquete tiquete) {
        tiqueteDao.save(tiquete);
    }

    //Elimina el registro que tiene el id igual al Tiquete.id
    @Override
    @Transactional
    public void delete(Tiquete tiquete) {
        tiqueteDao.delete(tiquete);
    }

    public List<Tiquete> getCliente() {
        return (List<Tiquete>) tiqueteDao.findAll();
    }
}
