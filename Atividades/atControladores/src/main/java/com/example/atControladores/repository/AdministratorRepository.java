package com.example.atControladores.repository;

import com.example.atControladores.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository <Administrator, Long> {
    
} 

