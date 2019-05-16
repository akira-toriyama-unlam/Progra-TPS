package com.tpa.tda;

import java.util.Arrays;

public class Heap {

	private static final int DEFAULT_CAPACITY = 10;
	private static final int ROOT = 1;
	private int[] array;
	private int size;

	@SuppressWarnings("unchecked")
	public Heap() {
		this.array = new int[DEFAULT_CAPACITY];
	}
	
	public int peek() {
		return this.array[ROOT];
	}
	
	public void add(int element) {
		if (size >= DEFAULT_CAPACITY) { 
			int newSize = size + (size >> 1);
			array = Arrays.copyOf(array, newSize);
        } 
		this.array[++size] = element;
		int currentElement = size;
		while (this.array[currentElement] < this.array[getParent(currentElement)]) {
			this.swap(currentElement, this.getParent(currentElement));
			currentElement = this.getParent(currentElement);
		}
	}
	
	public int remove() {
        int popped = array[ROOT]; 
        array[ROOT] = array[size--]; 
        heapify(ROOT);
        int reducedSize = size;
		if(size >= DEFAULT_CAPACITY && size < (reducedSize + (reducedSize << 1))) 
			array = Arrays.copyOf(array, reducedSize);
        return popped; 
	}
	
	private void swap(int i, int j) {
		int aux = this.array[i];
		this.array[i] = this.array[j];
		this.array[j] = aux;
	}
	
    private void heapify(int pos) { 
        if (!isLeaf(pos)) { 
            if (array[pos] > array[getLeftChild(pos)] 
                || array[pos] > array[getRightChild(pos)]) { 
  
                if (array[getLeftChild(pos)] < array[getRightChild(pos)]) { 
                    swap(pos, getLeftChild(pos)); 
                    heapify(getLeftChild(pos)); 
                } 
                else { 
                    swap(pos, getRightChild(pos)); 
                    heapify(getRightChild(pos)); 
                } 
            } 
        } 
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


    private boolean isLeaf(int pos) 
    { 
        if (pos >= (size / 2) && pos <= size) { 
            return true; 
        } 
        return false; 
    } 
	
	
}
