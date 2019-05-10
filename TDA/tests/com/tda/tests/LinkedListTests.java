package com.tda.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.tpa.tda.CustomLinkedList;

public class LinkedListTests {

	CustomLinkedList<Integer> list;

	@Before
	public void before() {
		list = new CustomLinkedList<>();
	}

	@Test
	public void shouldBeEmptyAtStart() {
		Assert.assertEquals(true, list.isEmpty());
	}

	@Test
	public void shouldNotBeEmptyIfWeAddAnElement() {
		list.pushBack(3);
		Assert.assertEquals(false, list.isEmpty());
	}

	@Test
	public void shouldGetTheLastInsertedValue() {
		list.pushBack(3);
		Assert.assertEquals((Integer) 3, list.popBack());
	}

	@Test
	public void shouldGetTheLastInsertedValueAfterAddMultipleValues() {
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushBack(6);
		Assert.assertEquals((Integer) 6, list.popBack());
	}

	@Test
	public void shouldLetTheListEmptyAfterPopTheOnlyElement() {
		list.pushBack(3);
		list.popBack();
		Assert.assertEquals(true, list.isEmpty());
	}

	@Test
	public void shouldGetAllTheInsertedValuesAndLetTheListEmpty() {
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushBack(6);
		Assert.assertEquals((Integer) 6, list.popBack());
		Assert.assertEquals((Integer) 5, list.popBack());
		Assert.assertEquals((Integer) 4, list.popBack());
		Assert.assertEquals((Integer) 3, list.popBack());
		Assert.assertEquals(true, list.isEmpty());
	}

	@Test
	public void shouldInsertElementAtFirstPostion() {
		list.pushFront(3);
		Assert.assertEquals((Integer) 3, list.popFront());
	}

	@Test
	public void shouldGetAllElementFromStartToEndAndLetTheListEmpty() {
		list.pushFront(3);
		list.pushFront(2);
		list.pushFront(1);
		Assert.assertEquals((Integer) 1, list.popFront());
		Assert.assertEquals((Integer) 2, list.popFront());
		Assert.assertEquals((Integer) 3, list.popFront());
		Assert.assertEquals(true, list.isEmpty());
	}

