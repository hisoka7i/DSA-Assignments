class Test{
  public static void main(String[] args){
    DoublyLinkedList dd = new DoublyLinkedList();
    dd.insertFirst();
    dd.insertAtLast();
    dd.insertAtPos();
    dd.displayAll();
    //System.out.println("Display in reverse:");
    //dd.deleteFirst();
    //dd.deleteLast();
    dd.deleteAtPos();
    dd.reverseDisplay();
  }
}
