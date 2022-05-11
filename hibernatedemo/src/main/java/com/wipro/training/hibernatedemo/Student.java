package com.wipro.training.hibernatedemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Hibernate application to save a product object in DataBase
//Using Annotation Configuration-JPA

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int rollNumber;
	   
    String name,branch;
    double marks;
    
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
    
    

}
