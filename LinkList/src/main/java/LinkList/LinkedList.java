package LinkList;

public class LinkedList<E> {

	
	private E key;
	private LinkedList next;

	public LinkedList( E key)
	{
		this.key = null;
		this.setNext(null);
	}
//get method
	public LinkedList getNext() {
		return next;
	}
//set method
	public void setNext(LinkedList next) {
		this.next = next;
	}
}
