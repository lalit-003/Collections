package LinkList;


public class List_HeadNTail {

	public LinkedList head;
	public LinkedList tail;

	public List_HeadNTail() {
		this.head = null;
		this.tail = null;
	}

	public void add(LinkedList newNode) {
		// TODO Auto-generated method stub

		if (tail == null) {
			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			LinkedList tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}

	}
	public void append(LinkedList newNode) {
		// TODO Auto-generated method stub

		if (tail == null) {
			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}

	}
	
	
	// inserting between node1 and node next to node1 
	public void insertAfter(LinkedList node1,LinkedList newNode) {
		// TODO Auto-generated method stub

		if (tail == null) {
			this.tail = node1;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			LinkedList tempNode = node1.getNext() ;
			node1.setNext(newNode);
			newNode.setNext(tempNode);


		}
	}
	
	//delete first element/node and deleted element
	public LinkedList  pop() {
		// TODO Auto-generated method stub

		LinkedList tempNode = this.head;
		this.head = head.getNext();
		return tempNode;

		}
	

public LinkedList  lastPop() {
	// TODO Auto-generated method stub

	
	LinkedList tempNode = (LinkedList) this.head;
	while(!tempNode.getNext().equals(tail))
	{
		tempNode = tempNode.getNext();
	}
	this.tail = tempNode;
	tempNode = tempNode.getNext();
	return tempNode;

	}

public boolean  search(LinkedList searchElement) {
	// TODO Auto-generated method stub

	

	boolean flag =false;
	int position =0;
	
	LinkedList tempNode = this.head;
	while(true)
	{
		
		position++;
		if(tempNode.equals(searchElement))
		{
			flag = true;
			System.out.println("element found at position : "+position);
			break;
			
		}
		tempNode = tempNode.getNext();

	}
		return flag;

	}

}




	
	



//