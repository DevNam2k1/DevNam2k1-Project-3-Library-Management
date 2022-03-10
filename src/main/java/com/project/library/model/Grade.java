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
@Table(name = "grade")
public class Grade {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gradeId", nullable = false) 
	private Long id;
	
	@NotBlank(message = "Please enter grade code")
    @Size(min = 3, max = 15)
    @Column(name = "gradeCode", length = 10, nullable = false)
	private String gradeCode;
	
    @NotBlank(message = "*Please enter grade name")
    @Column(name = "gradeName", length = 100, nullable = false)
	private String gradeName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGradeCode() {
		return gradeCode;
	}

	public void setGradeCode(String gradeCode) {
		this.gradeCode = gradeCode;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	
	
 	
	
	
	

}
