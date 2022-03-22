package com.project.library.service;

import java.util.List;
import java.util.Optional;

import com.project.library.model.Admin;


public interface AdminService {
	
    List<Admin> getAllAdmin();

    void  addNew(Admin admin);

    Admin saveAdmin(Admin admin);

    void deleteAdmin(Long id);

    Optional<Admin> findAdminById(Long id);
}