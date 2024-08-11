package com.tuhotel.hotel.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Cliente {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Column(length = 45)
    private String nombre;

    @Column(length = 45)
    private String direccion;

    @Column(length = 45)
    private String telefono;

    @Column(length = 45)
    private String correo;

}
 