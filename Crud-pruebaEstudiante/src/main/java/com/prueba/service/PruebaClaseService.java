package com.prueba.service;

import java.util.List;

import com.prueba.entity.PruebaClase;

public interface PruebaClaseService {

	PruebaClase savePruebaClase(PruebaClase pruebaClase);

	PruebaClase updatePruebaClase(PruebaClase pruebaClase);

	List<PruebaClase> getAllPruebaClase();

	void deletePruebaClase(String nombre);

}
