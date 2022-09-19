package com.nazeem.spring.mongo.api.service;
import com.nazeem.spring.mongo.api.model.Ciudad;
import com.nazeem.spring.mongo.api.repository.CiudadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService {
	  @Autowired
	    private CiudadRepository ciudadrepository;

	    public String save(Ciudad ciudad){
	    	ciudadrepository.save(ciudad);
	        return ciudad.getId();
	    }
	    public Optional<Ciudad> findById(String id){
	        return ciudadrepository.findById(id);
	    }
	    public List<Ciudad> findByNombre(String nombre){
	
	    	List<Ciudad> Ciudad=ciudadrepository.findByNombre(nombre);
	    	return Ciudad;
	    }
	    public List<Ciudad> findAll(){
	        return ciudadrepository.findAll();
	    }
	    public void deleteById(String id){
	    	ciudadrepository.deleteById(id);
	    }
}
