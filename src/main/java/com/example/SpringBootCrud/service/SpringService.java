package com.example.SpringBootCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootCrud.model.ModelClass;
import com.example.SpringBootCrud.repository.SpringRepository;

@Service
public class SpringService {

	@Autowired
	SpringRepository springRepository;
	
	//Create
	public ModelClass addData(ModelClass modelClass) {
		  return springRepository.save(modelClass);
	}
	
	//Fetch
	public List<ModelClass> getData() {
		  return springRepository.findAll();
	}
	
	//Update
	public ModelClass updateData(ModelClass modelClass) {
		  ModelClass excitingData=springRepository.findById(modelClass.getPid()).orElse(modelClass);
		  excitingData.setPid(modelClass.getPid());
		  excitingData.setPname(modelClass.getPname());
		  excitingData.setPdesc(modelClass.getPdesc());
		 return springRepository.save(modelClass);
		   
	}
		
	//Delete
	public String deleteData(int id) {
		  springRepository.deleteById(id);
		  return "product Removed"+id;
	}
		
		
	
	
}
