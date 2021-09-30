package Assignment1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayTest.class, LinkedListTest.class, QueueLinkedListTest.class, QueueTest.class,
		StackLinkedListTest.class, StackTest.class })
public class AllTests {

}
