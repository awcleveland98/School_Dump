package edu.centuty.stacks;

import java.util.EmptyStackException;

import javax.sql.PooledConnection;

public class GenericStackLinkedList<T> {

	private Node<T> top;
	private int size;
	private int count;

	public GenericStackLinkedList() {
		this.size = 0;
		this.count = 0;
	}

	public void push(T number) {

		top = new Node(top, number);
		size++;

	}

	public T pop() {
		if (isEmpty())
			throw new EmptyStackException();

		T data = top.getData();
		top = top.getLink();
		size--;
		return data;
	}

	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();

		T data = top.getData();

		return data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public String toString() {
		String contents = "";
		Node<T> cursor;

		for (cursor = top; cursor != null; cursor = cursor.getLink()) {

			contents += "| " + cursor.getData() + " |\n";

		}
		contents += "  --\n";

		return contents;
	}

	public int size() {
		return count;
	}

}
