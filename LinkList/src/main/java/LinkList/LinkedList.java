package LinkList;

public class LinkedList<E> implements ListInterface<E> {

	private E key;
	private ListInterface<E> next;

	public LinkedList(E key) {
		this.key = null;
		this.setNext(null);
	}

//get method
	public LinkedList<E> getNext() {
		return (LinkedList<E>) next;
	}

//set method
	public void setNext(LinkedList<E> next) {
		this.next = next;
	}

	@Override
	public E getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(E key) {
		// TODO Auto-generated method stub
		this.key = key;
	}

	@Override
	public void setNext(ListInterface<E> next) {
		// TODO Auto-generated method stub
		this.next = next;
	}

	@Override 
	public String toString()
	{
		StringBuilder nodeInString = new StringBuilder();
		nodeInString.append("My Node has  "+"key =").append(key);
		if(next != null){
			nodeInString.append("->").append(next);
			
		}
		
	return nodeInString.toString();	
	}
}
