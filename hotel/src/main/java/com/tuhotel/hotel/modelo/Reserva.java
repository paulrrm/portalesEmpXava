package com.tuhotel.hotel.modelo;

import java.time.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Reserva {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReserva;

    @Column
    private LocalDate fechaInico;

    @Column
    private LocalDate fechaFin;

    @Column(length = 500)
    private String observacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Habitacion habitacion;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Estado estado;
}
 