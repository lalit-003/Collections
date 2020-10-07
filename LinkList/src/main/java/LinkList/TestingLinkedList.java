package LinkList;

import org.junit.Assert;
import org.junit.Test;

public class TestingLinkedList {

	// UC1 adding three integers
	@Test
	public void addingThreeNumbers_ShouldPassTest() {
		LinkedList<Integer> firstNode = new LinkedList<>(56);
		LinkedList<Integer> secondNode = new LinkedList<>(30);
		LinkedList<Integer> thirdNode = new LinkedList<>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);

		boolean testCheck = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);

		Assert.assertTrue(testCheck);

	}

	@Test
	public void Given3Numbers_InLinkedList_AddedToTop() {
		LinkedList<Integer> firstNode = new LinkedList<>(70);
		LinkedList<Integer> secondNode = new LinkedList<>(30);
		LinkedList<Integer> thirdNode = new LinkedList<>(56);

		List_HeadNTail<Integer> Obj1 = new List_HeadNTail<Integer>();
		Obj1.add(firstNode);
		Obj1.add(secondNode);
		Obj1.add(thirdNode);

		System.out.println(firstNode);
		
		boolean result = Obj1.head.equals(thirdNode) && Obj1.head.getNext().equals(secondNode)
				&& Obj1.tail.equals(firstNode);
		Assert.assertTrue(result);


	}
}
