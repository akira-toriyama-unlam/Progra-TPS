package com.tda.tests;

import org.junit.Assert;
import org.junit.Test;


import com.tpa.tda.StaticQueue;

public class StaticQueueTests {

	
	@Test
	public void addItemsAndCount() {
		StaticQueue<Integer> myQueue = new StaticQueue<Integer>(10);
		myQueue.offer(1);
		myQueue.offer(2);
		myQueue.offer(3);
		
		Assert.assertEquals(3, myQueue.size());
		
	}
	
	@Test
	public void initialEmpy() {
		StaticQueue<Integer> myQueue = new StaticQueue<Integer>(10);
		Assert.assertEquals(true, myQueue.isEmpty());
	}
	
	@Test
	public void addItemsAndEmptyQueue() {
		StaticQueue<Integer> myQueue = new StaticQueue<Integer>(10);
		myQueue.offer(1);
		myQueue.offer(2);
		myQueue.offer(3);
		
		myQueue.empty();
		Assert.assertEquals(true, myQueue.isEmpty());
	}
	
	@Test
	public void addItemsAndGetFirst() {
		StaticQueue<Integer> myQueue = new StaticQueue<Integer>(10);
		myQueue.offer(1);
		myQueue.offer(2);
		myQueue.offer(3);
		
		
		Integer value = myQueue.peek();
		Assert.assertEquals(1, value.intValue());
		value = myQueue.peek();
		Assert.assertEquals(1, value.intValue());
		value = myQueue.peek();
		Assert.assertEquals(1, value.intValue());
	}
	
	@Test
	public void getItemsInOrder() {
		StaticQueue<Integer> myQueue = new StaticQueue<Integer>(10);
		myQueue.offer(1);
		myQueue.offer(2);
		myQueue.offer(3);
		
		
		Integer value = myQueue.poll();
		Assert.assertEquals(1, value.intValue());
		value = myQueue.poll();
		Assert.assertEquals(2, value.intValue());
		value = myQueue.poll();
		Assert.assertEquals(3, value.intValue());
		value = myQueue.poll();
		Assert.assertEquals(null, value);
	}
}
