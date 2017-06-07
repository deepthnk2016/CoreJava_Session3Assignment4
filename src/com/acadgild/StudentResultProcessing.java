package com.acadgild;

/**
 * 
 * @author Deepak StudentResultProcess inheriting Student class and displaying
 *         all the details
 */

public class StudentResultProcessing extends Student {

	public void display() {
		System.out.println("");
		System.out.println("Here are the Details::");
		System.out.println("----------------------------------------------------------");
		System.out.println("Roll Number:: " + this.getRollno());
		System.out.println("Name       :: " + this.getName());
		System.out.println("Phone No   :: " + this.getPhoneno());
		System.out.println("Section    :: " + this.getSection());
		System.out.println("Section    :: " + this.getResult());
		System.out.println("----------------------------------------------------------");

	}

}
