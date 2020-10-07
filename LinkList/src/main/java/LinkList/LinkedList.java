package LinkList;

public class LinkedList implements ListInterface {

	private int key;
	private ListInterface next;

	public LinkedList(int key) {
		this.key = 0;
		this.setNext(null);
	}

//get method
	public LinkedList getNext() {
		return (LinkedList) next;
	}

//set method
	public void setNext(LinkedList next) {
		this.next = next;
	}

	@Override
	public int getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(int key) {
		// TODO Auto-generated method stub
		this.key = key;
	}

	@Override
	public void setNext(ListInterface next) {
		// TODO Auto-generated method stub
		this.next = next;
	}

	
//	@Override 
//	public String toString()
//	{
//		StringBuilder nodeInString = new StringBuilder();
//		nodeInString.append("My Node has  "+"key =").append(key);
//		if(next != null){
//			nodeInString.append("->").append(next);
//			
//		}
//		
//	return nodeInString.toString();	
//	}
}
//