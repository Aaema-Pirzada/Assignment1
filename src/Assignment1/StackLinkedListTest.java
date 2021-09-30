package Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackLinkedListTest {
	StackLinkedList obj = new StackLinkedList();

	@Before
	public void setUp() throws Exception {
		StackLinkedList obj = new StackLinkedList();
	}

	@After
	public void tearDown() throws Exception {
		obj=null;
	}

	@Test
	public void TestPush() {
		obj.display();
		obj.push(78);
		assertEquals(78,obj.head.key);
		obj.display();
		
	}

	@Test
	public void TestTop() {
		assertEquals(-1,obj.top());
	    obj.push(89);
	    obj.push(63);
	    assertEquals(63,obj.top());
	}
	
	@Test
	public void TestPop() {
		assertEquals(-1,obj.pop());
		obj.push(34);
		obj.push(63);
		assertEquals(63,obj.pop());
	}
   
	@Test
	public void TestSize() {
		obj.push(56);
		obj.push(58);
		assertEquals(2,obj.getSize());
	}
}
