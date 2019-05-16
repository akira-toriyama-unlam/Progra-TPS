package com.tda.tests;

import org.junit.Assert;
import org.junit.Test;

import com.tpa.tda.Heap;


public class HeapTests {
	
	@Test
	public void shouldGetTheMinimum() {
        Heap minHeap = new Heap(); 
        minHeap.add(9);
        minHeap.add(17); 
        minHeap.add(10); 
        minHeap.add(5);
        minHeap.add(84); 
        minHeap.add(6); 
        minHeap.add(22); 

		Assert.assertEquals(5, minHeap.peek());
	}
	
	@Test
	public void shouldRemoveTheMinimum() {
        Heap minHeap = new Heap(); 
        minHeap.add(9);
        minHeap.add(17); 
        minHeap.add(10); 
        minHeap.add(3);
        minHeap.add(84); 
		Assert.assertEquals(3, minHeap.remove());
	}

}
