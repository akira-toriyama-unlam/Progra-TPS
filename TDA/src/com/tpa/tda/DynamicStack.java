package com.tpa.tda;

import java.util.Arrays;

public class DynamicStack<T> implements Stack<T> {
	private static final int DEFAULT_CAPACITY = 10;
    private T[] store;
    private int size = 0;
    private int capacity;
    
    @SuppressWarnings("unchecked")
	public DynamicStack() { 
    	this.capacity = DEFAULT_CAPACITY; 
    	store = (T[]) new Object[DEFAULT_CAPACITY]; 
    } 

	@Override
	public boolean push(T value) {
		if(this.size >= store.length) {
			int newSize = size + (size >> 1);
			store = Arrays.copyOf(store, newSize);
		}
		store[size++] = value;
		return true;
	}
	
	@Override 
	public int size() { 
		return size; 
	}

	@Override
	public T pop() {
		if(size <= 0)
			return null;
		
		T value = store[--size];
		store[size] = null;
		
		int reducedSize = size;
		if(size >= capacity && size < (reducedSize + (reducedSize << 1))) {
			System.arraycopy(store,0,store,0,size);
		}
		
		return value;
	}
	@Override
	public T peek() {
		if(isEmpty()) return null;
		return store[size-1];

	}
	@Override
	public void empty() {
		for(int i = 0; i< size; i++) {
			store[i] = null;
		}
		size = 0;
	}
	@Override
	public boolean isEmpty() {
		return size == 0;
	}	
	
}
