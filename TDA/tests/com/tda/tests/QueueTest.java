package com.tda.tests;

import org.junit.Assert;
import org.junit.Test;

import com.tpa.tda.DynamicQueue;

public class QueueTest {

	@Test
	public void shouldBeEmptyInitially() {
		DynamicQueue<Integer> myQueue = new DynamicQueue<Integer>();
		Assert.assertEquals(true, myQueue.isEmpty());
	}

	@Test
	public void shouldEmpty() {
		DynamicQueue<Integer> myQueue = new DynamicQueue<Integer>();
		myQueue.offer(2);
		myQueue.empty();
		Assert.assertEquals(true, myQueue.isEmpty());
	}

	@Test
	public void shouldPushOneElementToQueue() {
		DynamicQueue<Integer> myQueue = new DynamicQueue<Integer>();
		myQueue.offer(2);
		Assert.assertEquals(1, myQueue.size());
	}

	@Test
	public void shouldPopFirstElementFromQueue() {
		DynamicQueue<Integer> myQueue = new DynamicQueue<Integer>();
		myQueue.offer(2);
		myQueue.offer(3);
		Integer value = myQueue.poll();
		Assert.assertEquals(1, myQueue.size());
		Assert.assertEquals(2, value.intValue());
	}

	@Test
	public void shouldPopMultipleElementsFromQueue() {
		DynamicQueue<Integer> myQueue = new DynamicQueue<Integer>();
		myQueue.offer(1);
		myQueue.offer(2);
		myQueue.offer(3);
		myQueue.offer(4);
		Integer value1 = myQueue.poll();
		Assert.assertEquals(1, value1.intValue());
		Integer value2 = myQueue.poll();
		Assert.assertEquals(2, value2.intValue());
		Integer value3 = myQueue.poll();
		Assert.assertEquals(3, value3.intValue());
		Integer value4 = myQueue.poll();
		Assert.assertEquals(4, value4.intValue());
	}

	@Test
	public void shouldPeekTheFirstElementFromQueue() {
		DynamicQueue<Integer> myQueue = new DynamicQueue<Integer>();
		myQueue.offer(2);
		myQueue.offer(3);
		Assert.assertEquals(2, myQueue.peek().intValue());
	}
}
