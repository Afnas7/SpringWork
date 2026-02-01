package com.example.demo.Repository;

import com.example.demo.Model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
    List<Phone> findByNameContainingIgnoreCase(String name);
}
