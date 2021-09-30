package Assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class ArrayTest {
Array obj = new Array();

@Test
public void TestInsert_Pos() {
	obj.getValues();
for(int i = 0 ; i < 5 ; i++){
obj.insert(i*3, i);
}
//obj.insert(10,5);
int [] earr = {0,3,6,9,12};
for(int i = 0 ; i < 5 ; i++) {
assertEquals(earr[i],obj.array[i]);
}
}
   @Test
   public void TestInsert_Neg() {
    for(int i = 0 ; i < 5 ; i++){
obj.insert(i*3, i);
}
//obj.insert(10,5);
int [] earr = {1,2,4,6,8};
for(int i = 0 ; i < 5 ; i++) {
assertNotEquals(earr[i],obj.array[i]);
}
}
   @Test
   public void TestDelete() {
    for(int i = 0 ; i < 5 ; i++){
obj.insert(i*3, i);
}
    obj.delete(0);
    int [] earr = {3,6,9,12};
    for(int i = 0 ; i < 4 ; i++)
    assertEquals(earr[i] ,obj.array[i]);
   }
   
   @Test
   public void TestDelete_Neg() {
    for(int i = 0 ; i < 5 ; i++){
obj.insert(i*3, i);
}
    obj.delete(0);
    int [] earr = {0,2,6,8};
    for(int i = 0 ; i < 4 ; i++)
    assertNotEquals(earr[i] ,obj.array);
   }
   
   @Test
   public void TestLinearSearch() {
    for(int i = 0 ; i < 5 ; i++){
obj.insert(i*3, i);
}
    boolean result = obj.linearSearch(12);
    assertEquals(true,result);
   }
   
   @Test
   public void TestLinearSearch_Neg() {
    for(int i = 0 ; i < 5 ; i++){
obj.insert(i*3, i);
}
    boolean result = obj.linearSearch(56);
    assertEquals(false,result);
   }
   
   @Test
   public void TestBubbleSort() {
    
    obj.insert(56, 0);
    obj.insert(23, 1);
    obj.insert(63, 2);
    obj.insert(10, 3);
    obj.insert(7, 4);

    obj.bubbleSort();
    int [] earr = {7,10,23,56,63};
    for(int i = 0 ; i < 5; i++)
    assertEquals(earr[i] , obj.array[i]);
   }

   @Test
   public void TestBubbleSortNeg() {
    obj.insert(4, 0);
    obj.insert(0, 1);
    obj.insert(8, 2);
    obj.insert(2, 3);
    obj.insert(6, 4);

    obj.bubbleSort();
    int [] earr = {0,4,2,8,6};
    for(int i = 0 ; i < 5; i++)
    assertNotEquals(earr[i] , obj.array);
   }
   
   @Test
   public void TestbinarySerach() {
    for(int i = 0 ; i < 5 ; i++){
obj.insert(i*3, i);
   }
   boolean result = obj.binarySearch(3,0,4);
   assertEquals(true,result);
   }
   
   @Test
   public void TestbinarySerachNeg() {
    for(int i = 0 ; i < 5 ; i++){
obj.insert(i*3, i);
   }
   boolean result = obj.binarySearch(5,0,4);
   assertEquals(false,result);
   }
   @Test
   public void TestDisplay() {
	   for(int i = 0 ; i < 5 ; i++){
		   obj.insert(i*3, i);}
	   obj.display();
	   int [] earr = {0,3,6,9,12};
	   for(int i = 0 ; i < 5 ; i++){
		   assertEquals(earr[i],obj.array[i]);
		   }
	   
   }
   @Rule
   public ExpectedException thrown = ExpectedException.none();
   @Test
   public void ExceptionTest() {
	   assertEquals(0, obj.array[56]);
       thrown.expect(NullPointerException.class);
       throw new NullPointerException();
   }
}
