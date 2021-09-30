package Assignment1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.Parameterized;


public class LinkedListTest {

	LinkedList obj = new LinkedList();
	@Before
	public void setUp() throws Exception {
		LinkedList obj = new LinkedList();
	}

	@After
	public void tearDown() throws Exception {
		LinkedList obj = new LinkedList();
		obj.head=null;
	}


	@Test
	public void TestPushFront_Firstobj() {
		obj.pushFront(98);
        int ans=obj.head.key;
		assertEquals(98,ans);
		assertEquals(1,obj.size);
	}
	@Test
	public void TestPushFront() {
		//LinkedList obj = new LinkedList();
		obj.pushFront(98);
		obj.pushFront(56);
		obj.pushFront(79);
		obj.pushFront(26);
		obj.pushFront(24);
		int [] earr= {98,56,79,26,24};
		for(int i =4; i>=0; i--)
		{
			assertEquals(earr[i],obj.head.key);
			obj.head=obj.head.next;
		}
		assertEquals(5,obj.size);	
		
	}
	 
	@Test 
	public void TestPushBack_Firstobj() {
		obj.pushBack(123);
		assertEquals(123,obj.head.key);
		assertEquals(1,obj.size);
	}
	
	@Test
	public void TestPushBack() {
		//LinkedList obj = new LinkedList();
		obj.pushBack(98);
		obj.pushBack(56);
		obj.pushBack(79);
		obj.pushBack(26);
		obj.pushBack(24);
		obj.display();
		int [] earr= {98,56,79,26,24};
		for(int i =0; i<5; i++)
		{
			assertEquals(earr[i],obj.head.key);
			obj.head=obj.head.next;
		}
		assertEquals(5,obj.size);	
		
	}
	
	@Test
	public void TestPopFront() {
		obj.pushFront(98);
		obj.pushFront(56);
		obj.pushFront(79);
		obj.pushFront(24);
		assertEquals(4,obj.size);
		obj.popFront();
		assertEquals(3,obj.size);
		int [] earr= {79,56,98};
		    for(int i=0; i<3;i++)
		    {
		    	assertEquals(earr[i],obj.head.key);
		    	if(i<2)
		    	obj.head=obj.head.next;
		    }
		    obj.head=obj.head.next;
			assertEquals(null,obj.head);
			
	}
	
	@Test
	public void TestPopFront_NoObj() {
		obj.popFront();
		assertEquals(0,obj.size);
		assertEquals(null,obj.head);	
	}
	
	@Test
	public void TestPopBack_NoObj() {
		obj.pushFront(98);
		assertEquals(1,obj.size);
		obj.popBack();
		assertEquals(0,obj.size);
		assertEquals(null,obj.head);	
	}
	
	@Test
	public void TestPopBack_NoObj1() {
		obj.popBack();
		assertEquals(0,obj.size);
		assertEquals(null,obj.head);	
	}
	  
	@Test
	public void TestPopBack() {
		obj.pushFront(98);
		obj.pushFront(56);
		obj.pushFront(79);
		obj.pushFront(24);
		assertEquals(4,obj.size);
		obj.popBack();
		assertEquals(3,obj.size);
		int [] earr= {56,79,24};
		    for(int i=2; i>=0;i--)
		    {
		    	assertEquals(earr[i],obj.head.key);
		    	if(i>0)
		    	obj.head=obj.head.next;
		    }
		    obj.head=obj.head.next;
			assertEquals(null,obj.head);
			
	}
	
	@Test
	public void TestPop_atAnyPos() {
		obj.pushBack(98);
		obj.pushBack(56);
		obj.pushBack(79);
		obj.pushBack(26);
		obj.pushBack(24);
		obj.pop(0);
		assertEquals(56,obj.head.key);
		assertEquals(4,obj.size);
		obj.pop(2);
		assertEquals(3,obj.size);
		int [] earr={56,79,24};
		for(int i=0; i<3; i++) {
			assertEquals(earr[i],obj.head.key);
			if(i<3)
			obj.head=obj.head.next;
		}
		
			
	}	
	
	@Test
	public void testPop_headNull() {
		obj.pop(0);
		assertEquals(null,obj.head);
	}
	
		
	 @Rule
	   public ExpectedException thrown = ExpectedException.none();
	@Test(expected = NullPointerException.class)
    public void NullPointerTest() {
       obj.pop(0);
 	   assertEquals(null, obj.head.next);
 	   thrown.expect(NullPointerException.class);
 	   throw new NullPointerException();
 	   }
    }

