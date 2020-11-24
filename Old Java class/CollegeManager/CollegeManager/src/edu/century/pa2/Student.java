package edu.century.pa2;

import edu.century.pa2.collections.CourseCollection;

public class Student implements Cloneable{

	private String name;
	
	private int id;
	private CourseCollection courses;
	
	public Student() {
		this.name = "";
		this.id = 0;
		this.courses = null;
	}
	
	public Student(String Name, int id, CourseCollection courses) {
		this.name = Name;
		this.id = id;
		this.courses = courses;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public CourseCollection getCourses() {
		return courses;
	}

	public void setCourses(CourseCollection courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + courses;
	}
	
	
}
