package edu.century.pa2;

import java.util.Scanner;

import edu.century.pa2.collections.CourseCollection;
import edu.century.pa2.collections.StudentCollection;

public class Driver {

	public static void main(String[] args) {
		//Class Instance
		Student student = new Student();
		Course course = new Course();
		CourseCollection courselist = new CourseCollection();
		StudentCollection studentlist = new StudentCollection();
		//Read Input from user
		Scanner keyboard = new Scanner(System.in);
		int input;
		
		do {
		System.out.println("Choose number of desired choice");
		System.out.println("1. Add/Remove a student");
		System.out.println("2. Add/Remove course from a student");
		System.out.println("3. Display a specific student or all students");
		System.out.println("4. Search for a Student or Course");
		System.out.println("5. Quit");
		
		input = keyboard.nextInt();
		if (input == 1) {
			do {
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Back");
			input = keyboard.nextInt();
			
			if (input == 1) {
				//Add student to list
				System.out.println("Input Id then Name: ");
				System.out.println("Input Id: ");
				int sid = keyboard.nextInt();
				System.out.println("Input Name: ");
				String sname = keyboard.next();
				student.setId(sid);
				student.setName(sname);
				studentlist.add(student);
			}
			else if(input == 2) {
				//Remove student from list
				System.out.println("Enter a Students ID to Remove: ");
				int studid = keyboard.nextInt();
				studentlist.remove(studid);
			}
			else if(input == 3) {
				//Blocks Incorrect Input from showing up for option 3
			}
			else {
				System.out.println("Incorrect Input");
			}
			}while(input != 3);
		}
		else if (input == 2) {
			do {
				System.out.println("1. Add Course");
				System.out.println("2. Remove Course");
				System.out.println("3. Back");
				input = keyboard.nextInt();
				
				if(input == 1){
					//Add a course to a student
					System.out.println("Course Name: ");
					String cname = keyboard.next();
				
					System.out.println("GPA: ");
					double gpa = keyboard.nextDouble();
				
					System.out.println("Credits: ");
					int credit = keyboard.nextInt();
					
		
					courselist.add(new Course(cname, gpa, credit));
				}
				else if(input == 2) {
					//Remove a course from a student
					System.out.println("Input Course Name: ");
					String coursen = keyboard.next();
					courselist.remove(coursen);
				}
				else if(input == 3) {
					//Blocks Incorrect Input from showing up for option 3
				}
				else {
					System.out.println("Incorrect Input");
				}
				}while(input != 3);
		}
		else if (input == 3) {
			do {
				System.out.println("1. Display a Specific Student and Courses");
				System.out.println("2. Display all Students and Courses");
				System.out.println("3. Back");
				input = keyboard.nextInt();
				
			if(input == 1){
				//Displays specific student
				System.out.println("Input Student ID");
				int studid = keyboard.nextInt();
				studentlist.search(studid);
				
			}
			else if(input == 2) {
				// Displays all students
				System.out.println(studentlist.toString());
			}
			else if(input == 3) {
				//Blocks Incorrect Input from showing up for option 3
			}
			else {
				System.out.println("Incorrect Input");
			}
			}while(input != 3);
		}
		else if (input == 4) {
			do {
			System.out.println("1. Search for a Student by ID");
			System.out.println("2. Search for a course by Name");
			System.out.println("3. Back");
			input = keyboard.nextInt();
			
			if(input == 1){
				// Searches for a student by ID
				System.out.println("Input Student ID");
				int studid = keyboard.nextInt();
				studentlist.search(studid);
			}
			else if(input == 2) {
				//Searches for a course by name
				System.out.println("Input Course Name: ");
				String coursen = keyboard.next();
				courselist.search(coursen);
			}
			else if(input == 3) {
				//Blocks Incorrect Input from showing up for option 3
			}
			else {
				System.out.println("Incorrect Input");
			}
			}while(input != 3);
		}
		
		else if (input == 5) {
			System.out.println("Goodbye");
		}
		
		else {
			System.out.println("Incorrect Input");
		}
		
		}while(input != 5);
		
		
	}

	
}
