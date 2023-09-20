public class MyQueue<E> extends MyLinkedList<E> implements QueueInterface<E> {

	@Override
	public void enQueue(E item){
		addLast(item);
	}

	public E deQueue() {
		return removeFirst();
	}

	@Override
	public E getFront() {
		return getFirst();
	}
}