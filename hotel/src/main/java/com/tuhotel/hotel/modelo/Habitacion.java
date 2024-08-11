package com.tuhotel.hotel.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Habitacion {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHabitaciones;

    @Column(nullable = false, length = 45)
    private String nombre;

    @Column(nullable = false)
    private Integer piso;

    @Column(nullable = false, length = 45)
    private String descripcion;

}
