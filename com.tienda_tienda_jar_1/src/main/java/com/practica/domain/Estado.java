package com.practica.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {

    private static final long serialVerisonUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    
    private String nombre;
    private String capital;
    private String costas;
    private int poblacion;

    public Estado() {
    }

    public Estado(String nombre, String capital, String costas, int poblacion) {
        this.nombre = nombre;
        this.capital = capital;
        this.costas = costas;
        this.poblacion = poblacion;
    }

}
