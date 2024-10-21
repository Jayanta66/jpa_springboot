package com.jpa.jpaproject.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long Emp_ID;
	private String EMP_NAME;
	private String DESIG;
	
	public Employee() {
		super();
	}

	public Employee(int emp_ID, String eMP_NAME, String dESIG) {
		super();
		Emp_ID = emp_ID;
		EMP_NAME = eMP_NAME;
		DESIG = dESIG;
	}

	public long getEmp_ID() {
		return Emp_ID;
	}

	public void setEmp_ID(int emp_ID) {
		Emp_ID = emp_ID;
	}

	public String getEMP_NAME() {
		return EMP_NAME;
	}

	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}

	public String getDESIG() {
		return DESIG;
	}

	public void setDESIG(String dESIG) {
		DESIG = dESIG;
	}

	@Override
	public String toString() {
		return "Employee [Emp_ID=" + Emp_ID + ", EMP_NAME=" + EMP_NAME + ", DESIG=" + DESIG + "]";
	}
	

	
	
	
	
}


