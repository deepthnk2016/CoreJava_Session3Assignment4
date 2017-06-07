package com.acadgild;

/**
 * 
 * @author Deepak
 * Student class to hold all the details of the students
 */

public class Student {
	// Data members declaration
	private int rollno;
	private String name;
	private String phoneno;
	private String section;
	private String result;

	// START - Setters and Getters
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	// END - Setters and Getters
	
	// Calculate result based on marks in Physics, Chemistry and Maths
	// Assuming 35 is the passing marks in all the subjects
	String result(int marksPhysics, int marksChemistry, int marksMaths) {

		if (marksPhysics < 35 || marksChemistry < 35 || marksMaths < 35) {
			this.setResult("Failed");
		} else {
			this.setResult("Pass");
		}

		return this.getResult();
	}
}
