package com.project.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "book_category")
public class BookCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_category_id")
	private Long id;
	
	@NotBlank(message = "*Vui lòng nhập mã loại sách")
	@Column(name = "book_category_code", length = 10, nullable = false)
	private String bookCategoryCode;
	
	@NotBlank(message = "*Vui lòng nhập loại sách")
	@Column(name = "book_category_name", length = 100, nullable = false)
	private String bookCategoryName;
	
	
	private String note;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookCategoryCode() {
		return bookCategoryCode;
	}
	public void setBookCategoryCode(String bookCategoryCode) {
		this.bookCategoryCode = bookCategoryCode;
	}
	public String getBookCategoryName() {
		return bookCategoryName;
	}
	public void setBookCategoryName(String bookCategoryName) {
		this.bookCategoryName = bookCategoryName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
}
