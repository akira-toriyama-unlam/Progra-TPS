package com.tpa.tda;

public class CustomLinkedList<T> {

	private Node<T> firstElement;
	private int count;

	public CustomLinkedList() {
		this.count = 0;
	}

	/**
	 * Insert element at the end of the list
	 * 
	 * @param value
	 */
	public void pushBack(T value) {
		Node<T> newElement = new Node<T>(value);
		if (firstElement == null) {
			firstElement = newElement;
		} else {
			Node<T> aux = firstElement;
			while (aux.next != null) {
				aux = aux.next;
			}
			aux.next = newElement;
		}
		count++;
	}

	/**
	 * Returns the last element
	 * 
	 * @return
	 */
	public T popBack() {
		if (firstElement != null) {
			T aux;
			Node<T> current = firstElement;
			Node<T> previous = null;
			while (current.next != null) {
				previous = current;
				current = current.next;
			}
			aux = current.value;

			if (firstElement == current) {
				firstElement = null;
			} else {
				previous.next = null;
			}
			count--;

			return aux;
		}

		return null;

	}

	/**
	 * Insert element at the first position
	 * 
	 * @param value
	 */
	public void pushFront(T value) {
		Node<T> newElement = new Node<T>(value);
		if (firstElement != null) {
			newElement.next = firstElement;
		}
		firstElement = newElement;
		count++;
	}

	/**
	 * Returns the first element of the list
	 * 
	 * @return T
	 */
	public T popFront() {
		T aux;
		if (firstElement != null) {
			aux = firstElement.value;
			firstElement = firstElement.next;
			count--;
			return aux;
		}

		return null;
	}

	/**
	 * Remove the first match for value
	 * 
	 * @param value
	 */
	public void remove(T value) {
		Node<T> current = firstElement;
		Node<T> previous = null;
		while (current != null && current.value != value) {
			previous = current;
			current = current.next;
		}

		if (current == firstElement) {
			firstElement = null;
		} else {
			previous.next = current.next;
		}
		count--;
	}

	public void reverse() {
		// Da vuelta la lista
	}

	public void insertAt(int position, T value) {
		// Inserta valor en posición;
	}

	public void eraseAt(int position) {
		// Borra lo que hay en posición
	}

	/**
	 * Returns true if the list is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return firstElement == null;
	}

	/**
	 * Set the list empty
	 */
	public void empty() {
		this.firstElement = null;
	}

	/**
	 * If exists, returns the position of the given value
	 * 
	 * @param value
	 * @return
	 */
	public int search(T value) {
		int position = 0;
		Node<T> aux = firstElement;

		while (aux != null && aux.value != value) {
			aux = aux.next;
			position++;
		}

		if (aux != null) {
			return position;
		}

		return -1;
	}

	/**
	 * Returns value at position
	 * 
	 * @param position
	 * @return
	 */
	public T searchAt(int position) {
		if (position < count) {

		}

		return null;
	}

}

class Node<T> {
	T value;
	Node<T> next;

	public Node(T value) {
		this.value = value;
	}
}
