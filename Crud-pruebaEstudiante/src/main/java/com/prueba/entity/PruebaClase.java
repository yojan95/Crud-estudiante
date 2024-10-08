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
@Table(name = "PRUEBACLASE")
public class PruebaClase {
	
	@Id
    @Column(name = "eid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long edi;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "horario")
	private String horario;
	
	@Column(name = "aula")
	private String aula;

}
