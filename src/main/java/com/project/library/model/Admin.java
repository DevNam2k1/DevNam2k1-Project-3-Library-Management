package com.project.library.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "admin")
public class Admin {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminId", nullable = false) 
	private Long id;
	
	@NotBlank(message = "Please enter admin code")
    @Size(min = 3, max = 15)
    @Column(name = "adminCode", length = 10, nullable = false)
	private String adminCode;
	
    @NotBlank(message = "*Please enter admin name")
    @Column(name = "adminName", length = 100, nullable = false)
	private String adminName;
 	
    @NotBlank(message = "*Please enter admin phone")
    @Column(name = "adminPhone", length = 10, nullable = false)
	private Long adminPhone;
	
    @NotBlank(message = "*Please enter admin birth")
    @Column(name = "adminBirth", length = 10, nullable = false)
	private Date adminBirth;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public Long getAdminPhone() {
		return adminPhone;
	}

	public void setAdminPhone(Long adminPhone) {
		this.adminPhone = adminPhone;
	}

	public Date getAdminBirth() {
		return adminBirth;
	}

	public void setAdminBirth(Date adminBirth) {
		this.adminBirth = adminBirth;
	}

	

	public Long getId() {
		return id;
	}
	
	
	

}