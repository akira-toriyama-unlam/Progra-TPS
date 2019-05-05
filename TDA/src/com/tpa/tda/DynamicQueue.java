package com.tpa.tda;

public class DynamicQueue<T> implements Queue<T> {

	private Node<T> firstElement;
	private Node<T> lastElement;
	private int size;

    public DynamicQueue() {
		firstElement = lastElement = null;
		size = 0;
    }

	@Override
	public boolean push(T value) {
    	
    	if(firstElement == null) {
    		firstElement = lastElement = new Node<T>(value);
    	}
		else {
		    Node<T> temp = new Node<T>(value);
		    lastElement.next = temp;
		    lastElement = temp;
		}
		size++;
    	
		return true;
	}

	@Override
	public T pop() {
		if(firstElement == null) {
			return null;
		}
		T value = firstElement.value;
		firstElement = firstElement.next;
		size--;
		return value;
	}

	@Override
	public T peek() {
		return (firstElement == null) ? null : (T) firstElement.value;
	}

	@Override
	public void empty() {
		firstElement = lastElement = null;
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		return firstElement == null;
	}

	@Override
	public int size() {
		return size;
	}
	
	
}
