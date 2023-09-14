public class Test {
	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(9);
		list.addFirst(11);
		list.addFirst(7);
		list.addFirst(12);
		list.print();

		System.out.println(list.findNodeWithData(12));
		Node<Integer> currnode = list.findNodeWithData(9);
		list.addAfter(currnode, 123);
		list.print();

		list.removeCurr(list.findNodeWithData(11));
		list.print();
	}
}