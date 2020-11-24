package edu.century.pa2.collections;

import edu.century.pa2.Course;
import edu.century.pa2.StudentNode;

public class CourseCollection {

	private Course[] courses;
	private int count;
	
	public CourseCollection() {
		this.courses = null;
	}
	
	public CourseCollection(int size){
		this.courses = new Course[size];
	}
	
	public void add(Course course) {
	courses[count] = course;
	count ++;
	}
	
	public void remove(String target) {
		for (int i = 0; i < courses.length; i++) {
			if(target != null && target == courses[i].getName()) {
					courses[i] = null;
					count--;
					break;
				}	
			if(i == courses.length - 1) {
				System.out.println("Student Removed");
			}
			}
	}

	public void search(String target) {
		for (int i = 0; i < courses.length; i++) {
			if(target.equals(courses[i].getName())) {
				System.out.print(courses[i]);
				break;
			}
			else {
				System.out.println("Course Not Found");
			}
		}
	}

	@Override
	public String toString() {
		String data = "";
	for(int i =0; i < count; i++){
		data += courses[i].toString() + "\n";
	}
	return data;
	}
}
