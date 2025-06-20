package com.masai;

import java.util.ArrayList;

class StudentManager {
	ArrayList<Student> students= new ArrayList<>();

	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student added successfully.\n");
	}

	public Student searchStudentByRollNo(int rollNo) {
		for (Student s : students) {
			if (s.getRollNumber() == rollNo) {
				return s;
			}
		}
		return null;
	}

	public void displayAllStudents() {
		if (students.isEmpty()) {
			System.out.println("No students found.");
		} else {
			System.out.println("\n--- All Students ---");
			for (Student s : students) {
				s.displayDetails();
			}
		}
	}
}