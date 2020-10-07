package LinkList;

public class List_HeadNTail<E> {

	public LinkedList<E> head;
	public LinkedList<E> tail;

	public List_HeadNTail() {
		this.head = null;
		this.tail = null;
	}

	public void add(LinkedList<E> newNode) {
		// TODO Auto-generated method stub

		if (tail == null) {
			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			LinkedList<E> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}

	}

}
