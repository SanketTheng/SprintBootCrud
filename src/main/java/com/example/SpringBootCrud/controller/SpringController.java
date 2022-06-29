package com.example.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootCrud.model.ModelClass;
import com.example.SpringBootCrud.service.SpringService;

@RestController
public class SpringController {
	
	
	
	@Autowired
	SpringService springService;
	
	//Create
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/addData")
	public ModelClass addData(@RequestBody ModelClass modelClass) {
		  return springService.addData(modelClass);
	}
	
	
	//Fetch
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/getData")
	public List<ModelClass> getData() {
		  return springService.getData();
	}
	
	//UPdate
	@PutMapping("/updateData")
	public ModelClass updateData(@RequestBody ModelClass modelClass) {
		 return springService.updateData(modelClass);
	}
	
	//Delete
	@CrossOrigin("http://localhost:4200")
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable int id) {
		  return springService.deleteData(id);
	}
	
	
	
	
	

}
