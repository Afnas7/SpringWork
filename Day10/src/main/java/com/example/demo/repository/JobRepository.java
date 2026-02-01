package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.JobSeeker;

public interface JobRepository extends JpaRepository<JobSeeker, Long>{
	
}