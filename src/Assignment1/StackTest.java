package Assignment1;
import org.junit.Rule;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StackTest {


	
	Stack obj = new Stack();
	@Before
	public void setUp() throws Exception {
		Stack obj = new Stack();
	}

	@After
	public void tearDown() throws Exception {
		obj=null;
	}

	@Test
	public void TestPush()  {
		obj.display();
		obj.push(59);
		assertEquals(1,obj.addPointer);
		for(int i=1; i<5; i++)
		{
			obj.push(i*2);
		}
		obj.display();
	     Assert.assertEquals(obj.addPointer, obj.array.length);
	     obj.push(54);
	     Assert.assertTrue(obj.addPointer>=obj.array.length);
	}
	
	
	@Test
	public void TestPop() {
		assertEquals(-1,obj.pop());
		obj.push(76);
		obj.push(90);
		assertEquals(90,obj.pop());
		assertEquals(1,obj.addPointer);
		assertEquals(1,obj.size);
	}

	@Test
	public void TestTop() {
		assertEquals(-1,obj.top());
		for(int i=0; i<3; i++)
		{
			obj.push(i*2);
		}
			assertEquals(0,obj.top());
		
	}
	@Test
	public void TestSize() {
		for(int i=0; i<5; i++)
		{
			obj.push(i*2);
		}
		assertEquals(6,obj.size());
		
	}
}
