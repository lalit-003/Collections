package LinkList;

public class LinkedList<E> {

	
	private E key;
	private LinkedList next;

	public LinkedList( E key)
	{
		this.key = null;
		this.setNext(null);
	}

	public LinkedList getNext() {
		return next;
	}

	public void setNext(LinkedList next) {
		this.next = next;
	}
}
