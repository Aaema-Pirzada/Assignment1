package Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QueueLinkedListTest {
	QueueLinkedList obj= new QueueLinkedList();

	@Before
	public void setUp() throws Exception {
		QueueLinkedList obj= new QueueLinkedList();	
	}

	@After
	public void tearDown() throws Exception {
	  obj=null;
	}

	@Test
	public void TestEnqueue() {
		obj.display();
		obj.enqueue(78);
		assertEquals(78,obj.head.key);
		obj.enqueue(98);
		obj.enqueue(798);
		int [] earr={78,98,798};
		for(int i=0; i<3;i++)
		{
			assertEquals(earr[i],obj.head.key);
			if(i<2)
				obj.head=obj.head.next;
		}
		obj.display();
	}

	@Test
	public void TestDequeue() {
		assertEquals(-1,obj.dequeue());
		obj.enqueue(79);
		obj.enqueue(33);
		obj.enqueue(56);
		assertEquals(79,obj.dequeue());
	}
}
