class Test{
  public static void main(String[] args){
    CircularLinkedList c1 = new CircularLinkedList();
    c1.insertFirst(10);
    c1.insertLast(11);
    c1.insertFirst(12);
    c1.displayAll();
    c1.insertAtPos(2,23);
    System.out.println("Circular Linked List!!!");
    c1.displayAll();
    System.out.println("Revered Circular Linked List!!!");
    c1.reverse();
    c1.displayAll();

  }
}
