package com.tienda_tiquetes.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tiquetes")
public class Tiquete implements Serializable {

    private static final long serialVerisonUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTicket;
    private String ruta;
    private String horario;
    private String nombre_usuario;
    private String correo_usuario;

    public Tiquete() {
    }

    public Tiquete(String ruta, String horario, String nombre_usuario, String correo_usuario) {
        this.ruta = ruta;
        this.horario = horario;
        this.nombre_usuario = nombre_usuario;
        this.correo_usuario = correo_usuario;
    }
 

}
