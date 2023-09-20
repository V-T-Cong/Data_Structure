class TestDouble {

    public static void main(String[] args) {
        MyDoubleLinkedList list = new MyDoubleLinkedList();

        list.add(0.5);
        list.add(8.5);
        list.add(5.5);

        

        System.out.println("=============================");
        System.out.println("Size of list = " + list.size());
        System.out.println("=============================");

        list.print();
    }
}