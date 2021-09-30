package Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

	public class QueueTest {
		Queue obj = new Queue(3);
		@Before
		public void setUp() throws Exception {
			Queue obj = new Queue(3);
		}

		@After
		public void tearDown() throws Exception {
			obj=null;
		}
		
		@Test
		public void Enqueuetest() {
			obj.display();
			obj.enqueue(884);
			assertEquals(1,obj.addPointer);
			obj.enqueue(865);
			obj.enqueue(875);
			int [] earr={884,865,875};
			for(int i=0; i<3;i++)
				assertEquals(earr[i],obj.array[i]);
			obj.enqueue(56);
			obj.enqueue(3);
			obj.enqueue(98);
			obj.addPointer++;
			assertEquals(obj.addPointer,obj.array.length);
			obj.display();
		}
		
		@Test
		public void DequeueTest() {
			assertEquals(-1,obj.dequeue());
			obj.enqueue(23);
			obj.enqueue(16);
			obj.enqueue(79);
			obj.enqueue(103);
			assertEquals(23, obj.dequeue());
			assertEquals(16, obj.dequeue());
			assertEquals(79, obj.dequeue());
			assertEquals(-1, obj.dequeue());
			
			
		}
	}
