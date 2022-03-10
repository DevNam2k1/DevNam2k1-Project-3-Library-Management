package com.project.library.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.library.model.Admin;
import com.project.library.repository.AdminRepository;
import com.project.library.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public List<Admin> getAllAdmin() {
		return (List<Admin>) adminRepository.findAll();
	}

	@Override
	public void addNew(Admin admin) {
		adminRepository.save(admin);
		
	}

	@Override
	public Admin saveAdmin(Admin admin) {
        adminRepository.save(admin);
        return admin;
	}

	@Override
	public void deleteAdmin(Long id) {
		adminRepository.deleteById(id);
		
	}

	@Override
	public Optional<Admin> findAdminById(Long id) {
		return adminRepository.findById(id);
	}

}
