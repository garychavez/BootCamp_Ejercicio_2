package com.everis.bootcamp.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//Create my table
@Entity
@Table(name = "StudentClasses")
@IdClass(value = StudentClassesPk.class)
public class StudentClasses  {


// Atributes
	// composite key
	@ManyToOne
	@JoinColumn(name = "student_id", referencedColumnName = "student_id")
	@Id
	private Student student_id;

	@ManyToOne
	@JoinColumn(name = "class_id", referencedColumnName = "class_id")
	@Id
	private Classes class_id;

	@Column(name = "date_from")
	@Id
	private Date date_from;

	@Column(name = "date_to")
	@NotNull
	private Date date_to;
	
	
//	Generate Getters and Setters
	public Student getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Student student_id) {
		this.student_id = student_id;
	}

	public Classes getClass_id() {
		return class_id;
	}

	public void setClass_id(Classes class_id) {
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
