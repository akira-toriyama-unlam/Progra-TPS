package com.tpa.tda;

public class StaticStack<T> implements Stack<T> {
    private T[] store;
    private int top;
    private int capacity;
    
    @SuppressWarnings("unchecked")
	public StaticStack(int size) { 
    	this.capacity = size;
    	this.top = -1;
    	store = (T[]) new Object[size]; 
    } 

	@Override
	public boolean push(T value) {
		if(isFull()) return false;
		store[++top] = value;
		return true;
	}
	
	@Override 
	public int size() { 
		return top + 1; 
	}

	@Override
	public T pop() {
		if(isEmpty()) return null;
		return store[top--];
	}
	@Override
	public T peek() {
		if(isEmpty()) return null;
		return store[top];

	}
	@Override
	public void empty() {
		for(int i = 0; i< top + 1; i++) {
			store[i] = null;
		}
		top = -1;
	}
	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return (size() == capacity);
	}	

}
