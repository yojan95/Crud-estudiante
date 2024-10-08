package com.prueba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.PruebaClase;
import com.prueba.repository.PruebaClaseRepository;
import com.prueba.service.PruebaClaseService;

@Service
public class PruebaClaseServiceImpl implements PruebaClaseService{
	
	@Autowired
	private PruebaClaseRepository claseRepository;
	
	@Override
	public PruebaClase savePruebaClase(PruebaClase pruebaClase) {
		return claseRepository.save(pruebaClase);
	}
	
	@Override
	public PruebaClase updatePruebaClase(PruebaClase pruebaClase) {
		return claseRepository.save(pruebaClase);
	}
	
	@Override
	public List<PruebaClase> getAllPruebaClase() {
		return claseRepository.findAll();
	}
	
	@Override
	public void deletePruebaClase(String nombre) {
		 claseRepository.deleteById(nombre);
	}

}
