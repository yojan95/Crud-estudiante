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
@Table(name = "PRUEBAESTUDIANTE")
public class PruebaEstudiante {
	
	@Id
    @Column(name = "eid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long edi;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "especialidad")
	private String especialidad;
	
	@Column(name = "grado")
	private String grado;
	
}
