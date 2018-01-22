import static org.junit.Assert.*;

import org.junit.Test;

public class SortedListTest {

	@Test
	public void testSize() {
		SortedList newList=new SortedList();
		newList.insertInOrder(1);
		assertEquals(newList.size(), 1);
	}
	
	@Test
	public void testInsert(){
		SortedList newList=new SortedList();
		newList.insertInOrder("a");
		newList.insertInOrder("c");
		newList.insertInOrder("b");
		for (char a : newList){
			
		}
		assertEquals(SortedList[1], "b");
	}


}
