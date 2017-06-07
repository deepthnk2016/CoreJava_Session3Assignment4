package com.acadgild;

import java.util.Scanner;

/**
 * 
 * @author Deepak Main program to accept input for student details and marks
 */
public class StudentDemo {

	public static void main(String[] args) {
		// Variable declaration

		int studRollNo;
		String studName, studPhoneNumber, studSection;
		int studMarksPhysics, studMarksChemistry, studMarksMaths;

		// Instantiate StudentResultProcessing class
		StudentResultProcessing stud = new StudentResultProcessing();

		// Scanner object to accept input
		Scanner sc = new Scanner(System.in);

		// Accept roll number
		System.out.print("Enter Roll Number::");
		studRollNo = sc.nextInt();
		stud.setRollno(studRollNo);

		// Accept Name
		System.out.print("Enter Name::");
		studName = sc.next();
		stud.setName(studName);

		// Accept Phone Number
		System.out.print("Enter Phone Number::");
		studPhoneNumber = sc.next();
		stud.setPhoneno(studPhoneNumber);

		// Accept Section
		System.out.print("Enter Section::");
		studSection = sc.next();
		stud.setSection(studSection);

		// Accept Marks in Physics
		System.out.print("Enter Marks in Physics::");
		studMarksPhysics = sc.nextInt();

		// Accept Marks in Chemistry
		System.out.print("Enter Marks in Chemistry::");
		studMarksChemistry = sc.nextInt();

		// Accept Marks in Maths
		System.out.print("Enter Marks in Maths::");
		studMarksMaths = sc.nextInt();

		// Set the result
		stud.setResult(stud.result(studMarksPhysics, studMarksChemistry, studMarksMaths));

		// Display all the details
		stud.display();

		// Close scanner object
		sc.close();

	}

}
