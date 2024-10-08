package com.prueba.service;

import java.util.List;

import com.prueba.entity.PruebaEstudiante;

public interface PruebaEstudianteService {

	PruebaEstudiante save(PruebaEstudiante pruebaEstudiante);

	PruebaEstudiante update(PruebaEstudiante pruebaEstudiante);

	List<PruebaEstudiante> getAll();

	void delete(Long eid);

}
