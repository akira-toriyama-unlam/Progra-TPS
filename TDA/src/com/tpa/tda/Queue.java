package com.tpa.tda;

interface Queue<T> {
	public boolean push(T value); 
	public T pop();
	public T peek();
	public void empty(); 
	public boolean isEmpty();
	public int size();
}

