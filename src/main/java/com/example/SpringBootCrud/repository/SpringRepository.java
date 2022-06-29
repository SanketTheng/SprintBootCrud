package com.example.SpringBootCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootCrud.model.ModelClass;

public interface SpringRepository extends JpaRepository<ModelClass, Integer>{

}
