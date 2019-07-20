package com.everis.bootcamp.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class StudentClassesPk implements Serializable{

	private int student_id;
	private int class_id;
	private Date date_from;
	
	   @Override
	    public int hashCode() {
	        int hash = 7;
	        hash = 59 * hash + Objects.hashCode(this.student_id);
	        hash = 59 * hash + Objects.hashCode(this.class_id);
	        hash = 59 * hash + Objects.hashCode(this.date_from);
	        return hash;
	    }
	   
	   @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final StudentClassesPk other = (StudentClassesPk) obj;
	        if (!Objects.equals(this.student_id, other.student_id)) {
	            return false;
	        }
	        if (!Objects.equals(this.class_id, other.class_id)) {
	            return false;
	        }
	        if (!Objects.equals(this.date_from, other.date_from)) {
	            return false;
	        }
	        return true;
	    }
	   
	   
//	   GET AND SET
	   
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
	   
}
