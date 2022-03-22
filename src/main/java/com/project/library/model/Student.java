package com.project.library.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentId", nullable = false)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "gradeId")
	private Grade grade;

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@NotBlank(message = "Please enter student code")
	@Column(name = "studentCode", length = 100, nullable = false)
	private String studentCode;

	@NotBlank(message = "*Please enter student name")
	@Column(name = "studentName", length = 100, nullable = false)
	private String studentName;

	@NotBlank(message = "*Please enter student address")
	@Column(name = "studentAddress", length = 100, nullable = false)
	private String studentAddress;

	@NotBlank(message = "*Please enter student phone")
	@Column(name = "studentPhone", length = 10, nullable = false)
	private Long studentPhone;

	@NotBlank(message = "*Please enter student birth")
	@Column(name = "studentBirth", length = 10, nullable = false)
	private Date studentBirth;

	@NotBlank(message = "*Please enter student genre")
	@Column(name = "studentGenre", nullable = false)
	private Boolean studentGenre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Long getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(Long studentPhone) {
		this.studentPhone = studentPhone;
	}

	public Date getStudentBirth() {
		return studentBirth;
	}

	public void setStudentBirth(Date studentBirth) {
		this.studentBirth = studentBirth;
	}

	public Boolean getStudentGenre() {
		return studentGenre;
	}

	public void setStudentGenre(Boolean studentGenre) {
		this.studentGenre = studentGenre;
	}

}
