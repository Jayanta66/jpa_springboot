package com.jpa.jpaproject.bean;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Salary {
	
	@Id
	@GeneratedValue
	private long EMP_ID;
	private String MONTHS;
	private BigDecimal SALARY;
	public Salary() {
		super();
	}
	public Salary(int eMP_ID, String mONTHS, BigDecimal sALARY) {
		super();
		EMP_ID = eMP_ID;
		MONTHS = mONTHS;
		SALARY = sALARY;
	}
	public long getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(int eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getMONTHS() {
		return MONTHS;
	}
	public void setMONTHS(String mONTHS) {
		MONTHS = mONTHS;
	}
	public BigDecimal getSALARY() {
		return SALARY;
	}
	public void setSALARY(BigDecimal sALARY) {
		SALARY = sALARY;
	}
	@Override
	public String toString() {
		return "Salary [EMP_ID=" + EMP_ID + ", MONTHS=" + MONTHS + ", SALARY=" + SALARY + "]";
	}
	
	
	

}
