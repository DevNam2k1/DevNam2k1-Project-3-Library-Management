package com.project.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "book_store")
public class BookStore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_store_id")
	private Long id;
	
	@NotBlank(message = "*Vui lòng nhập mã kho sách")
	@Column(name = "book_store_code", length = 10, nullable = false)
	private String bookStoreCode;
	
	@NotBlank(message = "*Vui lòng nhập tên kho sách")
	@Column(name = "book_store_name", length = 100, nullable = false)
	private String bookStoreName;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookStoreCode() {
		return bookStoreCode;
	}

	public void setBookStoreCode(String bookStoreCode) {
		this.bookStoreCode = bookStoreCode;
	}

	public String getBookStoreName() {
		return bookStoreName;
	}

	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "note", length = 100, nullable = false)
	private String note;
}
