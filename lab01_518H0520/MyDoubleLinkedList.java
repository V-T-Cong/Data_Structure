import java.util.NoSuchElementException;

public class MyDoubleLinkedList {
	private DoubleNode head;
    private DoubleNode tail;
    private int NumNode;

    public MyDoubleLinkedList() {
        head = null;
        tail = null;
        NumNode = 0;
    }

    // Add a node to the end of the list
    public void add(double data) {
        DoubleNode newNode = new DoubleNode(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    // Remove a node with the given data from the list
    public void remove(double data) {
        DoubleNode current = head;
        while (current != null) {
            if (current.getData() == data) {
                if (current == head) {
                    head = current.getNext();
                }
                if (current == tail) {
                    tail = current.getPrev();
                }
                if (current.getPrev() != null) {
                    current.getPrev().setNext(current.getNext());
                }
                if (current.getNext() != null) {
                    current.getNext().setPrev(current.getPrev());
                }
                return; // Found and removed the node
            }
            current = current.getNext();
        }
    }

    // Find a node with the given data and return its index (or -1 if not found)
    public int find(double data) {
        DoubleNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getData() == data) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1; // Data not found
    }

    // Print the elements of the list
    public void print() {
        DoubleNode current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public DoubleNode getHead() {
        return this.head;
    }

    public double getFirst() throws NoSuchElementException {
        if (this.head == null) {
            throw new NoSuchElementException("Can't get element from"
                    + " an empty list");
        } else {
            return this.head.getData();
        }
    }

    public boolean contains(double data) {
        DoubleNode currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return true;
            }

            currentNode = currentNode.getNext();
        }

        return false;
    }

    public int size() {
        return this.NumNode;
    }
}
