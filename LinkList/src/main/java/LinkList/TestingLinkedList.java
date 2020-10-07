package LinkList;

import org.junit.Assert;
import org.junit.Test;

public class TestingLinkedList {

	
	// UC1
	@Test
	public void addingThreeNumbers_ShouldPassTest()
	{
	LinkedList<Integer> firstNode =	new LinkedList<>(56);
	LinkedList<Integer> secondNode =	new LinkedList<>(30);
	LinkedList<Integer> thirdNode =	new LinkedList<>(70);
     firstNode.setNext(secondNode);
     secondNode.setNext(thirdNode);

     boolean testCheck = firstNode.getNext().equals(secondNode) &&
    		             secondNode.getNext().equals(thirdNode);
     
     Assert.assertTrue(testCheck);
    		 
	}
}
