package com.masai;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager();

		Student s1 = new Student("Ram", 1, "Java", 78);
		Student s2 = new Student("Shyam", 2, "React", 62);
		Student s3 = new Student("Geeta", 3, "Mern", 83);
		Student s4 = new Student("Sita", 4, "Python", 89);

		manager.addStudent(s1);
		manager.addStudent(s2);
		manager.addStudent(s3);
		manager.addStudent(s4);

		boolean running = true;

		System.out.println("Welcome to Student Management Console App");

		while (running) {
			System.out.println("\nChoose an option:");
			System.out.println("1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Search Student by Roll No");
			System.out.println("4. Update Marks");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				sc.nextLine(); // consume leftover newline
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Roll Number: ");
				int rollNo = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Course: ");
				String course = sc.nextLine();
				System.out.print("Enter Marks: ");
				int marks = sc.nextInt();

				Student student = new Student(name, rollNo, course, marks);
				manager.addStudent(student);
				break;

			case 2:
				manager.displayAllStudents();
				break;

			case 3:
				System.out.print("Enter Roll Number to search: ");
				int searchRoll = sc.nextInt();
				Student foundStudent = manager.searchStudentByRollNo(searchRoll);
				if (foundStudent != null) {
					foundStudent.displayDetails();
				} else {
					System.out.println("Student not found.");
				}
				break;

			case 4:
				System.out.print("Enter Roll Number to update marks: ");
				int updateRoll = sc.nextInt();
				Student updateStudent = manager.searchStudentByRollNo(updateRoll);
				if (updateStudent != null) {
					System.out.print("Enter new marks: ");
					int newMarks = sc.nextInt();
					updateStudent.updateMarks(newMarks);
				} else {
					System.out.println("Student not found.");
				}
				break;

			case 5:
				running = false;
				System.out.println("Exiting the application. Goodbye!");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		}

		sc.close();
	}
}