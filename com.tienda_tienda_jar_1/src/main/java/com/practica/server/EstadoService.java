
package com.practica.server;

import com.practica.domain.Estado;
import java.util.List;

public interface EstadoService {
    //Se definen los 4 metodos de un CRUD: CREATE READ UPDATE DELETE
    
    //Retorna la lista de Estados
    public List<Estado> getEstado();
    
    //Dado un estado.id se busca en la tabla y se retorna todo el objeto cliente
    public Estado getEstado(Estado estado);
    //Si el cliente.id tiene un valor se busca y se actualiza
    //Si el cliente.id No tiene valor, se inserta el objeto en la tabla
    public void save(Estado estado);
    
    //Elimina el registro que tiene el id igual al cliente.id
    public void delete(Estado estado);
}
