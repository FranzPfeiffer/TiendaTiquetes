package com.tienda_tiquetes.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ruta")
public class Ruta implements Serializable {

    private static final long serialVerisonUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRuta;
    private String nombre_ruta;
    private String horario_1;
    private String horario_2;
    private String horario_3;
    private String horario_4;

    public Ruta() {
    }

    public Ruta(String nomre_ruta, String horario_1, String horario_2, String horario_3, String horario_4) {
        this.nombre_ruta = nombre_ruta;
        this.horario_1 = horario_1;
        this.horario_2 = horario_2;
        this.horario_3 = horario_3;
        this.horario_4 = horario_4;
    }

    
    

}
