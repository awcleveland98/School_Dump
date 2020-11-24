package edu.century.pa2;

public class StudentNode {
	private Student data;
	private StudentNode link;
	
	public StudentNode(Student data, StudentNode link) {
		this.data = data;
		this.link = link;
	}

	public Student getData() {
		return data;
	}

	public void setData(Student data) {
		this.data = data;
	}

	public StudentNode getLink() {
		return link;
	}
	
	public void setLink(StudentNode link) {
		this.link = link;
	}

	public void removeNodeAfter() {
		link = link.link;
	}
	
	public void addNodeAfter(Student data) {
		link = new StudentNode(data, link);
	}
}