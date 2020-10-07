package LinkList;

import org.junit.Assert;
import org.junit.Test;

public class TestingLinkedList {

	// UC1 adding three integers//
	//test 1
	@Test
	public void addingThreeNumbers_ShouldPassSimpleAdditionTest() {
		LinkedList firstNode = new LinkedList(56);
		LinkedList secondNode = new LinkedList(30);
		LinkedList thirdNode = new LinkedList(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);

		boolean testCheck = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);

		Assert.assertTrue(testCheck);

	}

	//test 2
	//adding new element before head
	@Test
	public void Given3Numbers_InLinkedList_AddedToTop() {
		LinkedList firstNode = new LinkedList(70);
		LinkedList secondNode = new LinkedList(30);
		LinkedList thirdNode = new LinkedList(56);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.add(secondNode);
		Obj1.add(thirdNode);

	//	System.out.println(firstNode);
		
		boolean result = Obj1.head.equals(thirdNode) && Obj1.head.getNext().equals(secondNode)
				&& Obj1.tail.equals(firstNode);
		Assert.assertTrue(result);


	}
	
	//test 3
	 //adding new element after tail
	@Test
	public void Given3Numbers_InLinkedList_AddedTail() {
		LinkedList firstNode = new LinkedList(56);
		LinkedList secondNode = new LinkedList(30);
		LinkedList thirdNode = new LinkedList(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
		Obj1.append(thirdNode);

	//	System.out.println(firstNode);
		
		boolean result = Obj1.head.equals(firstNode) && Obj1.head.getNext().equals(secondNode)
				&& Obj1.tail.equals(thirdNode);
		Assert.assertTrue(result);


	}
	
	//test 4
	//inserting 70 between 56 and 30
	@Test
	public void Given3Numbers_InLinkedList_AddedInBetween() {
		LinkedList firstNode = new LinkedList(56);
		LinkedList secondNode = new LinkedList(30);
		LinkedList thirdNode = new LinkedList(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(thirdNode);
		Obj1.insertAfter(firstNode,secondNode);

		
		
		boolean result = Obj1.head.equals(firstNode) && Obj1.head.getNext().equals(secondNode)
				&& Obj1.tail.equals(thirdNode);
		Assert.assertTrue(result);


	}
	
	//test 5
	//deleting element at head
	@Test
	public void pop() {
		LinkedList firstNode = new LinkedList(56);
		LinkedList secondNode = new LinkedList(30);
		LinkedList thirdNode = new LinkedList(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
		Obj1.append(thirdNode);
	     LinkedList deletedElement = Obj1.pop();

	//	System.out.println("Deleted Element is " + deletedElement +" is successfully deleted");
		
		boolean result = Obj1.head.equals(secondNode) && Obj1.tail.equals(thirdNode);
		Assert.assertTrue(result);


	}
	
	//test 6
	//deleting element at tail
	@Test
	public void lastPop() {
		LinkedList firstNode = new LinkedList(56);
		LinkedList secondNode = new LinkedList(30);
		LinkedList thirdNode = new LinkedList(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
		Obj1.append(thirdNode);
	     LinkedList deletedElement =Obj1.lastPop();

	//	System.out.println("Deleted Element is " + deletedElement +"  & successfully deleted");
		
		boolean result = Obj1.head.equals(firstNode) && Obj1.tail.equals(secondNode);
		Assert.assertTrue(result);


	}
	
	//test 7
	//searching an element by passing an object
	@Test
	public void SearchElement() {
		LinkedList firstNode = new LinkedList(56);
		LinkedList secondNode = new LinkedList(30);
		LinkedList thirdNode = new LinkedList(70);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
		Obj1.append(thirdNode);
	     boolean result = Obj1.search(thirdNode);

		Assert.assertTrue(result);


	}
	
	//test 8
	//adding 40 after 30
	@Test
	public void AddingFourthNumberInBetween() {
		LinkedList firstNode = new LinkedList(56);
		LinkedList secondNode = new LinkedList(30);
		LinkedList thirdNode = new LinkedList(70);
		LinkedList fourthNode = new LinkedList(40);

		List_HeadNTail Obj1 = new List_HeadNTail();
		Obj1.add(firstNode);
		Obj1.append(secondNode);
        Obj1.append(thirdNode);
		
		Obj1.insertAfter(secondNode,fourthNode);

		
		
		boolean result = Obj1.head.equals(firstNode) && Obj1.head.getNext().equals(secondNode) && Obj1.head.getNext().getNext().equals(fourthNode)
				&& Obj1.tail.equals(thirdNode);
		Assert.assertTrue(result);


	}



}
