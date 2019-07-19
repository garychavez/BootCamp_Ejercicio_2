package com.everis.bootcamp.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

//Create my table
@Entity
@Table(name = "StudentClasses")
public class StudentClasses implements Serializable {

	private static final long serialVersionUID = -556392024290150188L;

// Atributes
	// primary key
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int student_id;

	@Column(name = "class_id")
	private int class_id;

	@Column(name = "date_from")
	@NotBlank
	private Date date_from;

	@Column(name = "date_to")
	@NotBlank
	private Date date_to;

//	Generate Getters and Setters
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public Date getDate_from() {
		return date_from;
	}

	public void setDate_from(Date date_from) {
		this.date_from = date_from;
	}

	public Date getDate_to() {
		return date_to;
	}

	public void setDate_to(Date date_to) {
		this.date_to = date_to;
	}
	
	
}
