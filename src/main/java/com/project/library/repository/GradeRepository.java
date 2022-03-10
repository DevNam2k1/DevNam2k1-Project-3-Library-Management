package com.project.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.library.model.Grade;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long>{

}
