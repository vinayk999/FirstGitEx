package com.app.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="emptab2")
@PrimaryKeyJoinColumn(name="eid")
public class Employee extends Person {
	
	private double empSal;

	@Override
	public String toString() {
		return "Employee [empSal=" + empSal + "]";
	}

	public Employee() {
		super();
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


}
