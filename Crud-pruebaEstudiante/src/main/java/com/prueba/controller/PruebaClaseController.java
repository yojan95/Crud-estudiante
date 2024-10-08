package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.entity.PruebaClase;
import com.prueba.service.PruebaClaseService;


@Controller
@RequestMapping("/pruebaClase")
public class PruebaClaseController {
	
	@Autowired
	private PruebaClaseService pruebaClaseService;
	
	@PostMapping
	public ResponseEntity<PruebaClase> save(@RequestBody PruebaClase pruebaClase){
		PruebaClase result = pruebaClaseService.savePruebaClase(pruebaClase);
		return new ResponseEntity<>(result,HttpStatus.CREATED);	
	}
	
	@PutMapping
	public ResponseEntity<PruebaClase> modificar(@RequestBody PruebaClase PruebaClase) throws Exception{
		return new ResponseEntity<>(pruebaClaseService.updatePruebaClase(PruebaClase),HttpStatus.OK);
	}
	
	@GetMapping(value = "/listar")
	public ResponseEntity<List<PruebaClase>> listar(){
		List<PruebaClase> resultList = pruebaClaseService.getAllPruebaClase();
		return new ResponseEntity<List<PruebaClase>>(resultList,HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> eliminar(@Param("nombre") String nombre)throws Exception{
		pruebaClaseService.deletePruebaClase(nombre);
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
