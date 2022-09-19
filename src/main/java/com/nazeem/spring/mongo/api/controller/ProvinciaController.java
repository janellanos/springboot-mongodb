package com.nazeem.spring.mongo.api.controller;

import java.util.List;
import java.util.Optional;

import com.nazeem.spring.mongo.api.repository.ProvinciaRepository;
import com.nazeem.spring.mongo.api.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nazeem.spring.mongo.api.model.Provincia;

@RestController
@RequestMapping("/provincia")
public class ProvinciaController {

	@Autowired
	private ProvinciaService provinciaService;

	@PostMapping("/add")
	public String saveProvincia(@RequestBody Provincia book) {
		String id  = provinciaService.save(book);
		return "Added provincia with id : " + id;
	}

	@GetMapping("/findAll")
	public List<Provincia> getProvincia() {
		return provinciaService.findAll();
	}

	@GetMapping("/findByCodigo/{codigo}")
	public List<Provincia> getCodigo( @PathVariable("codigo") String codigo) {
		return provinciaService.findByCodigo(codigo);
	}

	@GetMapping("/findAll/{id}")
	public Optional<Provincia> getProvincia(@PathVariable String id) {
		return provinciaService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProvincia(@PathVariable String id) {
		provinciaService.deleteById(id);
		return " provincia with id : " + id;
	}

}
