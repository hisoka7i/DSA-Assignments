class DoublyCircularTest{
  public static void main(String[] args){
    DoublyCircular d1 = new DoublyCircular();
    d1.insertFirst(1);
    d1.insertFirst(2);
    d1.insertFirst(3);
    d1.insertLast(4);
    d1.deleteFirst();
    d1.displayAll();
  }
}
