package com.prueba.service;

import java.util.List;

import com.prueba.entity.PruebaInscripcion;

public interface PruebaInscripcionService {

	List<PruebaInscripcion> getAll();

	PruebaInscripcion update(PruebaInscripcion pruebaInscripcion);

	PruebaInscripcion save(PruebaInscripcion pruebaInscripcion);

	void delete(Long eid);

}