	@Test
	public void shouldRemove() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushBack(3);
		list.remove(3);
		Assert.assertEquals((Integer) 3, list.popBack());
		Assert.assertEquals((Integer) 5, list.popBack());
		Assert.assertEquals((Integer) 4, list.popBack());
		Assert.assertEquals((Integer) 2, list.popBack());
		Assert.assertEquals((Integer) 1, list.popBack());
	}

	@Test
	public void shouldRemoveMultiple() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushBack(3);
		list.remove(3);
		list.remove(3);
		Assert.assertEquals((Integer) 5, list.popBack());
		Assert.assertEquals((Integer) 4, list.popBack());
		Assert.assertEquals((Integer) 2, list.popBack());
		Assert.assertEquals((Integer) 1, list.popBack());
	}

	@Test
	public void shouldReturnDefaultValueIfThereIsNoMatch() {
		Assert.assertEquals(-1, list.search(10));
	}

	@Test
	public void shouldReturnPositionIfItHasJustOneElement() {
		list.pushBack(10);
		Assert.assertEquals(0, list.search(10));
	}

	@Test
	public void shouldReturnPositionIfItHasMoreThanOneElement() {
		list.pushBack(10);
		list.pushBack(18);
		list.pushBack(7);
		list.pushBack(9);
		list.pushBack(11);
		Assert.assertEquals(2, list.search(7));
	}

	@Test
	public void shouldReturnFirstPositionFoundIfItHasMultipleRepetedElements() {
		list.pushBack(12);
		list.pushBack(18);
		list.pushBack(7);
		list.pushBack(9);
		list.pushBack(11);
		list.pushBack(9);
		Assert.assertEquals(3, list.search(9));
	}
	
	@Test
	public void shouldDoNothingIfTryToEraseWithNoElements() {
		list.eraseAt(0);
		Assert.assertEquals(0, list.size());
		Assert.assertEquals(true, list.isEmpty());
	}
	
	@Test
	public void shouldLetTheListEmptyIfEraseTheOnlyElement() {
		list.pushBack(10);
		list.eraseAt(0);
		Assert.assertEquals(0, list.size());
		Assert.assertEquals(true, list.isEmpty());
	}
	
	@Test
	public void shouldEraseTheFirstElement() {
		list.pushBack(10);
		list.pushBack(5);
		list.pushBack(3);
		list.pushBack(1);
		list.eraseAt(0);
		
		Assert.assertEquals((Integer) 1, list.popBack());
		Assert.assertEquals((Integer) 3, list.popBack());
		Assert.assertEquals((Integer) 5, list.popBack());
		Assert.assertEquals(0, list.size());
		Assert.assertEquals(true, list.isEmpty());
	}
	
	@Test
	public void shouldEraseTheLastElement() {
		list.pushBack(10);
		list.pushBack(5);
		list.pushBack(3);
		list.pushBack(1);
		list.eraseAt(3);
		
		Assert.assertEquals((Integer) 3, list.popBack());
		Assert.assertEquals((Integer) 5, list.popBack());
		Assert.assertEquals((Integer) 10, list.popBack());
		Assert.assertEquals(0, list.size());
		Assert.assertEquals(true, list.isEmpty());
	}
	
	@Test
	public void shouldEraseNodeAtRandomPosition() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		
		list.eraseAt(0);
		list.eraseAt(1);
		Assert.assertEquals((Integer) 5, list.popBack());
		Assert.assertEquals((Integer) 4, list.popBack());
		Assert.assertEquals((Integer) 2, list.popBack());
	}

	@Test
	public void shouldDoNothingIfItsAnInvalidPosition() {
		list.insertAt(40, 10);
		list.insertAt(-3, 10);
		Assert.assertEquals(0, list.size());
		Assert.assertEquals(true, list.isEmpty());
	}
	
	@Test
	public void shouldInsertAtPosition0WithEmptyList() {
		list.insertAt(0, 10);
		Assert.assertEquals((Integer) 10, list.popBack());
	}
	
	@Test
	public void shouldInsertAtTheEnd() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.insertAt(3, 4);
		Assert.assertEquals((Integer) 4, list.popBack());
		Assert.assertEquals(3, list.size());
	}
	
	@Test
	public void shouldInsertInTheMiddle() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(4);
		list.pushBack(5);
		list.insertAt(2, 3);
		Assert.assertEquals((Integer) 5, list.popBack());
		Assert.assertEquals((Integer) 4, list.popBack());
		Assert.assertEquals((Integer) 3, list.popBack());
		Assert.assertEquals((Integer) 2, list.popBack());
		Assert.assertEquals((Integer) 1, list.popBack());
	}
	
	@Test
	public void shouldSearcNodeInFirstAndLastPosition() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		
		Assert.assertEquals((Integer)1, list.searchAt(0));
		Assert.assertEquals((Integer)5, list.searchAt(4));
		Assert.assertEquals(null, list.searchAt(5));
	}
	
	
	
	/////////
	@Test
	public void shouldDoNothingIfTryToReverseAnEmptyList() {
		list.reverse();
		
		Assert.assertEquals(true, list.isEmpty());
		Assert.assertEquals(0, list.size());
	}
	
	@Test
	public void shouldReverseASingleElement() {
		list.pushBack(1);
		list.reverse();
		
		Assert.assertEquals(false, list.isEmpty());
		Assert.assertEquals(1, list.size());
		Assert.assertEquals((Integer) 1, list.popBack());
	}
	
	@Test
	public void shouldReverseTwoElements() {
		list.pushBack(1);
		list.pushBack(2);
		list.reverse();
		
		Assert.assertEquals(false, list.isEmpty());
		Assert.assertEquals(2, list.size());
		Assert.assertEquals((Integer) 1, list.popBack());
		Assert.assertEquals((Integer) 2, list.popBack());
	}
	
	@Test
	public void shouldReverseMoreThanTwoElements() {
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		
		
		list.reverse();
		Assert.assertEquals((Integer) 1, list.popBack());
		Assert.assertEquals((Integer) 2, list.popBack());
		Assert.assertEquals((Integer) 3, list.popBack());
		Assert.assertEquals((Integer) 4, list.popBack());
		Assert.assertEquals((Integer) 5, list.popBack());
	}
}
