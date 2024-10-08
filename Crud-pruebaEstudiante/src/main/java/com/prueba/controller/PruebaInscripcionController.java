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

import com.prueba.entity.PruebaInscripcion;
import com.prueba.service.PruebaInscripcionService;

@Controller
@RequestMapping("/pruebaInscripcion")
public class PruebaInscripcionController {
	
	@Autowired
	private PruebaInscripcionService inscripcionService;
	
	@PostMapping
	public ResponseEntity<PruebaInscripcion> save(@RequestBody PruebaInscripcion pruebaInscripcion){
		PruebaInscripcion result = inscripcionService.save(pruebaInscripcion);
		return new ResponseEntity<>(result,HttpStatus.CREATED);	
	}
	
	@PutMapping
	public ResponseEntity<PruebaInscripcion> modificar(@RequestBody PruebaInscripcion pruebaInscripcion) throws Exception{
		return new ResponseEntity<>(inscripcionService.update(pruebaInscripcion),HttpStatus.OK);
	}
	
	@GetMapping(value = "/listar")
	public ResponseEntity<List<PruebaInscripcion>> listar(){
		List<PruebaInscripcion> resultList = inscripcionService.getAll();
		return new ResponseEntity<List<PruebaInscripcion>>(resultList,HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> eliminar(@Param("eid") Long edi)throws Exception{
		inscripcionService.delete(edi);
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
