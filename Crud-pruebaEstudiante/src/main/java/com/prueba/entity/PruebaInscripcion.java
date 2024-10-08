package com.prueba.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "PRUEBAINSCRIPCION")
public class PruebaInscripcion {
	
	@Id
    @Column(name = "eid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long edi;
	
	@Column(name = "nombreclase")
	private String nombreClase;
	
	@Column(name = "posicion")
	private Integer posicion;

}
