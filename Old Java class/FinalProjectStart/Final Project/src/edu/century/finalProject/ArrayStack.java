package edu.century.finalProject;

import java.util.EmptyStackException;

public class ArrayStack<E> implements Cloneable {
	
	private Object[] data;
	private int manyItems;
	
	public ArrayStack() {
		final int initialCapacity = 10;
		manyItems = 0;
		data = new Object[initialCapacity];
	}
	
	public ArrayStack(int initialCapacity) {
		if (initialCapacity < 0) 
			throw new IllegalArgumentException
			("initialCapacity too small " + initialCapacity);
			manyItems = 0;
			data = new Object[initialCapacity];
		}
	
	@SuppressWarnings("unchecked")
	public ArrayStack<E> clone(){
		ArrayStack<E> answer;
		
		try
		{
			answer = (ArrayStack<E>) super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			throw new RuntimeException
			("This class does not implement Cloneable.");
		}
		
		answer.data = data.clone();
		return answer;
	}

	public void ensureCapacity(int minimumCapacity) {
		Object[] biggerArray;
		if (data.length < minimumCapacity) {
			biggerArray = new Object[minimumCapacity];
			System.arraycopy(data, 0, biggerArray, 0, manyItems);
			data = biggerArray;
		}
	}

	public int getCapacity() {
		return data.length;
	}

	public boolean isEmpty() {
		return (manyItems == 0);
	}

	@SuppressWarnings("unchecked")
	public E peek() {
		if (manyItems == 0)
			throw new EmptyStackException();
		return (E) data[manyItems-1];
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		E answer;
		if(manyItems == 0)
			throw new EmptyStackException();
		answer = (E) data[--manyItems];
		data[manyItems] = null;
		return answer;
	}

	public void push(E item) {
		if (manyItems == data.length) {
			ensureCapacity(manyItems * 2 + 1);
		}
		data[manyItems] = item;
		manyItems++;
	}

	public int size()
	{
		return manyItems;
	}

	public void trimToSize() {
		Object[] trimmedArray;
		
		if (data.length != manyItems) {
			trimmedArray = new Object[manyItems];
			System.arraycopy(data, 0, trimmedArray, 0, manyItems);
			data = trimmedArray;
		}
	}

}