import java.util.NoSuchElementException;

public class MyStack<E> extends MyLinkedList<E> implements StackInterafce<E> {

	@Override
	public void push(E item) {
		addFirst(item);
	}

	@Override
	public E pop() throws NoSuchElementException {
		return removeFirst();
	}

	@Override
	public E getPeek() {
		return getFirst();
	}

	@Override
	public int size() {
		return size();
	}

	@Override
	public boolean constain(E item) {
		return constain(item);
	}
}
