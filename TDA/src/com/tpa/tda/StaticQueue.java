package com.tpa.tda;

import java.util.Vector;

public class StaticQueue<T> implements Queue<T> {
	private int end = -1;
	private int start = 0;
	private int maxItems;
	private Vector<T> vector; 
	
	public StaticQueue(int maxItems){
		this.maxItems = maxItems;
		this.vector = new Vector<T>(maxItems);
	}
	
	@Override
	public boolean offer(T value) {
		if(maxItems == this.vector.size()) {
			return false;
		}
		this.vector.add(value);
		this.end++;
		return (this.vector.size() == 2);
	}

	@Override
	public T poll() {
		if (isEmpty()) {
			return null;
		}

		return this.vector.elementAt(this.start++);		
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			return null;
		}
			return this.vector.elementAt(this.start);
	}

	@Override
	public void empty() {
		this.vector.clear();
		this.start = 0;
		this.end = -1;
	}

	@Override
	public boolean isEmpty() {
		return (this.end == -1 || this.start > this.end);
	}

	@Override
	public int size() {
		return this.vector.size();
	}

}
