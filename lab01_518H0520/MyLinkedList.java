	import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ListInterface<E> {
	private Node<E> head;
	private int numNode;

	public MyLinkedList() {
		head = null;
		numNode = 0;
	}

	@Override
	public void addFirst(E item) {
		head = new Node<E>(item, head);
		numNode++;
	}

	@Override
	public void addLast(E item) {
		if (head == null) {
			addFirst(item);
		} else {
			Node<E> tmp = head;
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}
			Node<E> newNode = new Node<E>(item, null);
			tmp.setNext(newNode);
			numNode++;
		}
	}

	@Override
	public void addAfter(Node<E> curr, E item) {
		if (curr == null) {
			addFirst(item);
		} else {
			Node<E> newNode = new Node<E>(item, curr.getNext());
			curr.setNext(newNode);
			numNode++;
		}
	}

	@Override
	public E removeFirst() throws NoSuchElementException {
		if (head == null) {
			throw new NoSuchElementException("Can't remove element from an empty list");
		} else {
			Node<E> tmp = head;
			head = head.getNext();
			numNode--;
			return tmp.getData();
		}
	}

	@Override
	public E removeAfter(Node<E> curr) throws NoSuchElementException {
		if (curr == null) {
			throw new NoSuchElementException("Can't remove element from an empty list");
		} else {
			Node<E> delNode = curr.getNext();
			if (delNode != null) {
				curr.setNext(delNode.getNext());
				numNode--;
				return delNode.getData();
			} else {
				throw new NoSuchElementException("No next node to remove");
			}
		}
	}

	@Override
	public E removeLast() throws NoSuchElementException {
		if (head == null) {
			throw new NoSuchElementException("Can't remove element from an empty list");
		} else {
			Node<E> preNode = null;
			Node<E> delNode = head;
			if (delNode.getNext() == null) {
				return removeFirst();
			}
			while (delNode.getNext() != null) {
				preNode = delNode;
				delNode = delNode.getNext();
			}
			preNode.setNext(delNode.getNext());
			numNode--;
			return delNode.getData();
		}
	}

	@Override
	public E removeCurr(Node<E> curr) {
		if (head == null) {
			throw new NoSuchElementException("Cannot remove from an empty linked list");
		}
		if (head == curr) {
			head = head.getNext();
			return curr.getData();
		}
	
		Node<E> prevNode = head;
		Node<E> delNode = head.getNext();
	
		while (delNode != null) {
			if (delNode == curr) {
				// Found the current node, update the previous node to skip it
				prevNode.setNext(delNode.getNext());
				return curr.getData();
			}
			prevNode = delNode;
			delNode = delNode.getNext();
		}
		throw new NoSuchElementException("Current node not found in the linked list");
	}
	

	@Override
	public Node<E> findNodeWithData(E item) throws NoSuchElementException {
		Node<E> current = head;
		while(current != null) {
			if (current.getData().equals(item)) {
				return current;
			}
			current = current.getNext();
		}
		throw new NoSuchElementException("Item not found in the linked list");
	}

	@Override
	public void print() {
		if (head != null) {
			Node<E> tmp = head;
			System.out.print("List: " + tmp.getData());
			tmp = tmp.getNext();
			while (tmp != null) {
				System.out.print(" -> " + tmp.getData());
				tmp = tmp.getNext();
			}
			System.out.println();
		} else {
			System.out.println("List is empty!");
		}
	}

	@Override
	public boolean isEmpty() {
		if (numNode == 0)
			return true;
		return false;
	}

	@Override
	public E getFirst() throws NoSuchElementException {
		if (head == null) {
			throw new NoSuchElementException("Can't get element from an empty list");
		} else {
			return head.getData();
		}
	}

	@Override
	public Node<E> getHead() {
		return head;
	}

	@Override
	public int size() {
		return numNode;
	}

	@Override
	public boolean contains(E item) {
		Node<E> tmp = head;
		while (tmp != null) {
			if (tmp.getData().equals(item))
				return true;
			tmp = tmp.getNext();
		}
		return false;
	}

	@Override
	public int evencountnumber() {
		int count = 0;
		Node<E> temp = head;
		while (temp != null) {

			if (temp.getData() instanceof Integer) {
				int value = (Integer) temp.getData();
				if (value % 2 == 1) {
					count++;
				}
			}
			temp = temp.getNext();
		}
		return count;
	}

	@Override
	public int primecountnumber() {
		int count = 0;
		Node<E> temp = head;
		while (temp != null) {

			if (temp.getData() instanceof Integer) {
				int value = (Integer) temp.getData();

				if(checkprime(value)) {
					count ++;
				}
			}
			temp = temp.getNext();
		}
		return count;
	}
	
	public boolean checkprime(int number) {
		if (number <= 1) {
			return false;
		}
		
		if (number <= 3) {
			return true;
		}
		
		if (number % 2 == 0 || number % 3 == 0) {
			return false;
		}
		
		for (int i = 5; i * i <= number; i += 6) {
			if (number % i == 0 || number % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void addbeforeFirstEven(E item)  throws NoSuchElementException {
		if (head == null) {
			throw new NoSuchElementException("List is empty");
		}
	
		// If the first node is even, or there are no even numbers, add at the beginning.
		if (((Integer) head.getData()) % 2 == 0 || !containsEven()) {
			addFirst(item);
			return;
		}
	
		Node<E> prevNode = head;
		Node<E> currNode = head.getNext();
	
		while (currNode != null) {
			if (((Integer) currNode.getData()) % 2 == 0) {
				Node<E> newNode = new Node<>(item, currNode);
				prevNode.setNext(newNode);
				numNode++;
				return;
			}
			prevNode = currNode;
			currNode = currNode.getNext();
		}
	}
	
	// Helper method to check if the linked list contains even numbers.
	private boolean containsEven() {
		Node<E> current = head;
		while (current != null) {
			if (((Integer) current.getData()) % 2 == 0) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	@Override
	public int findmaxnumber() {
		if (head == null) {
			throw new NoSuchElementException("List is empty");
		}

		Node<E> tmp = head;
		int max = (Integer)tmp.getData();
		while (tmp != null) {
			if ((Integer)tmp.getData() > max) {
				max = (Integer)tmp.getData();
			}
			tmp = tmp.getNext();
		}
		return max;
	}
}