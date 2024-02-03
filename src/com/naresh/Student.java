package com.naresh;

public class Student {

	private int studentId;
	private String studentName;
	private double avgOfMarks;
	private boolean isSelected;
	private char gender;
	
	

	public Student() {
		super();
		System.out.println("Student Construcotr with 0 args");
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting Stsudent ID ");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name  ");
		this.studentName = studentName;
	}

	public double getAvgOfMarks() {
		return avgOfMarks;
	}

	public void setAvgOfMarks(double avgOfMarks) {
		System.out.println("Setting Marks   ");
		this.avgOfMarks = avgOfMarks;
	}

	public boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(boolean isSelected) {
		System.out.println("Setting Selected or not ");
		this.isSelected = isSelected;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		System.out.println("Setting Gender  ");
		this.gender = gender;
	}

}
