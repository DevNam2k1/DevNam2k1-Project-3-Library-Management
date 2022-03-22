package com.project.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.library.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}