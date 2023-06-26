class CircularLinkedList{
  private Node head,tail;

  public CircularLinkedList(){
    head=null;
    tail=null;
  }

  public void insertFirst(int data){
    Node newNode = new Node(data);
    if(head==null){
      head=tail=newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
    tail.next = head;
  }

  public void insertLast(int data){
    insertFirst(data); //since insert first and insert last is the same.
  }

  public void insertAtPos(int pos, int data){
    Node newNode = new Node(data);
    Node temp = head;
    if(head==null){
      return;
    }
    int count = 1;
    if(pos==1){
      insertFirst(data);
    }
    while(count!=pos){
      temp = temp.next;
      count++;
      if(temp==head){
        return;
      }
    }
    newNode.next = temp.next;
    temp.next=newNode;
  }

  public void reverse(){
    Node current = head;
    Node previous = null;
    Node forward = null;
    do{
      forward=current.next;
    current.next=previous;
    previous=current;
    current=forward;
  }
    while(current!=head);
    head = previous;
    tail=current;
  }

  public void displayAll(){
    Node temp = head;
    while(temp.next!=head){
      temp.display();
      temp=temp.next;
    }
    if(temp==null)return;
    temp.display();
  }
}
