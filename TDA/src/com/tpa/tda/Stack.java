package com.tpa.tda;

interface Stack<T> {
	public boolean push(T value); 
	public T pop();
	public T peek();
	public void empty(); 
	public boolean isEmpty();
	public boolean isFull();
	public int size();
}

