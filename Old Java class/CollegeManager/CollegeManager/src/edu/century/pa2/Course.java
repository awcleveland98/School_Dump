package edu.century.pa2;

public class Course implements Cloneable{
	
private String name;
private double gpa;
private int credits;

public Course() {
	this.name = "";
	this.gpa = 0;
	this.credits = 0;
}

public Course(String name, double gpa, int credits) {
	this.name = name;
	this.gpa = gpa;
	this.credits = credits;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getGpa() {
	return gpa;
}

public void setGpa(double gpa) {
	this.gpa = gpa;
}

public int getCredits() {
	return credits;
}

public void setCredits(int credits) {
	this.credits = credits;
}

@Override
public String toString() {
	return " " + name + " " + gpa + " " + credits;
}



}
