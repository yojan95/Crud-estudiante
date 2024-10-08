package com.prueba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.PruebaEstudiante;
import com.prueba.repository.PruebaEstudianteRepository;
import com.prueba.service.PruebaEstudianteService;

@Service
public class PruebaEstudianteServiceImpl implements PruebaEstudianteService{
	
	@Autowired
	private PruebaEstudianteRepository estudianteRepository;
	
	@Override
	public PruebaEstudiante save(PruebaEstudiante pruebaEstudiante) {
		return estudianteRepository.save(pruebaEstudiante);
	}

	@Override
	public PruebaEstudiante update(PruebaEstudiante pruebaEstudiante) {
		return estudianteRepository.save(pruebaEstudiante);
	}
	
	@Override
	public List<PruebaEstudiante> getAll() {
		return estudianteRepository.findAll();
	}
	
	@Override
	public void delete(Long eid) {
		estudianteRepository.deleteById(eid);
	}
}
