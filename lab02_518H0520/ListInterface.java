import java.util.NoSuchElementException;

public interface ListInterface<E> {
	public void addFirst(E item);
	public void addAfter(Node<E> curr, E item);
	public void addLast(E item);

	public E removeFirst() throws NoSuchElementException;
	public E removeAfter(Node<E> curr) throws NoSuchElementException;
	public E removeLast() throws NoSuchElementException;

	public Node<E> findNodeWithData(E item) throws NoSuchElementException;

	public void print();
	public boolean isEmpty();
	public E getFirst() throws NoSuchElementException;

	public Node<E> getHead();
	public int size();
	public boolean contains(E item);
	public E removeCurr(Node<E> curr);

	public int evencountnumber();
	public int primecountnumber();
	public void addbeforeFirstEven(E item)  throws NoSuchElementException;
	public int findmaxnumber();
}