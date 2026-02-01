package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LibMember;

public interface LibRepository extends JpaRepository<LibMember, Long>{
	
}