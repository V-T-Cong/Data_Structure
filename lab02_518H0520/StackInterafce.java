public interface StackInterafce<E> {

	public void push(E item);
	public E pop();
	public E getPeek();
	public boolean constain(E item);

}