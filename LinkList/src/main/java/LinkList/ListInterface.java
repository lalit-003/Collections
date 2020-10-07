package LinkList;

public interface ListInterface<E> {

	E getKey();

	void setKey(E key);

	ListInterface<E> getNext();

	void setNext(ListInterface<E> next);

}
