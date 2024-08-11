package com.tuhotel.hotel.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Estado {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstado;

    @Column(length = 45)
    private String nombre;

}