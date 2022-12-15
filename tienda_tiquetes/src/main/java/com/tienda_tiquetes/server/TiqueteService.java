package com.tienda_tiquetes.server;

import com.tienda_tiquetes.domain.Tiquete;
import java.util.List;

public interface TiqueteService {
    //Se definen los 4 metodos de un CRUD: CREATE READ UPDATE DELETE
    
    //Retorna la lista de Tiquetes
    public List<Tiquete> getTiquete();
    
    //Dado un cliente.id se busca en la tabla y se retorna todo el objeto cliente
    public Tiquete getTiquete(Tiquete tiquete);
    //Si el cliente.id tiene un valor se busca y se actualiza
    //Si el cliente.id No tiene valor, se inserta el objeto en la tabla
    public void save(Tiquete tiquete);
    
    //Elimina el registro que tiene el id igual al cliente.id
    public void delete(Tiquete tiquete);
    

}