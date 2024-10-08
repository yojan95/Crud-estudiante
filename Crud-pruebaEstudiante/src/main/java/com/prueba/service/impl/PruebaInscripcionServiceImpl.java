package com.prueba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.PruebaInscripcion;
import com.prueba.repository.PruebaInscripcionRepository;
import com.prueba.service.PruebaInscripcionService;

@Service
public class PruebaInscripcionServiceImpl implements PruebaInscripcionService{
	
	
	@Autowired
	private PruebaInscripcionRepository inscripcionRepository;
	
	@Override
	public PruebaInscripcion save(PruebaInscripcion pruebaInscripcion) {
		return inscripcionRepository.save(pruebaInscripcion);
	}

	@Override
	public PruebaInscripcion update(PruebaInscripcion pruebaInscripcion) {
		return inscripcionRepository.save(pruebaInscripcion);
	}
	
	@Override
	public List<PruebaInscripcion> getAll() {
		return inscripcionRepository.findAll();
	}
	
	@Override
	public void delete(Long eid) {
		inscripcionRepository.deleteById(eid);
	}

}
