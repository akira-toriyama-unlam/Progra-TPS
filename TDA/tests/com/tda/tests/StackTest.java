package com.tda.tests;

import org.junit.Assert;
import org.junit.Test;

import com.tpa.tda.DynamicStack;
import com.tpa.tda.StaticStack;

public class StackTest {
	
	// Dynamic Stack
	
	@Test
	public void shouldHaveNoSize() {
		DynamicStack<Integer> myStack = new DynamicStack<Integer>();
		Assert.assertEquals(0, myStack.size(),0);
	}
	
	@Test
	public void shouldBeEmpty() {
		DynamicStack<Integer> myStack = new DynamicStack<Integer>();
		Assert.assertEquals(true, myStack.isEmpty());
	}
	
	@Test
	public void shouldEmptyStack() {
		DynamicStack<Integer> myStack = new DynamicStack<Integer>();
		myStack.push(2);
		myStack.empty();
		Assert.assertEquals(true, myStack.isEmpty());
	}
	
	@Test
	public void shouldPushOneElementToStack() {
		DynamicStack<Integer> myStack = new DynamicStack<Integer>();
		myStack.push(2);
		Assert.assertEquals(1, myStack.size());
	}
	
	@Test
	public void shouldPopOneElementFromStack() {
		DynamicStack<Integer> myStack = new DynamicStack<Integer>();
		myStack.push(2);
		myStack.push(3);
		myStack.pop();
		Assert.assertEquals(1, myStack.size());
	}
	
	@Test
	public void shouldPeekTheLastElementFromStack() {
		DynamicStack<Integer> myStack = new DynamicStack<Integer>();
		myStack.push(2);
		myStack.push(3);
		Assert.assertEquals(3, (int) myStack.peek());
	}
	
	// Static Stack
	
	@Test
	public void shouldBeEmptyStaticStack() {
		StaticStack<Integer> myStack = new StaticStack<Integer>(10);
		Assert.assertEquals(true, myStack.isEmpty());
	}
	
	@Test
	public void shouldEmptyStaticStack() {
		StaticStack<Integer> myStack = new StaticStack<Integer>(5);
		myStack.push(2);
		myStack.empty();
		Assert.assertEquals(true, myStack.isEmpty());
	}
	
	@Test
	public void shouldPushOneElementToStaticStack() {
		StaticStack<Integer> myStack = new StaticStack<Integer>(5);
		myStack.push(2);
		Assert.assertEquals(1, myStack.size());
	}
	
	@Test
	public void shouldPopOneElementFromStaticStack() {
		StaticStack<Integer> myStack = new StaticStack<Integer>(5);
		myStack.push(2);
		myStack.push(3);
		myStack.pop();
		Assert.assertEquals(1, myStack.size());
	}
	
	@Test
	public void shouldPeekTheLastElementFromStaticStack() {
		StaticStack<Integer> myStack = new StaticStack<Integer>(5);
		myStack.push(2);
		myStack.push(3);
		Assert.assertEquals(3, (int) myStack.peek());
	}
	
	@Test
	public void shouldBeFullStaticStack() {
		StaticStack<Integer> myStack = new StaticStack<Integer>(1);
		myStack.push(2);
		Assert.assertEquals(true, myStack.isFull());
	}
}

