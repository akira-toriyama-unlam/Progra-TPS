package com.tpa.tda;

interface Queue<T> {
	public boolean offer(T value); 
	public T poll();
	public T peek();
	public void empty(); 
	public boolean isEmpty();
	public int size();
}

