package edu.century.pa2.collections;

import edu.century.pa2.Student;
import edu.century.pa2.StudentNode;

public class StudentCollection implements Cloneable {
	private StudentNode head;
	private int numberOfNodes;

	public StudentCollection() {
		this.head = null;
	}

	public void add(Student element) {
		head = new StudentNode(element, head);
		numberOfNodes++;
	}

	public void search(int target) {
		StudentNode cursor = head;
		
			if (cursor.getData().getId() == target) {
				System.out.print(cursor);
			}
			else {
				System.out.println("Student Not Found");
			}
		}

	public boolean remove(int target) {

		StudentNode cursor;
		StudentNode precursor;

		for (cursor = head, precursor = null; cursor != null; precursor = cursor, cursor = cursor
				.getLink()) {
			if (cursor.getData().getId() == target) {
				if (precursor == null) {
					head = head.getLink();
					return true;
				}
				
				precursor.removeNodeAfter();
				numberOfNodes--;
				return true;
			}
		}

		return false;
	}



	@Override
	public String toString() {
		String info = "";
		StudentNode cursor;

		for (cursor = head; cursor != null; cursor = cursor.getLink()) {
			info += cursor.getData();

			if (cursor.getLink() != null)
				info += "-->";
		}

		return info;
	}

}
