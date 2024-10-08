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

import com.prueba.entity.PruebaEstudiante;
import com.prueba.service.PruebaEstudianteService;

@Controller
@RequestMapping("/pruebaEstudiante")
public class PruebaEstudianteController {
	
	@Autowired
	private PruebaEstudianteService estudianteService;
	
	@PostMapping
	public ResponseEntity<PruebaEstudiante> save(@RequestBody PruebaEstudiante pruebaEstudiante){
		PruebaEstudiante result = estudianteService.save(pruebaEstudiante);
		return new ResponseEntity<>(result,HttpStatus.CREATED);	
	}
	
	@PutMapping
	public ResponseEntity<PruebaEstudiante> modificar(@RequestBody PruebaEstudiante pruebaEstudiante) throws Exception{
		return new ResponseEntity<>(estudianteService.update(pruebaEstudiante),HttpStatus.OK);
	}
	
	@GetMapping(value = "/listar")
	public ResponseEntity<List<PruebaEstudiante>> listar(){
		List<PruebaEstudiante> resultList = estudianteService.getAll();
		return new ResponseEntity<List<PruebaEstudiante>>(resultList,HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<Void> eliminar(@Param("eid") Long edi)throws Exception{
		estudianteService.delete(edi);
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
