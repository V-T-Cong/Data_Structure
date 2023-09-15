public class EX3 {

	public static void main(String[] args) {
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

		myLinkedList.addFirst(12);
		myLinkedList.addFirst(9);
		myLinkedList.addFirst(12);
		myLinkedList.addFirst(21);
		myLinkedList.addFirst(10);
		myLinkedList.addFirst(11);
		myLinkedList.addFirst(56);
		myLinkedList.print();

		System.out.println(myLinkedList.evencountnumber());

	}
}
