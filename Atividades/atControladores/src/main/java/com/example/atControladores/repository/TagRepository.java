package com.example.atControladores.repository;

import com.example.atControladores.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository <Tag, Long> {
    
}
