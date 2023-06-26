class LinkedArray{

  Node head;
  public LinkedArray(){
    head=null;
  }

  boolean isEmpty(){
    if(head==null){
      return true;
    }
    return false;
  }

  void push(int data){
    Node newNode = new Node(data);
    newNode.prev = head;
    head=newNode;
  }

  void pop(){
    if(isEmpty()){
      System.out.println("Under-flow condition");
      return;
    }
    head=head.prev;
  }

  void peek(){
    if(isEmpty()){
      System.out.println("Stack is empty:");
      return;
    }
    System.out.println(head.data);
  }
}
