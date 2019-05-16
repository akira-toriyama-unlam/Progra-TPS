package com.progra.heap;

public class Heap {

	private static final int DEFAULT_CAPACITY = 10;
	
	private int[] array;
	private int size;

	@SuppressWarnings("unchecked")
	public Heap() {
		this.array = new int[DEFAULT_CAPACITY];
	}
	
	public int peek() {
		return this.array[1];
	}
	
	public void add(int element) {
		this.array[++size] = element;
		int actualElement = size;
		while (this.array[actualElement] < this.array[getParent(actualElement)]) {
			this.swap(actualElement, this.getParent(actualElement));
			actualElement = this.getParent(actualElement);
		}
	}
	
	public void remove() {
		
	}
	
	private void swap(int i, int j) {
		int aux = this.array[i];
		this.array[i] = this.array[j];
		this.array[j] = aux;
	}

	private int getParent(int i) {
		return i / 2;
	}

	private int getLeftChild(int i) {
		return i * 2;
	}

	private int getRightChild(int i) {
		return i * 2 + 1;
	}

	
	
	
}
