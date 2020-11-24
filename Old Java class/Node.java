package edu.centuty.stacks;

public class Node<T> {
	
	private Node<T> link;
	private T data;
	
	
	public Node(Node<T> link, T data) {
		this.link = link;
		this.data = data;
	}


	public Node<T> getLink() {
		return link;
	}


	public void setLink(Node<T> link) {
		this.link = link;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}

	public void addFront(T data) {
		link = new Node(link, data);
	}
	
}
