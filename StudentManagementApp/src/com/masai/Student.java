package com.masai;

class Student {
	String name;
	int rollNumber;
	String course;
	int marks;

	public Student(String name, int rollNumber, String course, int marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.course = course;
		this.marks = marks;
	}

	public void displayDetails() {
		System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Course: " + course + ", Marks: " + marks);
	}

	public void updateMarks(int newMarks) {
		this.marks = newMarks;
		System.out.println("Marks updated for Roll No: " + rollNumber);
	}

	public int getRollNumber() {
		return this.rollNumber;
	}
}
