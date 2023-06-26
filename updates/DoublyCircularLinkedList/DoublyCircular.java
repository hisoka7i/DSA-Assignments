class DoublyCircular{
  Node head, tail;

  public DoublyCircular(){
    head=tail=null;
  }

  public void insertFirst(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=tail=newNode;
      newNode.next=tail;
      newNode.prev=head;
    }
    newNode.next = head;
    head.prev = newNode;
    newNode.prev = tail;
    head = newNode;
    tail.next = head;
  }

  public void insertLast(int data){
    insertFirst(data);
    head=head.next;
    tail=tail.next;
  }

  public void deleteFirst(){
    Node temp = head;
    head = head.next;
    head.prev = null;
    tail.next=null;
    tail.next = head;
    temp.prev = null;
    head.prev = tail;
  }


  public void displayAll(){
    Node temp = head;
    do{
      temp.display();
      temp=temp.next;
    }while(temp!=head);
  }
}
