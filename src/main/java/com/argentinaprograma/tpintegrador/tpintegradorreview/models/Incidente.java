package com.argentinaprograma.tpintegrador.tpintegradorreview.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "incidente")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private String descripcion;
    private Date fechaIngreso;
    private Date fechaEstimadaResolucion;
    private EstadoEnum estado;
    private String consideraciones;



}
