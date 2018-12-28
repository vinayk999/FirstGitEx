package com.app.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="stdtab2")
@PrimaryKeyJoinColumn(name="sid")
public class Student extends Person{

	private String sloc;
	
	@Override
	public String toString() {
		return "Student [sloc=" + sloc + "]";
	}

	public Student() {
		super();
	}

	public String getSloc() {
		return sloc;
	}

	public void setSloc(String sloc) {
		this.sloc = sloc;
	}


}
